package live_code;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<String>();

		fila.add("Aline");
		fila.add("Pedro");
		fila.add("Vinicius");
		fila.add("Luiza");
		fila.add("Maria");

		System.out.println(fila);

		fila.remove();

		System.out.println(fila);

		System.out.println(fila.peek());

		System.out.println(fila);

		System.out.println(fila.poll());

		System.out.println(fila);

		System.out.println("A maria esta na fila? " + fila.contains("Maria"));
		System.out.println("Numero de elementos na fila " + fila.size());

		int contador = 0;

		for (var pessoa : fila) {
			contador++;
			if (pessoa.equalsIgnoreCase("Maria"))
				System.out.println("Posição: " + contador);

		}

	}

}