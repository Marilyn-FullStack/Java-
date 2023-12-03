package aula03;

import java.util.Scanner;

public class Exer06 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int numero;
		int somaMultiplosDeTres = 0;
		int quantidadeMultiplosDeTres = 0;

		do {
			System.out.print("Digite um número: ");
			numero = sc.nextInt();

			if (numero % 3 == 0 && numero != 0) {
				somaMultiplosDeTres += numero;
				quantidadeMultiplosDeTres++;
			}

		} while (numero != 0);

		// Calculando a média
		double mediaMultiplosDeTres = quantidadeMultiplosDeTres > 0
				? (double) somaMultiplosDeTres / quantidadeMultiplosDeTres
				: 0;

		// Exibindo resultado
		System.out.println("A média de todos os números múltiplos de 3 é: " + mediaMultiplosDeTres);
	}
}
