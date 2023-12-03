package aula05;

import java.util.ArrayList;
import java.util.Scanner;

public class Exer02 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		// Inicializando ArrayList de objetos Integer
		ArrayList<Integer> numeros = new ArrayList<>();
		numeros.add(2);
		numeros.add(5);
		numeros.add(1);
		numeros.add(3);
		numeros.add(4);
		numeros.add(9);
		numeros.add(7);
		numeros.add(8);
		numeros.add(10);
		numeros.add(6);

		// Exibindo a lista inicial de números
		System.out.println("Lista: " + numeros);

		// Solicitando ao usuário que digite um número
		System.out.print("\nDigite o número que você deseja encontrar: ");
		int numeroProcurado = sc.nextInt();

		// Verificando se o número está na lista
		int posicao = numeros.indexOf(numeroProcurado);

		// Exibindo o resultado
		if (posicao != -1) {
			System.out.println("O número " + numeroProcurado + " está localizado na posição: " + posicao);
		} else {
			System.out.println("O número " + numeroProcurado + " não foi encontrado!");
		}

	}
}
