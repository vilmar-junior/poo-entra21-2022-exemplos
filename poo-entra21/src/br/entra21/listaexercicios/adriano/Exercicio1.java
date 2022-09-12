package br.entra21.listaexercicios.adriano;

public class Exercicio1 {

	public static void main(String[] args) {
		//1- criar o array que comporta até 10 inteiros
		//também funciona int numero[]
		int[] numeros = new int[10];
		
		//2- preencher o array
		numeros[0] = 2;
		numeros[1] = 12;
		numeros[2] = 15;
		
		//3- Mostrar na tela (console) os valores pares
		
		int totalPares = 0;
		for(int indiceArray = 0; indiceArray < numeros.length; indiceArray++) {
			int numeroAtual = numeros[indiceArray];
			int restoDivisaoPor2 = numeroAtual % 2;
			
			if(numeroAtual > 0 && restoDivisaoPor2 == 0) {
				totalPares++;
				System.out.println("Número par encontrado: " + numeroAtual);
			}
		}
		
		System.out.println("Total de números pares: " + totalPares);
	}

}
