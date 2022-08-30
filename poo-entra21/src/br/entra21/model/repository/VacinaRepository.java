package br.entra21.model.repository;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.entra21.model.entidade.Pesquisador;
import br.entra21.model.entidade.Vacina;
import br.entra21.model.Banco;

public class VacinaRepository {
	
	public Vacina inserir(Vacina novaVacina) {
		Connection conexao = Banco.getConnection();
		
		String sql = " INSERT INTO VACINA(PAIS_ORIGEM, ESTAGIO_PESQUISA, "
					 + "                  DATA_INICIO_PESQUISA, ID_RESPONSAVEL) "
				     + " VALUES (?, ?, ?, ?) ";
		PreparedStatement query = Banco.getPreparedStatementWithPk(conexao, sql);
		try {
			query.setString(1, novaVacina.getPaisOrigem());
			query.setInt(2, novaVacina.getEstagioPesquisa());
			query.setDate(3, new java.sql.Date(novaVacina.getDataInicioPesquisa().getTime()));
			query.setInt(4, novaVacina.getResponsavel().getId());
			query.execute();
			
			ResultSet chavesGeradas = query.getGeneratedKeys();
			if(chavesGeradas.next()) {
				novaVacina.setId(chavesGeradas.getInt(1));
			}
		} catch (SQLException e) {
			System.out.println("Erro ao inserir vacina.\nCausa: " + e.getMessage());
		}finally {
			Banco.closePreparedStatement(query);
			Banco.closeConnection(conexao);
		}
		
		return novaVacina;
	}
	
	public boolean atualizar(Vacina vacina) {
		Connection conexao = Banco.getConnection();
		boolean atualizou = false;
		
		String sql = " UPDATE VACINA SET "
				   + " PAIS_ORIGEM = ?, ESTAGIO_PESQUISA = ?, "
				   + " DATA_INICIO_PESQUISA = ?, ID_RESPONSAVEL = ? "
				   + " WHERE ID = ? ";
		PreparedStatement query = Banco.getPreparedStatement(conexao, sql);
		
		try {
			query.setString(1, vacina.getPaisOrigem());
			query.setInt(2, vacina.getEstagioPesquisa());
			query.setDate(3, new java.sql.Date(vacina.getDataInicioPesquisa().getTime()));
			query.setInt(4, vacina.getResponsavel().getId());
			query.setInt(5, vacina.getId());
			
			int linhasAfetadas = query.executeUpdate();
			atualizou = linhasAfetadas > 0;
		} catch (SQLException e) {
			System.out.println("Erro ao atualizar vacina.\nCausa: " + e.getMessage());
		}finally {
			Banco.closePreparedStatement(query);
			Banco.closeConnection(conexao);
		}
		
		return atualizou;
	}
	
	//Delete
	public boolean excluir(int id) {
		boolean excluiu = false;
		
		//Conectar no banco
		Connection conexao = Banco.getConnection();
		String sql = " DELETE FROM VACINA "
				+ " WHERE ID = ? ";
		//Obter o preparedStatement
		PreparedStatement stmt = Banco.getPreparedStatement(conexao, sql);
		try {
			//Executar
			stmt.setInt(1, id);
			int registrosExcluidos = stmt.executeUpdate();
			excluiu = (registrosExcluidos > 0);
		} catch (SQLException e) {
			System.out.println("Erro ao excluir vacina.\nCausa: " + e.getMessage());
		} finally {
			Banco.closePreparedStatement(stmt);
			Banco.closeConnection(conexao);
		}
		
		return excluiu;
	}
	
