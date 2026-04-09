import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class EjercicioLinkedList {
    public static void main(String[] args) {
        // --- Reutilizamos la lógica del ejercicio anterior para tener una lista con datos ---
        List<String> listaOriginal = new ArrayList<>();
        listaOriginal.add("Francisco"); // El que modificamos antes
        listaOriginal.add("Ana");
        listaOriginal.add("Luis");
        listaOriginal.add("Berta");
        
        System.out.println("Lista Original (ArrayList): " + listaOriginal);

        // 1. Copiar las personas a una nueva lista LinkedList
        List<String> listaNueva = new LinkedList<>(listaOriginal);
        System.out.println("Nueva Lista (LinkedList): " + listaNueva);

        // 2. Intercambiar la primera persona con la última
        String primera = listaNueva.get(0);
        int ultimoIndice = listaNueva.size() - 1;
        String ultima = listaNueva.get(ultimoIndice);

        // Ponemos la última en la primera posición
        listaNueva.set(0, ultima);
        // Ponemos la que era primera en la última posición
        listaNueva.set(ultimoIndice, primera);

        System.out.println("Lista tras intercambiar primera y última: " + listaNueva);
    }
}
