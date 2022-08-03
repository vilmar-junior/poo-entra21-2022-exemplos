package model.repository;

import java.util.ArrayList;

import model.entidade.Vacina;

public class VacinaRepository {
	
	//CRUD
	//Create
	public Vacina inserir(Vacina novaVacina) {
		//TODO
		//INSERT INTO VACINA(...) VALUES (...)
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
		//TODO 
		/*  
		 * DELETE FROM VACINA
		   WHERE ID = 1;
		 * */
		return false;
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
