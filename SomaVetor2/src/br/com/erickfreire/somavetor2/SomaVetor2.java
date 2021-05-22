package br.com.erickfreire.somavetor2;

/**
 * Programa em Java que calcula a soma de um vetor
 * @author Erick Freire
 * @version 1 - Criado em 22-05-2021 as 18:38
 */

public class SomaVetor2 {

	public static void main(String[] args) {
		
		int[] vetor = {87, 68, 94, 100, 83, 78, 85, 91, 76, 87};
		int total = 0;
		
		for(int contador = 0; contador < vetor.length; contador++) {
			total += vetor[contador];
		}
		
		System.out.printf("O total da soma dos elementos do Vetor é de: %d%n", total);

	}

}
