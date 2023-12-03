package aula02;

import java.util.Scanner;

public class Exer04 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		String ani1, ani2, ani3;

		System.out.println("Digite a primeira palavra: ");
		ani1 = sc.nextLine();

		System.out.println("Digite a segunda palavra: ");
		ani2 = sc.nextLine();

		System.out.println("Digite a terceira palavra: ");
		ani3 = sc.nextLine();

		if (ani1.equalsIgnoreCase("vertebrado")) {

			if (ani2.equalsIgnoreCase("ave")) {

				if (ani3.equalsIgnoreCase("carnivoro")) {
					System.out.println("águia");
				} else {
					System.out.println("pomba");
				}

			} else {
				if (ani3.equalsIgnoreCase("herbivoro")) {
					System.out.println("vaca");
				} else {
					System.out.println("homem");
				}
			}

		} else {

			if (ani2.equalsIgnoreCase("inseto")) {

				if (ani3.equalsIgnoreCase("hematofago")) {
					System.out.println("pulga");
				} else {
					System.out.println("lagarta");
				}

			} else {

				if (ani3.equalsIgnoreCase("onivoro")) {
					System.out.println("minhoca");
				} else {
					System.out.println("sanguessuga");
				}

			}
		}
	}

}
