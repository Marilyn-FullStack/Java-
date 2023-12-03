package aula04;

import java.util.Scanner;

public class Exer03 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Inicializando a matriz 3x3
		int[][] matriz = new int[3][3];

		// Lendo os elementos da matriz
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print("Digite o elemento da posição [" + i + "][" + j + "]: ");
				matriz[i][j] = sc.nextInt();
			}
		}

		// Exibindo os elementos da Diagonal Principal
		System.out.print("\nElementos da Diagonal Principal: ");
		for (int i = 0; i < 3; i++) {
			System.out.print(matriz[i][i] + " ");
		}

		// Exibindo os elementos da Diagonal Secundária
		System.out.print("\n\nElementos da Diagonal Secundária: ");
		for (int i = 0, j = 2; i < 3; i++, j--) {
			System.out.print(matriz[i][j] + " ");
		}

		// Calculando a soma dos elementos da Diagonal Principal
		int somaDiagonalPrincipal = 0;
		for (int i = 0; i < 3; i++) {
			somaDiagonalPrincipal += matriz[i][i];
		}

		// Calculando a soma dos elementos da Diagonal Secundária
		int somaDiagonalSecundaria = 0;
		for (int i = 0, j = 2; i < 3; i++, j--) {
			somaDiagonalSecundaria += matriz[i][j];
		}

		// Exibindo a soma das diagonais
		System.out.println("\n\nSoma dos Elementos da Diagonal Principal: " + somaDiagonalPrincipal);
		System.out.println("Soma dos Elementos da Diagonal Secundária: " + somaDiagonalSecundaria);

	}
}
