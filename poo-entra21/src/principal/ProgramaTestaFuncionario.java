package principal;

import java.util.Scanner;

import entidade.Funcionario;
import entidade.Gerente;

public class ProgramaTestaFuncionario {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		//System.out.println("Informe o nome do gerente:");
		//String nomeGerente = teclado.nextLine();
		
//		System.out.println("Informe o salário do gerente:");
//		double salarioGerente = teclado.nextDouble();
		
//		Gerente gerenteDaFirma = new Gerente(nomeGerente, salarioGerente);
		Gerente gerenteDaFirma = new Gerente("Luciano", 5000, "TI");
		Funcionario gerentePedro = new Gerente("Pedro", 1000, "RH");
		Funcionario funcionarioMaria = new Funcionario("Maria", 2000);
		
		
		Funcionario[] empregadosDaFirma = new Funcionario[5];
		empregadosDaFirma[0] = gerenteDaFirma;
		empregadosDaFirma[1] = gerentePedro;
		empregadosDaFirma[2] = funcionarioMaria;
		
		double totalFolha = 0;
		
		for (int i = 0; i < empregadosDaFirma.length; i++) {
			Funcionario funcionarioAtual = empregadosDaFirma[i];
			if(funcionarioAtual != null) {
				System.out.println("Funcionário atual: " + funcionarioAtual.getNome());
				totalFolha += funcionarioAtual.calcularPagamento();
			}
		}
		
		System.out.println("Total da folha: " + totalFolha);
		
		
		
		
//		System.out.println("O salário do gerente " + gerenteDaFirma.getNome()
//							+ " é: " + gerenteDaFirma.calcularPagamento());
//		
		
	}
}
