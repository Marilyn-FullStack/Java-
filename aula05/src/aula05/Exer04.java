package aula05;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Exer04 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		// Criando um HashSet de objetos Integer inicializado com 10 valores
		Set<Integer> conjunto = new HashSet<>();
		conjunto.add(2);
		conjunto.add(5);
		conjunto.add(1);
		conjunto.add(3);
		conjunto.add(4);
		conjunto.add(9);
		conjunto.add(7);
		conjunto.add(8);
		conjunto.add(10);
		conjunto.add(6);

		// Solicitando ao usuário que digite um número inteiro
		System.out.print("Digite o número que você deseja encontrar: ");
		int numero = sc.nextInt();

		// Verificando se o número está presente no conjunto
		if (conjunto.contains(numero)) {
			System.out.println("O número " + numero + " foi encontrado!");
		} else {
			System.out.println("O número " + numero + " não foi encontrado!");
		}
	}
}
