package principal;

import entidade.Funcionario;
import entidade.Gerente;

public class ProgramaTestaFuncionario {

	public static void main(String[] args) {
		Gerente gerenteDaFirma = new Gerente("João", 1000);
		Funcionario funcionarioPedro = new Funcionario("Pedro", 1000);
		
		System.out.println("O salário do gerente " + gerenteDaFirma.getNome()
							+ " é: " + gerenteDaFirma.calcularPagamento());
		
		System.out.println("O salário do funcionário " + funcionarioPedro.getNome()
		+ " é: " + funcionarioPedro.calcularPagamento());
	}
}
