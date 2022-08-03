package principal;

import java.util.ArrayList;
import java.util.Date;

import model.entidade.Pessoa;
import model.entidade.PessoaFisica;
import model.entidade.PessoaJuridica;

public class Principal {

	public static void main(String[] args) {
		Date dataNascimento = new Date(2000, 8, 30);
		PessoaFisica novaPessoa = new PessoaFisica("123", "Juca", dataNascimento, 1.75, 'M');
		
		System.out.println(novaPessoa.calcularIdade());
		
//		ArrayList<Pessoa> correntistas = new ArrayList<Pessoa>();
//		
//		PessoaFisica pedro = new PessoaFisica("Pedro de Lara", "01233311122");
//		pedro.setDataNascimento("15/08/1802");
//		
//		PessoaJuridica firma1 = new PessoaJuridica("A firma",
//				"22333333000011");
//		
//		correntistas.add(pedro);
//		correntistas.add(firma1);
//		
//		for(int i=0; i < correntistas.size(); i++) {
//			System.out.println("Apelido: " 
//						+ correntistas.get(i).getApelido());
//		}
	}
}
