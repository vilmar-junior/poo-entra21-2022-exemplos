package br.entra21.model.entidade;

import java.util.Date;

public class Vacina {

	//Atributos
	private int id;
	private String paisOrigem;
	private int estagioPesquisa;
	private Date dataInicioPesquisa;
	private Pesquisador responsavel;
	
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
	public Pesquisador getResponsavel() {
		return responsavel;
	}
	public void setResponsavel(Pesquisador responsavel) {
		this.responsavel = responsavel;
	}
	@Override
	public String toString() {
		return "Vacina [id=" + id + ", paisOrigem=" + paisOrigem + ", estagioPesquisa=" + estagioPesquisa
				+ ", dataInicioPesquisa=" + dataInicioPesquisa + ", responsavel=" + responsavel + "]";
	}
}
