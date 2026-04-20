package ejercicio9;

import java.util.SortedSet;
import java.util.TreeSet;

import ejercicio1.Persona;

public class ejercicio9 {

	public static void main(String[] args) {
		
		SortedSet<Persona> personas = new TreeSet<>();
		// SortedSet no admite duplicados, TreeSet ordena en orden natural
		Persona paco = new Persona("Paco");
		personas.add(Paco);
		Persona mario = new Persona("Mario");
		personas.add(Mario);
		Persona maria = new Persona("Maria");
		personas.add(maria);
		Persona mario2 = new Persona("Mario");
		personas.add(mario2);
		
		
		System.out.println(personas);
		
		System.out.println(Mario.compareTo(mario));// Devuelve numero en negativo porque simon es más grande que jacobo
		System.out.println(mario2.compareTo(mario2));// Devuelve 0 porque son iguales
	}

}
