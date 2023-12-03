package aula03;

import java.util.Scanner;

public class Exer02 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int numerosPares = 0;
		int numerosImpares = 0;

		System.out.println("Digite 10 números inteiros:");

		// Loop for para ler 10 números
		for (int i = 1; i <= 10; i++) {
			System.out.print("Digite o " + i + "º número: ");
			int numero = sc.nextInt();

			// Verifica se o número é par ou ímpar
			if (numero % 2 == 0) {
				numerosPares++;
			} else {
				numerosImpares++;
			}
		}

		// Exibe o resultado
		System.out.println("Total de números pares: " + numerosPares);
		System.out.println("Total de números ímpares: " + numerosImpares);

	}
}
