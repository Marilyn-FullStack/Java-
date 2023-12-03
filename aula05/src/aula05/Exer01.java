package aula05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exer01 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		// Criando ArrayList para armazenar as cores
		ArrayList<String> cores = new ArrayList<>();

		// Solicitando ao usuário para digitar 5 cores
		for (int i = 0; i < 5; i++) {
			System.out.print("Digite a cor " + (i + 1) + ": ");
			String cor = sc.nextLine();
			cores.add(cor);
		}

		// Exibindo todas as cores adicionadas
		System.out.println("\nListar todas as cores:");
		for (String cor : cores) {
			System.out.println(cor);
		}

		// Ordenando as cores
		Collections.sort(cores);

		// Exibindo as cores ordenadas
		System.out.println("\nOrdenar as cores:");
		for (String cor : cores) {
			System.out.println(cor);
		}
	}
}
