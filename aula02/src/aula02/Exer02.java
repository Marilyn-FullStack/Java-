package aula02;

import java.util.Scanner;

public class Exer02 {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {


		        System.out.print("Digite um número: ");
		        int numero = sc.nextInt();

		        if (numero % 2 == 0) {
		            System.out.print("O Número " + numero + " é par e ");
		        } else {
		            System.out.print("O Número " + numero + " é ímpar e ");
		        }

		        if (numero > 0) {
		            System.out.println("positivo!");
		        } else if (numero < 0) {
		            System.out.println("negativo!");
		        } else {
		            System.out.println("neutro (zero)!");
		        }
		    }
		}
