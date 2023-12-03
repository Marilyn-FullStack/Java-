package aula04;

import java.util.Scanner;

public class Exer02 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		// Inicializando o vetor com 10 números inteiros
		int[] vetor = new int[10];

		// Lendo os números e armazenando no vetor
		for (int i = 0; i < 10; i++) {
			System.out.print("Digite um número inteiro: ");
			vetor[i] = sc.nextInt();
		}

		// Exibindo todos os elementos dos índices ímpares
		System.out.print("\nElementos nos índices ímpares: ");
		for (int i = 1; i < 10; i += 2) {
			System.out.print(vetor[i] + " ");
		}

		// Exibindo todos os elementos pares
		System.out.print("\n\nElementos pares: ");
		for (int num : vetor) {
			if (num % 2 == 0) {
				System.out.print(num + " ");
			}
		}

		// Calculando a soma dos elementos
		int soma = 0;
		for (int num : vetor) {
			soma += num;
		}

		// Calculando a média dos elementos
		double media = (double) soma / vetor.length;

		// Exibindo a soma e a média
		System.out.println("\n\nSoma: " + soma);
		System.out.println("Média: " + String.format("%.2f", media));
	}
}
