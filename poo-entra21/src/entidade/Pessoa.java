package entidade;

public abstract class Pessoa {

	private String nome;
	private boolean adimplente;
	
	public Pessoa() {
		super();
		this.adimplente = true;
	}
	
	public Pessoa(String nome) {
		super();
		this.nome = nome;
		this.adimplente = true;
	}
	
	public abstract String getApelido();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public boolean isAdimplente() {
		return adimplente;
	}

	public void setAdimplente(boolean adimplente) {
		this.adimplente = adimplente;
	}
}
