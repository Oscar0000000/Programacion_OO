import java.io.FileWriter;

public class ExperimentoFlush {
    public static void main(String[] args) throws Exception {
        // Creamos el escritor hacia un archivo
        FileWriter escritor = new FileWriter("prueba.txt");
        
        // Escribimos algo
        escritor.write("¿Donde está mi texto?");
        
        System.out.println("He escrito en el archivo... ¿o no?");
        
        // El programa se queda esperando aquí para que no termine
        Thread.sleep(10000); // Espera 10 segundos
        
        // No hemos puesto ni flush() ni close()
    }
}

Escribe y ejecuta el programa. Luego responde:

¿Se ha escrito algo en prueba.txt? ¿por qué?
La solución es usar:

escritor.flush();

o mejor aún:

escritor.close();

porque close() también hace automáticamente un flush().

¿Cómo lo arreglarias? Hazlo y compruebalo. 

import java.io.FileWriter;

public class ExperimentoFlush {
    public static void main(String[] args) throws Exception {

        // Creamos el escritor hacia un archivo
        FileWriter escritor = new FileWriter("prueba.txt");

        // Escribimos algo
        escritor.write("¿Dónde está mi texto?");

        // Forzamos la escritura en el archivo
        escritor.flush();

        System.out.println("Ahora sí se ha escrito el texto.");

        // Espera 10 segundos
        Thread.sleep(10000);

        // Cerramos el archivo
        escritor.close();
    }
}
