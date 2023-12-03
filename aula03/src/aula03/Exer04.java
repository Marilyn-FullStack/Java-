package aula03;

import java.util.Scanner;

public class Exer04 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int idade, identidadeGenero, pessoaDesenvolvedora;
		int totalBackend = 0;
		int totalMulheresCisTransFrontend = 0;
		int totalHomensCisTransMobileAcima40 = 0;
		int totalNaoBinariosFullStackMenor30 = 0;
		int totalPessoas = 0;
		int somaIdades = 0;

		char continuar;

		do {
			System.out.print("Idade: ");
			idade = sc.nextInt();

			System.out.print("Identidade de Gênero (1 a 6): ");
			identidadeGenero = sc.nextInt();

			System.out.print("Pessoa Desenvolvedora (1 a 4): ");
			pessoaDesenvolvedora = sc.nextInt();

			// Contagem de categorias
			switch (pessoaDesenvolvedora) {
			case 1: // Backend
				totalBackend++;
				break;
			case 2: // Frontend
				if (identidadeGenero == 1 || identidadeGenero == 4) {
					totalMulheresCisTransFrontend++;
				}
				break;
			case 3: // Mobile
				if (identidadeGenero == 2 || identidadeGenero == 5) {
					if (idade > 40) {
						totalHomensCisTransMobileAcima40++;
					}
				}
				break;
			case 4: // FullStack
				if (identidadeGenero == 3) {
					if (idade < 30) {
						totalNaoBinariosFullStackMenor30++;
					}
				}
				break;
			}

			// Somando idade
			somaIdades += idade;

			// Incrementando total de pessoas
			totalPessoas++;

			System.out.print("Deseja continuar (S/N): ");
			continuar = sc.next().charAt(0);

		} while (continuar == 'S' || continuar == 's');

		// Exibindo resultados
		System.out.println("Total de pessoas desenvolvedoras Backend: " + totalBackend);
		System.out.println("Total de Mulheres Cis e Trans desenvolvedoras Frontend: " + totalMulheresCisTransFrontend);
		System.out.println("Total de Homens Cis e Trans desenvolvedores Mobile maiores de 40 anos: "
				+ totalHomensCisTransMobileAcima40);
		System.out.println("Total de Pessoas Não Binárias desenvolvedoras FullStack menores de 30 anos: "
				+ totalNaoBinariosFullStackMenor30);
		System.out.println("O número total de pessoas que responderam à pesquisa: " + totalPessoas);

		// Calculando e exibindo a média de idade
		double mediaIdade = (double) somaIdades / totalPessoas;
		System.out.printf("A média de idade das pessoas que responderam à pesquisa: %.2f\n", mediaIdade);

	}
}
