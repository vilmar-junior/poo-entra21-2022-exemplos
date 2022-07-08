package principal;

import entidade.Endereco;
import entidade.Gerente;

public class MinhaPrimeiraClasseJava {

	public static void main(String[] args) {
//		System.out.println("Olá");
		Endereco end1 = new Endereco("88032-000", "Rua 1", "100", 
				 "Centro", "Florianópolis", "SC");
		
		Gerente chefe = new Gerente("Juca da Silva", 0, end1);
		System.out.println(chefe);
		
//		System.out.println("Primeiro nome do grandioso líder: " 
//				+ chefe.getPrimeiroNome());
		
		
		//System.out.println("Percentual de comissão do gerente: " + Gerente.PERCENTUAL_COMISSAO);
		
		
//		int idade = 0;
//		char letra = 97;
//		
////		System.out.println("A idade atual é: " + idade);
//		//System.out.println("Depóis do ++: " + idade);
//		
//		System.out.println("Letra informada: " + letra );
		
	}

}
