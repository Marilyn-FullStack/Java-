package aula03;

import java.util.Scanner;

public class Exer01 {
	
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		        System.out.print("Digite o primeiro número do intervalo: ");
		        int primeiroNumero = sc.nextInt();

		        System.out.print("Digite o último número do intervalo: ");
		        int ultimoNumero = sc.nextInt();

		        // Verifica se o intervalo é válido
		        if (primeiroNumero >= ultimoNumero) {
		            System.out.println("Intervalo inválido. O primeiro número deve ser menor que o último.");
		            return; // Sai do programa
		        }

		        System.out.println("No Intervalo entre " + primeiroNumero + " e " + ultimoNumero + ":");

		        // Loop for para percorrer o intervalo
		        for (int i = primeiroNumero; i <= ultimoNumero; i++) {
		            // Verifica se o número é múltiplo de 3 e 5
		            if (i % 3 == 0 && i % 5 == 0) {
		                System.out.println(i + " é múltiplo de 3 e 5");
		            }
		        }
		    }
		}
