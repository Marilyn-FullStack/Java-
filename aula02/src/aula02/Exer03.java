package aula02;

import java.util.Scanner;

public class Exer03 {
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		        System.out.print("Digite o Nome do doador: ");
		        String nomeDoador = sc.nextLine();

		        System.out.print("Digite a Idade do doador: ");
		        int idadeDoador = sc.nextInt();

		        System.out.print("Primeira doação de sangue? ");
		        boolean primeiraDoacao = sc.nextBoolean();

		        if (idadeDoador >= 18 && idadeDoador <= 69) {
		            if (idadeDoador >= 60 && idadeDoador <= 69 && primeiraDoacao) {
		                System.out.println(nomeDoador + " não está apto para doar sangue!");
		            } else {
		                System.out.println(nomeDoador + " está apto para doar sangue!");
		            }
		        } else {
		            System.out.println(nomeDoador + " não está apto para doar sangue!");
		        }
		    }
		}
