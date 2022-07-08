package entidade;

public class Funcionario {

	private String nome;
	private double salario;
	private Endereco enderecoResidencial;

	public Funcionario(String nome, double salario, Endereco enderecoResidencial) {
		this.nome = nome;
		this.salario = salario;
		this.enderecoResidencial = enderecoResidencial;
	}

	public double calcularPagamento() {
		return this.getSalario() - this.calcularDesconto();
	}
	
	private double calcularDesconto() {
		//TODO usar uma constante para o desconto
		return this.getSalario() * 0.15;
	}
	
	@Override
	public String toString() {
		return "Nome: " + this.nome + "\nSalário : R$" + this.salario;
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

	public Endereco getEnderecoResidencial() {
		return enderecoResidencial;
	}

	public void setEnderecoResidencial(Endereco enderecoResidencial) {
		this.enderecoResidencial = enderecoResidencial;
	}
}
