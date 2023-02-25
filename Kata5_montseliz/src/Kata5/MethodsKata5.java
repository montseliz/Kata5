package Kata5;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class MethodsKata5 {

	// 2.
	public static void removeOrdinador(List<Ordinador> ordinadors, String marca, String modelo) {
		int i = 0; 
		boolean found = false; 
		
		while (i < ordinadors.size() && !found) {
			if ((ordinadors.get(i).getMarca().equalsIgnoreCase(marca)) && (ordinadors.get(i).getModelo().equalsIgnoreCase(modelo))) {
				found = true; 
				ordinadors.remove(i); 
			} 
			i++; 
		}
		if (!found) {
			System.out.println("L'ordinador no s'ha trobat a la llista.");
		} else {
			System.out.println("L'ordinador s'ha eliminat de la llista.");
			ordinadors.forEach(System.out::println);
			System.out.println("\n");
		}
	}
	
	// 2. 
	public static void removeOrdinador2 (List<Ordinador> ordinadors, Ordinador ordinador2) {
		ListIterator<Ordinador> it = ordinadors.listIterator(); 
		boolean found = false; 
		
		while(it.hasNext() && !found) {
			if(it.next().equals(ordinador2)) {
				it.remove();
				found = true; 
			}
		}
		if (!found) {
			System.out.println("L'ordinador no s'ha trobat a la llista.");
		} else {
			System.out.println("L'ordinador s'ha eliminat de la llista.");
			ordinadors.forEach(System.out::println);
			System.out.println("\n");
		}
	}
	
	// 3. 
	public static void bestWayRemoveOrdinador(List<Ordinador> ordinadors, Ordinador ordinadorEliminar) {
		boolean found = false; 
		
		if (ordinadors.contains(ordinadorEliminar)) {
			ordinadors.remove(ordinadorEliminar); 
			found = true; 
		}
		
		if (found) {
			System.out.println("L'ordinador s'ha eliminat de la llista.");
			ordinadors.forEach(System.out::println);
			System.out.println("\n");
		} else {
			System.out.println("L'ordinador no s'ha trobat a la llista.");
		}
	}
	
	// 4. 
	public static void bestWayRemoveDuplicatedOrdinador(List<Ordinador> ordinadors, List<Ordinador> ordinadorsEliminar2, Ordinador ordinadorEliminar2) {
		boolean found = false; 
		
		if (ordinadors.contains(ordinadorEliminar2)) {
			ordinadors.removeAll(ordinadorsEliminar2); 
			found = true; 
		}
		
		if (found) {
			System.out.println("L'ordinador s'ha eliminat de la llista.");
			ordinadors.forEach(System.out::println);
			System.out.println("\n");
		} else {
			System.out.println("L'ordinador no s'ha trobat a la llista.");
		}
	}
	
	// 5. 
	public static List<String> showElementsBothArrays(List<String> firstList, List<String> secondList) {
		
		List<String> commonElementsList = new ArrayList<>(); 
		
		for (String string : firstList) {
			if (secondList.contains(string)) {
				commonElementsList.add(string); 
			}
		}
		return commonElementsList; 
	}
	
	// 6. 
	public static void bestWayShowElementsBothArrays(List<String> firstList, List<String> secondList) {
		
		secondList.retainAll(firstList); 
		secondList.forEach(System.out::println);
		System.out.println("\n");
		
	}
}
