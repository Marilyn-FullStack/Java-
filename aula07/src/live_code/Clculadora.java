package live_code;

import java.util.Scanner;

public class Clculadora {
	
		static Scanner sc = new Scanner(System.in);
		public static void main(String[] args) {

			int n1, n2, op;

			while (true) {
				System.out.println("1 - Soma");
				System.out.println("2 - Subtração");
				System.out.println("3 - Multiplicação");
				System.out.println("4 - Divisão");
				System.out.println("0 - Sair");
				System.out.println("Escolha a operação: ");
				op = sc.nextInt();

				if (op == 0) {
					sobre();
					System.exit(0);
				}

				System.out.println("Primeiro numero: ");
				n1 = sc.nextInt();

				System.out.println("Segundo numero: ");
				n2 = sc.nextInt();

				switch (op) {
				case 1 -> System.out.println("Soma: " + somar(n1, n2));
				case 2 -> System.out.println("Subtração: " + subtrair(n1, n2));
				case 3 -> System.out.println("Multiplicação: " + multiplicar(n1, n2));
				case 4 -> System.out.println("Divisão: " + dividir(n1, n2));
				default -> System.out.println("Opção inválida!");
				}
			}
		}

		static int somar(int n1, int n2) {
			return n1 + n2;
		}

		static float somar(float n1, float n2) {
			return n1 + n2;
		}

		static int subtrair(int n1, int n2) {
			return n1 - n2;
		}

		static int multiplicar(int n1, int n2) {
			return n1 * n2;
		}

		static float dividir(float n1, float n2) {
			if (n2 != 0) {
				return n1 / n2;
			} else {
				System.out.println("Não é possível dividir por zero.");
				return 0;
			}
		}

		static void sobre() {
			System.out.println("Feito por: Maria");
		}
	}
