// Importamos la clase File para trabajar con archivos
import java.io.File;

// Importamos FileWriter para escribir texto en archivos
import java.io.FileWriter;

// Importamos FileReader para leer texto desde archivos
import java.io.FileReader;

// Importamos IOException para manejar errores de E/S
import java.io.IOException;

public class GestionFicheroTexto {

    public static void main(String[] args) {

        // Creamos un objeto File que representa el archivo
        File archivo = new File("texto.txt");

        // Bloque try-catch para controlar posibles errores
        try {

            // Verificamos si el archivo existe
            if (archivo.exists()) {

                // Mostramos información del archivo
                System.out.println("El archivo existe.");

                // Mostramos el nombre del archivo
                System.out.println("Nombre: " + archivo.getName());

                // Mostramos la ruta absoluta
                System.out.println("Ruta absoluta: " + archivo.getAbsolutePath());

                // Mostramos el tamaño en bytes
                System.out.println("Tamaño: " + archivo.length() + " bytes");

                // Verificamos si es un archivo
                if (archivo.isFile()) {

                    System.out.println("Es un archivo válido.");

                }

                // Verificamos permisos de lectura y escritura
                if (archivo.canRead()) {

                    System.out.println("El archivo se puede leer.");
                }

                if (archivo.canWrite()) {

                    System.out.println("El archivo se puede escribir.");
                }
