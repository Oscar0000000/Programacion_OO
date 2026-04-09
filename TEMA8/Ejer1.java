package ejer1;
import java.util.ArrayList;
import java.util.List;
public class Ejer1 {

	public static void main(String[] args) {
		

		
		        // 1. Crear una lista nula
		        List<String> lista = null;
		        System.out.println("1. Lista nula: " + lista);

		        // 2. Asignarle un ArrayList vacío
		        lista = new ArrayList<>();
		        System.out.println("2. Lista vacía: " + lista);

		        // 3. Añadir 3 nombres 
		        lista.add("Fran");
		        lista.add("Ana");
		        lista.add("Luis");
		        System.out.println("3. Lista con 3: " + lista);

		        // 4. Imprimir la última persona 
		        String ultima = lista.get(lista.size() - 1);
		        System.out.println("4. Última: " + ultima);

		        // 5. Modificar el nombre de la primera 
		        lista.set(0, "Francisco");
		        System.out.println("5. Tras modificar primera: " + lista);

		        // 6. Eliminar la posición central
		        lista.remove(lista.size() / 2);
		        System.out.println("6. Tras eliminar central: " + lista);

		        // 7. Recorrer con for clásico
		        System.out.println("7. Nombres en la lista:");
		        for (int i = 0; i < lista.size(); i++) {
		            System.out.println(" - " + lista.get(i));
		        }

		        // 8. Crear nueva, añadir y preguntar si está
		        String nueva = "Berta";
		        lista.add(nueva);
		        System.out.println("8. ¿Está Berta?: " + lista.contains(nueva));

		        // 9. Vaciar la lista 
		        while (!lista.isEmpty()) {
		            lista.remove(0); // Borra el primero hasta que no quede nada
		        }
		        System.out.println("9. ¿Está vacía?: " + lista.isEmpty());
		    }
		
	}

