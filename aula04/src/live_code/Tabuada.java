	package live_code;
	
	import java.util.Scanner;
	
	public class Tabuada {
	
		static Scanner sc = new Scanner(System.in);
		public static void main(String[] args) {
	
			int num;
	
			System.out.println("Digite um numero: ");
			num = sc.nextInt();
	
			for (int contador = 1; contador <= 10; contador++) {
				System.out.println(num + "x" + contador + "=" + (num * contador));
			}
	
		}
	
	}
