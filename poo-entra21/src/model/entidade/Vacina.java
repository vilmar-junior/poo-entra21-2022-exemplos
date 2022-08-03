package model.entidade;

import java.util.Date;

public class Vacina {

	//Atributos
	private int id;
	private String paisOrigem;
	private int estagioPesquisa;
	private Date dataInicioPesquisa;
	private String nomePesquisadorResponsavel;
	
	//Métodos
	
	//Getters e setters
	public String getPaisOrigem() {
		return paisOrigem;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setPaisOrigem(String paisOrigem) {
		this.paisOrigem = paisOrigem;
	}
	public int getEstagioPesquisa() {
		return estagioPesquisa;
	}
	public void setEstagioPesquisa(int estagioPesquisa) {
		this.estagioPesquisa = estagioPesquisa;
	}
	public Date getDataInicioPesquisa() {
		return dataInicioPesquisa;
	}
	public void setDataInicioPesquisa(Date dataInicioPesquisa) {
		this.dataInicioPesquisa = dataInicioPesquisa;
	}
	public String getNomePesquisadorResponsavel() {
		return nomePesquisadorResponsavel;
	}
	public void setNomePesquisadorResponsavel(String nomePesquisadorResponsavel) {
		this.nomePesquisadorResponsavel = nomePesquisadorResponsavel;
	}
}
