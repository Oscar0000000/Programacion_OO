import java.util.Scanner;

public class HolaMundoNombre {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        // Instrucciones
        System.out.println("Introduzca varios caracteres y después pulse intro para finalizar");

        // Leer texto completo
        String nombre = teclado.nextLine();

        // Saludo
        System.out.println("Hola " + nombre);
    }
}
