package model.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import model.Banco;
import model.entidade.Vacina;

public class VacinaRepository {
	
	public Vacina inserir(Vacina novaVacina) {
		//Conectar no banco
		
		//Obter o preparedStatement
		
		//Executar
		//INSERT INTO VACINA(...) VALUES (...)
		
		//Obter a chave gerada
		
		//Preencher a chave em novaVacina
		
		return novaVacina;
	}
	
	//Update
	public Vacina atualizar(Vacina vacina) {
		//TODO
		//UPDATE VACINA SET ESTAGIO_PESQUISA = 2
		//WHERE ID = 2;
		return vacina;
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
			System.out.println("Erro ao excluir vacina.\nCausa: " + e.getCause());
		}
		
		return excluiu;
	}
	
	//Retrieve
	public Vacina pesquisarPorId(int id) {
		//TODO
		//SELECT * FROM VACINA
		//WHERE ID = 2;
		
		return null;
	}
	
	public ArrayList<Vacina> pesquisarTodas(){
		//TODO
		//SELECT * FROM VACINA
		return null;
	}
	
}
