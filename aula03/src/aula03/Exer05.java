package aula03;

import java.util.Scanner;

public class Exer05 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int numero;
		int somaPositivos = 0;

		do {
			System.out.print("Digite um número: ");
			numero = sc.nextInt();

			if (numero > 0) {
				somaPositivos += numero;
			}

		} while (numero != 0);

		// Exibindo resultado
		System.out.println("A soma dos números positivos é: " + somaPositivos);
	}
}
