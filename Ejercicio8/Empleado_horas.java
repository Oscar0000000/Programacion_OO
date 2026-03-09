package ejer8;

public class Empleado_horas extends Empleado { //Con extend hereda lo que hay en la clase padre qeu en este caso es empleado
	private double horastrabajadas;
	private double preciohora;
	
	public Empleado_horas(String nombre, double horas, double precio) {
		super(nombre); //Se pone super pa llamar al constructor padre
		this.horastrabajadas = horas;
		this.preciohora = precio; //Ponemos this para que sepamos que debe coger el de arriba
		
	}
		public double calcularSalario() {
			return horastrabajadas * preciohora; //Por ultimo ponemos las horas trabajadas por el precio hora
		}
	

}
