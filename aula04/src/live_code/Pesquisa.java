	package live_code;
	
	import java.util.Scanner;
	
	public class Pesquisa {
	
		static Scanner sc = new Scanner(System.in);
		public static void main(String[] args) {
	
			int idade, esporte, fut = 0, volei18 = 0, basq18 = 0, outros = 0;
			String decisao = "S";
	
			while (decisao.equalsIgnoreCase("S")) {
	
				System.out.println("Digite sua idade: ");
				idade = sc.nextInt();
				do {
					System.out.println("Qual seu esporte favorito\n1. Futebol\n2. Volei\n3. Basquete\n4. Outros: ");
					esporte = sc.nextInt();
	
					if (esporte < 1 || esporte > 4) {
						System.out.println("Digite um valor entre 1 a 4 ");
					}
				} while (esporte < 1 || esporte > 4);
	
				// QUANTAS PESSOAS GOSTAM DE FUTEBOL
	
				if (esporte == 1) {
					fut++;
				}
				// QUANTAS GOSTAM DE VOLEI E SÃO MAIORES DE 18 ANOS
				if (esporte == 2 && idade > 18) {
					volei18++;
				}
	
				// QUANTAS GOSTAM DE BASQUETE E SÃO MAIORES DE 18 ANO
				if (esporte == 3 && idade < 18) {
					basq18++;
	
				}
				// QUANTAS GOSTAM DE OUTROS ESPORTES
				if (esporte == 4) {
					outros++;
				}
				System.out.println("deseja continuar S/N? ");
				sc.skip("\\R");
				decisao = sc.nextLine().toUpperCase();
	
			}
			System.out.println("Total de pessoas que gostam de futebol :" + fut);
			System.out.println("Total de pessoas que gostam de volei e são maiores de 18 anos: " + volei18);
			System.out.println("Total de pessoas que gostam de basquete e são maiores de 18 anos:" + basq18);
			System.out.println("Total de pessoas que gostam de outros esportes: " + outros);
		
		
		}
	
	}
