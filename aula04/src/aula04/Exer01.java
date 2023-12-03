package aula04;

import java.util.Scanner;

public class Exer01 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		// Inicializando o vetor com 10 números inteiros não ordenados e não repetidos
		int[] vetor = { 2, 5, 1, 3, 4, 9, 7, 8, 10, 6 };

		// Solicitando ao usuário um número a ser pesquisado
		System.out.print("Digite o número que você deseja encontrar: ");
		int numeroPesquisado = sc.nextInt();

		// Variável para armazenar a posição do número no vetor
		int posicao = -1;

		// Pesquisando o número no vetor
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] == numeroPesquisado) {
				posicao = i;
				break; // Encontrou o número, não precisa continuar procurando
			}
		}

		// Exibindo o resultado
		if (posicao != -1) {
			System.out.println("O número " + numeroPesquisado + " está localizado na posição: " + posicao);
		} else {
			System.out.println("O número " + numeroPesquisado + " não foi encontrado!");
		}
	}
}
