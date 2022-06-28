package entidade;

public class Vacina {

	//Atributos
	private String paisOrigem;
	private int estagioPesquisa;
	
	//TODO trocar para tipo data
	private String dataInicioPesquisa;
	private String nomePesquisadorResponsavel;
	
	
	//Métodos
	
	//Getters e setters
	public String getPaisOrigem() {
		return paisOrigem;
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
	public String getDataInicioPesquisa() {
		return dataInicioPesquisa;
	}
	public void setDataInicioPesquisa(String dataInicioPesquisa) {
		this.dataInicioPesquisa = dataInicioPesquisa;
	}
	public String getNomePesquisadorResponsavel() {
		return nomePesquisadorResponsavel;
	}
	public void setNomePesquisadorResponsavel(String nomePesquisadorResponsavel) {
		this.nomePesquisadorResponsavel = nomePesquisadorResponsavel;
	}
}
