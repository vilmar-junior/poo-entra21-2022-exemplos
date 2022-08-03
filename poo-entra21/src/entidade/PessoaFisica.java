package entidade;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.concurrent.TimeUnit;

public class PessoaFisica extends Pessoa {

	//Atributos
	private String cpf;
	private Date dataNascimento;
	private double alturaEmMetros;
	private char sexo;
	
	//Construtores
	public PessoaFisica() {
		
	}
	
	public PessoaFisica(String nomeDaPessoa, String cpf) {
		super(nomeDaPessoa);
		this.cpf = cpf;
	}
	
	public PessoaFisica(String cpf, String nome, Date dataNascimento, double alturaEmMetros, char sexo) {
		super(nome);
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
		this.alturaEmMetros = alturaEmMetros;
		this.sexo = sexo;
	}

	//Métodos
	public int calcularIdade() {
		this.dataNascimento = new Date();
		
		Calendar dateOfBirth = new GregorianCalendar();
		dateOfBirth.setTime(this.dataNascimento);

		// Cria um objeto calendar com a data atual
		Calendar today = Calendar.getInstance();

		// Obtém a idade baseado no ano

		int idade = today.get(Calendar.YEAR) - dateOfBirth.get(Calendar.YEAR);
		
		return idade;
	}
	
	@Override
	public String getApelido() {
		return this.getNome() + "zinho(a)";
	}
	
	//Métodos getters e setters
	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
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

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Override
	public String toString() {
		return "cpf=" + cpf + ", nome=" + getNome();
	}
	
	
}
