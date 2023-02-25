package Kata5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainKata5 {

	public static void main(String[] args) {
		// 1.- Crear una llista d'ordinadors:
		
		List<Ordinador> ordinadors = new ArrayList<>(); 
		ordinadors.add(new Ordinador ("HP", "340", "Intel Core i5", 8, 500));
		ordinadors.add(new Ordinador ("Lenovo", "Y540", "Intel Core i7", 16, 900));
		ordinadors.add(new Ordinador ("MacBook", "Air", "Intel Core i3", 4, 300));
		ordinadors.add(new Ordinador("HP", "340")); 
		ordinadors.add(new Ordinador("MacBook", "Air")); 
		ordinadors.add(new Ordinador ("Lenovo", "Y540")); 
		
		System.out.println("Llista d'ordinadors: "); 
		ordinadors.forEach(System.out::println); 
		System.out.println("\n"); 
		
		// 2.- Eliminar un ordinador de la llista: 

		String marca = "HP"; 
		String modelo = "340"; 
		
		MethodsKata5.removeOrdinador(ordinadors, marca, modelo); //Amb un while i el boolean found
		
		Ordinador ordinador2 = new Ordinador ("MacBook", "Air"); 
		
		MethodsKata5.removeOrdinador2(ordinadors, ordinador2); //Amb ListIterator i un while amb el boolean found
		
		// 3.- Eliminar un ordinador amb el mètode contains: 
		
		List<Ordinador> ordinadorsEliminar = new ArrayList<>(); 
		Ordinador ordinadorEliminar = new Ordinador ("HP", "340");
		ordinadorsEliminar.add(ordinadorEliminar); 
		
		MethodsKata5.bestWayRemoveOrdinador(ordinadors, ordinadorEliminar); //Amb el mètode contains
		
		// 4.- Eliminar ordinadors duplicats amb el mètode contains: 
		
		List<Ordinador> ordinadorsEliminar2 = new ArrayList<>(); 
		Ordinador ordinadorEliminar2 = new Ordinador ("Lenovo", "Y540");
		ordinadorsEliminar2.add(ordinadorEliminar2); 
		
		MethodsKata5.bestWayRemoveDuplicatedOrdinador(ordinadors, ordinadorsEliminar2, ordinadorEliminar2); //Amb el mètode contains i el removeAll pels duplicats
		
		// 5.- Mostrar els elements comuns en les dues llistes: 
		
		List<String> firstList=new ArrayList<String>(Arrays.asList("xampú", "sabó", "patates", "bledes", "lletuga", "llimones", "kiwis", "alvocats", "fideus", "arròs", "cafè", "xocolata"));

        List<String> secondList=new ArrayList<String>(Arrays.asList("xampú", "xocolata", "alvocats", "bledes", "llimones", "llimonada", "kiwis"));
        
        System.out.println(MethodsKata5.showElementsBothArrays(firstList, secondList) + "\n"); //Amb un for each i el mètode contains
        
        // 6.- Mostrar els elements comuns utilitzant el mètode retainAll: 
        
        MethodsKata5.bestWayShowElementsBothArrays(firstList, secondList); //Amb el mètode retainAll

	}
	
	

}
