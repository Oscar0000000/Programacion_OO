import java.util.*;

public class Ejercicio11 {

    public static void main(String[] args) {

        // 1. Lista con orden de inserción y repetidos (ArrayList)
        List<Integer> lista = new ArrayList<>();
        lista.add(5);
        lista.add(8);
        lista.add(3);
        lista.add(8);
        lista.add(10);

        // 2. Mostrar lista
        System.out.println("Lista original:");
        System.out.println(lista);

        // 3. Eliminar impares (usando Iterator) y añadir 8 al principio
        Iterator<Integer> it = lista.iterator();

        while (it.hasNext()) {
            int num = it.next();
            if (num % 2 != 0) {
                it.remove(); // eliminar impares
            }
        }

        lista.add(0, 8); // añadir al principio

        System.out.println("Lista sin impares + 8 al inicio:");
        System.out.println(lista);

        // 4. Nueva colección sin repetidos (HashSet)
        Set<Integer> sinRepetidos = new HashSet<>(lista);

        System.out.println("Sin repetidos (HashSet):");
        System.out.println(sinRepetidos);

        // 5. Nueva colección ordenada (TreeSet)
        Set<Integer> ordenados = new TreeSet<>(sinRepetidos);

        System.out.println("Numeros Ordenados (TreeSet):");
        System.out.println(ordenados);
    }
}
