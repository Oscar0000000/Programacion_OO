import java.util.Scanner;

public class PrediccionAstral {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        // Pedir nombre
        System.out.print("¿Cuál es tu nombre? ");
        String nombre = teclado.nextLine();

        // Pedir años
        System.out.print("¿Cuántos años crees que vivirás? ");
        int anios = teclado.nextInt();

        // Respuesta final
        System.out.println("Hola " + nombre +
                ", los astros dicen que morirás a los "
                + (anios + 10)
                + " por culpa de un café frío.");
    }
}
