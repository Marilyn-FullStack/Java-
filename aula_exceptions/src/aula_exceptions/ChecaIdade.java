package aula_exceptions;

import java.util.Scanner;

public class ChecaIdade {

	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {

		int idade;

		try {
			System.out.println("\nDigite uma idade: ");
			idade = leia.nextInt();

			validarIdade(idade);

		} catch (ArithmeticException e) {
			System.out.println("Digite um num maio ou igal a 18");
		}
	}

	public static void validarIdade(int idade) {

		if (idade >= 18)
			System.out.println("A Pessoa pode dirigir!!");
		else
			throw new ArithmeticException("A pessoa não esta apta a dirigir");

	}

}
