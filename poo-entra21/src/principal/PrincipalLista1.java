package principal;

import entidade.Conta;

public class PrincipalLista1 {

	public static void main(String[] args) {
		//Crie uma conta chamada “conta1”
		//	com agência 123-7, 
		//	conta 12345-6 e saldo inicial de 300;
		double valorParaSacar = 250;
		
		Conta conta1 = new Conta("123-7", "12345-6", 300);
		
		System.out.println("Saldo da conta: R$" + conta1.getSaldo());
		
		double valorSacadoDeFato = conta1.sacar(valorParaSacar);
		
		System.out.println("Solicitado o saque de R$" + valorParaSacar);
		//Efetue um saque de 250 e mostre o valor sacado na tela;
		System.out.println("Sacado R$" + valorSacadoDeFato);
		System.out.println("Saldo da conta: R$" + conta1.getSaldo());
		
		//Efetue outro saque de 300 e mostre o valor sacado na tela;
		System.out.println("Solicitado o saque de R$300");
		System.out.println("Sacado R$" + conta1.sacar(300));
		System.out.println("Saldo da conta: R$" + conta1.getSaldo());
		
		//Faça um depósito de 200;
		System.out.println("Solicitado o depósito de R$200");
		conta1.depositar(200);
		System.out.println("Saldo da conta: R$" + conta1.getSaldo());
		
		//Faça um rendimento de 0.5%;
		System.out.println("Solicitado o rendimento de 0.5%");
		conta1.efetuarRendimento(0.5);
		System.out.println("Saldo da conta: R$" + conta1.getSaldo());
		
		//Faça um rendimento de 0.8%;
		System.out.println("Solicitado o rendimento de 0.8%");
		conta1.efetuarRendimento(0.8);
		System.out.println("Saldo da conta: R$" + conta1.getSaldo());
		
		//Mostre o valor do saldo atual na tela.
		
	}
}
