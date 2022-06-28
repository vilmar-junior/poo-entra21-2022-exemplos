package entidade;

public class Pessoa {
	
	//Atributos
	private String nome;
	private String dataNascimento;
	private double alturaEmMetros;
	private char sexo;
	
	//Métodos
	public int calcularIdade(int anoAtual) {
		int idade = 0;
		
		//Assumir dd/MM/yyyy
		String anoNascimento = this.dataNascimento.substring(6);
		idade = anoAtual - Integer.valueOf(anoNascimento);
		
		return idade;
	}
	
	//Métodos getters e setters
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String novoNome) {
		this.nome = novoNome;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public double getAlturaEmMetros() {
		return alturaEmMetros;
	}

	public void setAlturaEmMetros(double alturaEmMetros) {
		this.alturaEmMetros = alturaEmMetros;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
}
