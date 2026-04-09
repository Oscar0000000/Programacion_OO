import java.util.ArrayList;
import java.util.List;
import java.util.Scanner; 

public class EjercicioNombres {

    public static void main(String[] args) {
        // 1. Crear la lista e inicializarla como ArrayList
        List<String> listaNombres = new ArrayList<>();
        Scanner teclado = new Scanner(System.in);

        // 2. Añadir al menos 5 nombres iniciales
        listaNombres.add("Pepe");
        listaNombres.add("Maria");
        listaNombres.add("Juan");
        listaNombres.add("Lola");
        listaNombres.add("Kiko");

        // 3. Mostrar los nombres (llamando al método que creamos abajo)
        System.out.println("Lista de nombres");
        mostrarLista(listaNombres);

        // 4. Añadir un nuevo nombre solicitado al usuario
        System.out.print("\nIntroduce un nuevo nombre para añadir: ");
        String nuevoNombre = teclado.nextLine();
        listaNombres.add(nuevoNombre);
        
        System.out.println("Lista actualizada:");
        mostrarLista(listaNombres);

        // 5. Eliminar un nombre específico
        System.out.print("\nIntroduce el nombre que quieres eliminar: ");
        String nombreEliminar = teclado.nextLine();

        if (listaNombres.contains(nombreEliminar)) {
            listaNombres.remove(nombreEliminar);
            System.out.println("Nombre eliminado correctamente.");
        } else {
            System.out.println("El nombre no se encuentra en la lista.");
        }

        // 6. Mostrar el número total de nombres
        System.out.println("\nTotal de nombres en la lista: " + listaNombres.size());
        
        System.out.println("Lista final:");
        mostrarLista(listaNombres);
    }

    public static void mostrarLista(List<String> lista) {
        for (String nombre : lista) {
            System.out.println("- " + nombre);
        }
    }
}
