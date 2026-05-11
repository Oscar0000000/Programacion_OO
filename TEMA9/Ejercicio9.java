// Importamos la clase File para trabajar con archivos
import java.io.File;

// Importamos IOException para manejar posibles errores de entrada/salida
import java.io.IOException;

public class GestionArchivo {

    public static void main(String[] args) {

        // Creamos un objeto File que representa el archivo "notas.txt"
        // El archivo estará en la raíz del proyecto
        File archivo = new File("notas.txt");

        // Bloque try-catch para manejar excepciones
        try {

            // Comprobamos si el archivo existe
            if (archivo.exists()) {

                // Mostramos información del archivo
                System.out.println("El archivo existe.");

                // Mostramos el nombre del archivo
                System.out.println("Nombre: " + archivo.getName());

                // Mostramos la ruta absoluta
                System.out.println("Ruta absoluta: " + archivo.getAbsolutePath());

            } else {

                // Si el archivo no existe, mostramos mensaje
                System.out.println("El archivo no existe.");

                // Intentamos crear el archivo automáticamente
                boolean creado = archivo.createNewFile();

                // Verificamos si se creó correctamente
                if (creado) {

                    System.out.println("El archivo ha sido creado correctamente.");

                    // Mostramos información del nuevo archivo
                    System.out.println("Nombre: " + archivo.getName());

                    System.out.println("Ruta absoluta: " + archivo.getAbsolutePath());

                } else {

                    // Este caso es raro, pero por seguridad lo controlamos
                    System.out.println("No se pudo crear el archivo.");
                }
            }

        } catch (IOException e) {

        }
    }
}
