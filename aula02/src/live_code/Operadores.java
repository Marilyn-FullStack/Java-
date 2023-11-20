package live_code;

import java.util.Scanner;

public class Operadores {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		int num1 = 10, num2 = 20, idade = 30, tamanho;
		float media = 9.94444f;
		String valor1 = "2", valor2 = "3", nome = "Maria";
		
		System.out.println("A Soma das variaveis num1 e num2 é: " + (num1 + num2));
		
		System.out.println("A Soma das variaveis valor1 e valor2 é: " + (valor1 + valor2));
		
		System.out.println("Sou a " + nome + " tenho " + idade + " anos de idade");
		
		System.out.printf("A media final da %s é %.2f", nome, media);
		
		System.out.println("\nDigite um tamanho inteiro: ");
		tamanho = sc.nextInt();
		
		System.out.println("O tamanho digitado foi: " + tamanho);

	}

}
