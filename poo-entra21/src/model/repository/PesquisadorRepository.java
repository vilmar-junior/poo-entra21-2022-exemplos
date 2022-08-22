package model.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.Banco;
import model.entidade.Pesquisador;
import model.entidade.Vacina;

public class PesquisadorRepository {

	//TODO criar métodos para 
	//Inserir, alterar e excluir
	
	public Pesquisador consultarPorId(int id) {
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
}
