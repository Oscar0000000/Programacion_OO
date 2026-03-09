package ejer8;

public class Main {

    public static void main(String[] args) {
        Empleado[] nomina = {   //Creamos el array con [] y sin meter los empleados dentro deben de ir fuera
            new Empleado_fijo("Manuel Lopez", 2000),
            new Empleado_horas("Juan Perez", 40, 10.0)
        };

        for (Empleado e : nomina) { //El bucle FOR debe estar DENTRO de las llaves del main 
            // Usamos "e" porque es el empleado de la vuelta actual
            // Gracias al polimorfismo, e.calcularSalario() sabrá si es fijo o por horas
            System.out.println("Nombre: " + e.nombre + " - Salario: " + e.calcularSalario());
        }
        
    } 
} 
