package principal;

import java.util.ArrayList;

import entidade.Pessoa;
import entidade.PessoaFisica;
import entidade.PessoaJuridica;

public class Principal {

	public static void main(String[] args) {
		ArrayList<Pessoa> correntistas = new ArrayList<Pessoa>();
		
		PessoaFisica pedro = new PessoaFisica("Pedro de Lara", "01233311122");
		pedro.setDataNascimento("15/08/1802");
		
		PessoaJuridica firma1 = new PessoaJuridica("A firma",
				"22333333000011");
		
		correntistas.add(pedro);
		correntistas.add(firma1);
		
		for(int i=0; i < correntistas.size(); i++) {
			System.out.println("Apelido: " 
						+ correntistas.get(i).getApelido());
		}
	}
}
