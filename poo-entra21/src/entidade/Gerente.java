package entidade;

public class Gerente extends Funcionario {
	
	public Gerente(String nome, double salario) {
		super(nome, salario);
	}
	
	@Override
	public double calcularPagamento() {
		return super.calcularPagamento() + this.calcularComissao();
	}

	private double calcularComissao() {
		//TODO usar uma constante para o desconto
		return this.getSalario() * 0.25;
	}
}
