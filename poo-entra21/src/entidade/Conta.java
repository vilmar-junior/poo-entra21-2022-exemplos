package entidade;

public class Conta {
	//Atributos
	private String numeroAgencia;
	private String numeroConta;
	private double saldo;
	
	//Construtores
	public Conta() {
		//super();
	}

	public Conta(String numeroAgencia, String numeroConta, double saldo) {
		super();
		this.numeroAgencia = numeroAgencia;
		this.numeroConta = numeroConta;
		this.saldo = saldo;
	}

	//Métodos
	public double sacar(double valorSaque) {
		double valorSaqueEfetivo = 0;
		
		if(this.saldo >= valorSaque) {
			valorSaqueEfetivo = valorSaque;
		}else {
			valorSaqueEfetivo = this.saldo;
		}
		
		this.saldo = this.saldo - valorSaqueEfetivo;
			
		return valorSaqueEfetivo;		
	}
	
	public void depositar(double valorDeposito) {
		this.saldo += valorDeposito;
	}
	/**
	 * Atualiza do saldo da conta, aplicando percentual de rendimento
	 * informado
	 * 
	 * @param percentualRendimento o percentual (não dividir por 100)
	 */
	public void efetuarRendimento(double percentualRendimento) {
		double indiceRendimento = percentualRendimento / 100;
		
		//this.saldo = saldo * (1 + indiceRendimento);
		this.saldo += saldo * indiceRendimento;
	}
	
	//Getters e setters
	public String getNumeroAgencia() {
		return numeroAgencia;
	}

	public void setNumeroAgencia(String numeroAgencia) {
		this.numeroAgencia = numeroAgencia;
	}

	public String getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}

	public double getSaldo() {
		return saldo;
	}
}
