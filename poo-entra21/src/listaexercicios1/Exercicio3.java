package listaexercicios1;

public class Exercicio3 {

	public static void main(String[] args) {
		int[] numeros = new int[10];
		
		numeros[0] = 1;
		numeros[1] = 13;
		numeros[2] = 19;
		
		//3- Mostrar na tela (console) os valores pares
		double mediaAritmeticaImpares = 0;
		int somaImpares = 0;
		int totalImpares = 0;
		for(int indiceArray = 0; indiceArray < numeros.length; indiceArray++) {
			int numeroAtual = numeros[indiceArray];
			int restoDivisaoPor2 = numeroAtual % 2;
			
			if(restoDivisaoPor2 == 1) {
				somaImpares = somaImpares + numeroAtual;
				totalImpares++;
			}
		}
		
		mediaAritmeticaImpares = ((double)somaImpares / (double)totalImpares);
		
		System.out.println("Média aritmética dos ímpares: " + mediaAritmeticaImpares);
	}

}
