package aula04;

import java.util.Scanner;

public class Exer04 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		// Inicializando a matriz para armazenar as notas
		double[][] notas = new double[10][4];

		// Lendo as notas dos participantes
		for (int i = 0; i < 10; i++) {
			System.out.println("Digite as 4 notas do participante " + (i + 1) + ":");
			for (int j = 0; j < 4; j++) {
				System.out.print("Nota " + (j + 1) + ": ");
				notas[i][j] = sc.nextDouble();
			}
		}

		// Inicializando o vetor para armazenar as médias
		double[] medias = new double[10];

		// Calculando as médias dos participantes
		for (int i = 0; i < 10; i++) {
			double soma = 0;
			for (int j = 0; j < 4; j++) {
				soma += notas[i][j];
			}
			medias[i] = soma / 4;
		}

		// Exibindo as médias dos participantes
		System.out.println("\nMédias dos participantes:");
		for (int i = 0; i < 10; i++) {
			System.out.println("Participante " + (i + 1) + ": " + String.format("%.1f", medias[i]));
		}
	}
}
