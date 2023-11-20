package live_code;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ColecaoSet {
	
	public static void main(String[] args) {

		Set<String> frutas = new HashSet<String>();		

		//frutas.add("");
		frutas.add("Abacate");
		frutas.add("Banana");
		frutas.add("Abacate");
		frutas.add("Moranog");
		frutas.add("Jaboticaba");
		frutas.add("Kiwi");
		
		System.out.println(frutas);
		
		for (var fruta : frutas)
			System.out.println(fruta.hashCode());
		
		System.out.println("A fruta Morango existe: " + frutas.contains("Morango"));
		
		frutas.remove("Morango");
		
		System.out.println(frutas);
		
		//CRIAMOS ARRAYLIST
		Iterator<String> iFrutas = frutas.iterator();
		while (iFrutas.hasNext())
			System.out.println(iFrutas.hasNext());
		
		//CRIAMOS ARRAYLIST
		ArrayList<String> frutasList = new ArrayList<String>();
		
		//ADICIONAMOS TODOS OS ELEMENTOS DACOLEÇÃO HASHSET NO ARRAYLIST
		frutasList.addAll(frutas);
		
		//ORDENAMOS OS ELEMENTOS EM ORDEM CRESCENTE
		frutasList.sort(null);
		System.out.println(frutasList);
		
		//ORDENANDO EM ORDEM CRESCENTE
		frutasList.sort(Comparator.reverseOrder());
		System.out.println(frutasList);
		
	}

}
