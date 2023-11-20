	package live_code;
	
	import java.util.Scanner;
	
	public class PlanoDeSaude {
	
		static Scanner sc = new Scanner(System.in);
	
		public static void main(String[] args) {
	
			String nome;
			int idade;
	
			System.out.println("Digite o seu nome: ");
			nome = sc.nextLine();
	
			System.out.println("Digite sua idade: ");
			idade = sc.nextInt();
	
			if (idade > 0 && idade <= 10) {
				System.out.printf(" %s seu plano de saude custara R$ 100,00 por mês.", nome);
	
			} else if (idade >= 11 && idade <= 29) {
				System.out.printf(" %s seu plano de saude custara R$ 200,00 por mês.", nome);
				
			} else if (idade >= 30 && idade <= 45) {
				System.out.printf(" %s seu plano de saude custara R$ 300,00 por mês.", nome);
				
			} else if (idade >= 46 && idade <= 59) {
				System.out.printf(" %s seu plano de saude custara R$ 500,00 por mês.", nome);
				
			} else if (idade >= 60 && idade <= 65) {
				System.out.printf(" %s seu plano de saude custara R$ 600,00 por mês.", nome);
				
			} else {
				System.out.printf(" %s seu plano de saude custara R$ 1000,00 por mês.", nome);
			}
	
		}
	
	}
