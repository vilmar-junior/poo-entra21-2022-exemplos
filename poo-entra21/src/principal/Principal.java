package principal;

import entidade.Pessoa;

public class Principal {

	public static void main(String[] args) {
		Pessoa pedro = new Pessoa();
		pedro.setNome("Pedro");
		pedro.setDataNascimento("15/08/2002");
		
		System.out.println("Idade: " + pedro.calcularIdade(2022));
	}
}
