import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Jardin {

    public static void main(String[] args) {

        // 1. Colección con todos los árboles (permite "duplicados" inicialmente)
        Set<Arbol> arboles = new HashSet<>();

        arboles.add(new Arbol("Álamo", 4));
        arboles.add(new Arbol("Olivo", 3));
        arboles.add(new Arbol("Olivo", 4));
        arboles.add(new Arbol("Higuera", 2));
        arboles.add(new Arbol("Naranjo", 2));
        arboles.add(new Arbol("Naranjo", 2));
        arboles.add(new Arbol("Naranjo", 2));

        System.out.println("Árboles (sin duplicar por especie):");
        System.out.println(arboles);

        // 2. Colección ordenada alfabéticamente
        Set<Arbol> ordenados = new TreeSet<>(
                (a1, a2) -> a1.getEspecie().compareTo(a2.getEspecie())
        );

        ordenados.addAll(arboles);

        System.out.println("\nÁrboles ordenados por especie:");
        System.out.println(ordenados);
    }
}