	public Vacina pesquisarPorId(int id) {
		Vacina vacinaBuscada = null;
		Connection conexao = Banco.getConnection();
		String sql = " SELECT * FROM VACINA WHERE ID = ? ";
		PreparedStatement stmt = Banco.getPreparedStatement(conexao, sql);
		try {
			stmt.setInt(1, id);
			ResultSet resultado = stmt.executeQuery();
			if(resultado.next()) {
				vacinaBuscada = new Vacina();
				vacinaBuscada.setId(resultado.getInt("id"));
				vacinaBuscada.setEstagioPesquisa(resultado.getInt("estagio_pesquisa"));
				vacinaBuscada.setPaisOrigem(resultado.getString("pais_origem"));
				vacinaBuscada.setDataInicioPesquisa(resultado.getDate("data_inicio_pesquisa"));
				
				int idResponsavel = resultado.getInt("id_responsavel");
				PesquisadorRepository pesquisadorRepository = new PesquisadorRepository();
				Pesquisador responsavelBuscado = pesquisadorRepository.pesquisarPorId(idResponsavel);
				
				vacinaBuscada.setResponsavel(responsavelBuscado);
			}
		} catch (SQLException e) {
			System.out.println("Erro ao buscar vacina com id = " + id + " .\nCausa: "+ e.getMessage());
		} finally {
			Banco.closePreparedStatement(stmt);
			Banco.closeConnection(conexao);
		}
		return vacinaBuscada;
	}
	
	
	public ArrayList<Vacina> pesquisarTodas(){
		ArrayList<Vacina> vacinas = new ArrayList();
		
		Connection conexao = Banco.getConnection();
		String sql = " SELECT * FROM vacina ";
		PreparedStatement query = Banco.getPreparedStatement(conexao, sql);
		try {
			ResultSet resultado = query.executeQuery();
			
			while(resultado.next()) {
				Vacina vacinaBuscada = new Vacina();
				vacinaBuscada.setId(resultado.getInt("id"));
				vacinaBuscada.setEstagioPesquisa(resultado.getInt("estagio_pesquisa"));
				vacinaBuscada.setPaisOrigem(resultado.getString("pais_origem"));
				vacinaBuscada.setDataInicioPesquisa(resultado.getDate("data_inicio_pesquisa"));
				
				int idResponsavel = resultado.getInt("id_responsavel");
				PesquisadorRepository pesquisadorRepository = new PesquisadorRepository();
				Pesquisador responsavelBuscado = pesquisadorRepository.pesquisarPorId(idResponsavel);
				
				vacinaBuscada.setResponsavel(responsavelBuscado);
				
				vacinas.add(vacinaBuscada);
			}
		} catch (SQLException e) {
			System.out.println("Erro ao buscar vacinas.\nCausa: "+ e.getMessage());
		} finally {
			Banco.closePreparedStatement(query);
			Banco.closeConnection(conexao);
		}
		
		return vacinas;
	}
	
	
	public List<Vacina> pesquisarPorIdResponsavel(int idResponsavel){
		List<Vacina> vacinasDoPesquisador = new ArrayList<Vacina>();
		Vacina vacinaBuscada = null;
		Connection conexao = Banco.getConnection();
		String sql = " SELECT * FROM VACINA WHERE ID_RESPONSAVEL = ? ";
		PreparedStatement stmt = Banco.getPreparedStatement(conexao, sql);
		try {
			stmt.setInt(1, idResponsavel);
			ResultSet resultado = stmt.executeQuery();
			if(resultado.next()) {
				vacinaBuscada = new Vacina();
				vacinaBuscada.setId(resultado.getInt("id"));
				vacinaBuscada.setEstagioPesquisa(resultado.getInt("estagio_pesquisa"));
				vacinaBuscada.setPaisOrigem(resultado.getString("pais_origem"));
				vacinaBuscada.setDataInicioPesquisa(resultado.getDate("data_inicio_pesquisa"));
				
				PesquisadorRepository pesquisadorRepository = new PesquisadorRepository();
				Pesquisador responsavelBuscado = pesquisadorRepository.pesquisarPorId(idResponsavel);
				
				vacinaBuscada.setResponsavel(responsavelBuscado);
				vacinasDoPesquisador.add(vacinaBuscada);
			}
		} catch (SQLException e) {
			System.out.println("Erro ao buscar vacinas do pesquisador = " + idResponsavel + " .\nCausa: "+ e.getMessage());
		} finally {
			Banco.closePreparedStatement(stmt);
			Banco.closeConnection(conexao);
		}
		return vacinasDoPesquisador;
	}
	
}
