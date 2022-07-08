package entidade;

public class Gerente extends Funcionario {
	
	//Constantes
	public static final double PERCENTUAL_COMISSAO = 0.25; 
	
	//Atributos
	private String setor;
	
	public Gerente(String nome, double salario, Endereco end) {
		super(nome, salario, end);
	}
	
	public Gerente(String nome, double salario, String setor, Endereco end) {
		super(nome, salario, end);
		this.setor = setor;
	}
	
	
	
	public String getPrimeiroNome() {
		String primeiroNome = "Nome não informado";
		
		if(this.getNome() != null 
			&& this.getNome().trim().length() > 0) {
			primeiroNome = this.getNome().split(" ")[0];
		}
		
		return primeiroNome;
	}
	
	@Override
	public double calcularPagamento() {
		return super.calcularPagamento() + this.calcularComissao();
	}
	
	private double calcularComissao() {
		//Salário é o salário bruto
		return this.getSalario() * PERCENTUAL_COMISSAO;
	}

//	@Override
//	public String getNome() {
//		return super.getNome() + " (gerente do setor " + this.setor + ")";
//	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}
	
	@Override
	public String toString() {
		return "***** GERENTE *****\n" + super.toString() + "\nSetor: " + this.setor;
	}

}
