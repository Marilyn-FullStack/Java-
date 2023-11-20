package live_code;

import java.util.Scanner;

public class Calculadora {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		double num1, num2;
		
		System.out.println("Digite o primeiro numero: ");
		num1 = sc.nextDouble();
		
		System.out.println("Digite o segundo numero: ");
		num2 = sc.nextDouble();
		
		System.out.println("Soma: " + (num1 + num2));
		
		System.out.println("Subtração: " + (num1 - num2));

		System.out.println("Multiplicação: " + (num1 *num2));

		System.out.printf("Divisão: %.2f", (num1 / num2));

		System.out.println("\nModulo da divisão do primeiro numero: " + (num1%2));

		System.out.println("Modulo da divisão do segundo numero: " + (num2%2));
		
		System.out.printf("Raiz quadrada do primeiro numero: %.2f", (Math.sqrt(num1)));
		
		System.out.printf("\nPrimeiro numero elevado ao segundo: %.2f", Math.pow(num1, num2));

	}

}
