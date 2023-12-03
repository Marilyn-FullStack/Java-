package aula03;

import java.util.Scanner;

public class Exer03 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int idade;
		int totalMenorQue21 = 0;
		int totalMaiorQue50 = 0;

		System.out.println("Digite as idades das pessoas (digite uma idade negativa para encerrar):");

		// Loop while para ler as idades até que seja digitada uma idade negativa
		while (true) {
			System.out.print("Digite a idade: ");
			idade = sc.nextInt();

			// Verifica se a idade é negativa para encerrar o loop
			if (idade < 0) {
				break;
			}

			// Conta o total de pessoas com idade menor que 21 e maior que 50
			if (idade < 21) {
				totalMenorQue21++;
			} else if (idade > 50) {
				totalMaiorQue50++;
			}
		}

		// Exibe o resultado
		System.out.println("Total de pessoas com idade menor que 21: " + totalMenorQue21);
		System.out.println("Total de pessoas com idade maior que 50: " + totalMaiorQue50);

	}

}
