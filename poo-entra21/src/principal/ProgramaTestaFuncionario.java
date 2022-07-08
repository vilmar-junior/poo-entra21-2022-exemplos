package principal;

import java.util.Scanner;

import entidade.Endereco;
import entidade.Funcionario;
import entidade.Gerente;

public class ProgramaTestaFuncionario {

	public static void main(String[] args) {
		
		Endereco ruaLegal = new Endereco();
		ruaLegal.setBairro("Limoeiro");
		ruaLegal.setNumero("10");
		ruaLegal.setCep("88495-000");
		
		Funcionario srCebola = new Funcionario("Cebolão", 5000, ruaLegal);

		//srCebola.setEndereco(ruaLegal);
		

		//	String cep, String logradouro, String numero, String bairro, 
		//String cidade, String estado) {

		Endereco endereco1 = new Endereco("88032-000", "Rua 1", "100", 
									 "Centro", "Florianópolis", "SC");
		
		Endereco endereco2 = new Endereco("88032-000", "Rua 2", "200", 
				 "Estreito", "Florianópolis", "SC");
		
		Scanner teclado = new Scanner(System.in);
		
		//System.out.println("Informe o nome do gerente:");
		//String nomeGerente = teclado.nextLine();
		
//		System.out.println("Informe o salário do gerente:");
//		double salarioGerente = teclado.nextDouble();
		
//		Gerente gerenteDaFirma = new Gerente(nomeGerente, salarioGerente);
		Gerente gerenteDaFirma = new Gerente("Luciano", 5000, "TI", endereco1);
		Funcionario gerentePedro = new Gerente("Pedro", 1000, "RH", endereco2);
		Funcionario funcionarioMaria = new Funcionario("Maria", 2000, null);
		
		
		Funcionario[] empregadosDaFirma = new Funcionario[5];
		empregadosDaFirma[0] = gerenteDaFirma;
		empregadosDaFirma[1] = gerentePedro;
		empregadosDaFirma[2] = funcionarioMaria;
		
		double totalFolha = 0;
		double totalFolhaSomenteGerentes = 0;
		
		for (int i = 0; i < empregadosDaFirma.length; i++) {
			Funcionario funcionarioAtual = empregadosDaFirma[i];
			if(funcionarioAtual != null) {
				System.out.println("Funcionário atual: " + funcionarioAtual.getNome());
				totalFolha += funcionarioAtual.calcularPagamento();
				
				if(funcionarioAtual instanceof Gerente) {
					totalFolhaSomenteGerentes += funcionarioAtual.calcularPagamento();
				}
			}
		}
		
		System.out.println("Total da folha: " + totalFolha);
		System.out.println("Total da folha dispendida com GERENTES: " 
								+ totalFolhaSomenteGerentes);
		
		
		
		
//		System.out.println("O salário do gerente " + gerenteDaFirma.getNome()
//							+ " é: " + gerenteDaFirma.calcularPagamento());
//		
		
	}
}
