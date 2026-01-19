package Tema_4;

public class Ciudad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Persona manuel = new Persona("Manuel", "Romero", 27, 1.8f, Persona.Sexo.MASCULINO);
	
		System.out.println(manuel.nombre);
		System.out.println(manuel.apellido);
		System.out.println(manuel.edad);
		System.out.println(manuel.estatura);
		System.out.println(manuel.sexo);
		
		
		Persona antonio = new Persona();
		Persona jairo = new Persona();
		
		
		System.out.println(manuel);
		
		System.out.println("Hola soy " + manuel.nombre + " y tengo " + manuel.edad + " años");
		
	}
}
