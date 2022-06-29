package entidade;

public class Funcionario {

	private String nome;
	private double salario;

	public Funcionario(String nome, double salario) {
		this.nome = nome;
		this.salario = salario;
	}

	public double calcularPagamento() {
		return this.getSalario() - this.calcularDesconto();
	}
	
	private double calcularDesconto() {
		//TODO usar uma constante para o desconto
		return this.getSalario() * 0.11;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
}
