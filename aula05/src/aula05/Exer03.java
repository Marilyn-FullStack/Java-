package aula05;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Exer03 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		// Criando um HashSet de objetos Integer
		Set<Integer> conjunto = new HashSet<>();

		// Solicitando ao usuário que digite 10 valores inteiros não repetidos
		System.out.println("Digite 10 valores inteiros não repetidos:");

		for (int i = 0; i < 10; i++) {
			int valor = sc.nextInt();
			conjunto.add(valor);
		}

		// Exibindo todos os elementos da Collection Set usando a Classe Iterator
		System.out.println("\nListar dados do Set:");

		Iterator<Integer> iterator = conjunto.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}
}
