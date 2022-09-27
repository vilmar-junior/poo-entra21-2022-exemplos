package br.entra21.model.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.entra21.model.Banco;
import br.entra21.model.entidade.Pesquisador;
import br.entra21.model.entidade.Vacina;

public class PesquisadorRepository {

	//TODO criar métodos para 
	//Inserir, alterar e excluir
	
	public Pesquisador pesquisarPorId(int id) {
		Pesquisador pesquisadorBuscado = null;
		Connection conexao = Banco.getConnection();
		String sql = " SELECT * FROM PESQUISADOR WHERE ID = ? ";
		PreparedStatement stmt = Banco.getPreparedStatement(conexao, sql);
		try {
			stmt.setInt(1, id);
			ResultSet resultado = stmt.executeQuery();
			if(resultado.next()) {
				pesquisadorBuscado = new Pesquisador();
				pesquisadorBuscado.setId(resultado.getInt("id"));
				pesquisadorBuscado.setNome(resultado.getString("nome"));
				pesquisadorBuscado.setCpf(resultado.getString("cpf"));
				pesquisadorBuscado.setMatricula(resultado.getInt("matricula"));
				pesquisadorBuscado.setDataNascimento(resultado.getDate("data_nascimento"));
			}
		} catch (SQLException e) {
			System.out.println("Erro ao buscar pesquisador com id = " + id + " .\nCausa: "+ e.getMessage());
		} finally {
			Banco.closePreparedStatement(stmt);
			Banco.closeConnection(conexao);
		}
		return pesquisadorBuscado;
	}

	public ArrayList<Pesquisador> pesquisarTodos(){
		ArrayList<Pesquisador> pesquisadores = new ArrayList();
		
		Connection conexao = Banco.getConnection();
		String sql = " SELECT * FROM pesquisador ";
		PreparedStatement query = Banco.getPreparedStatement(conexao, sql);
		try {
			ResultSet resultado = query.executeQuery();
			
			while(resultado.next()) {
				Pesquisador pesquisador = new Pesquisador();
				pesquisador.setId(resultado.getInt("id"));
				pesquisador.setNome(resultado.getString("nome"));
				pesquisador.setMatricula(resultado.getInt("matricula"));
				pesquisador.setDataNascimento(resultado.getDate("data_nascimento"));
				
				pesquisadores.add(pesquisador);
			}
		} catch (SQLException e) {
			System.out.println("Erro ao buscar pesquisadores.\nCausa: "+ e.getMessage());
		} finally {
			Banco.closePreparedStatement(query);
			Banco.closeConnection(conexao);
		}
		
		return pesquisadores;
	}
}
