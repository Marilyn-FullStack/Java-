package live_code;

import java.util.Scanner;

public class Tabuada02 {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		int num, contador = 0;
		
		System.out.println("Digite um numero: ");
		num = sc.nextInt();

		while (contador <= 10) {
			
			System.out.println(num + "x" + contador + "=" + (num * contador));
			contador++;
		}
		
	}

}
