package principal;

import entidade.Pessoa;

public class Principal {

	public static void main(String[] args) {
		Pessoa pedro = new Pessoa("Pedro de Lara", "01233311122");
		pedro.setDataNascimento("15/08/1802");
		
		System.out.println("Nome: " + pedro.getNome());
		
		System.out.println("Idade: " + pedro.calcularIdade(2022));
	}
}
