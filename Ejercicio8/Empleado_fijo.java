package ejer8;

public class Empleado_fijo extends Empleado{ //Hereda con extends todo lo de la clase que pongas en este caso empleado lo hereda todo de ahi
	private double salarioMensual; //le pongo private para que solo esta clase toque ese dato
	
	public Empleado_fijo(String nombre, double salarioMensual) {
		super(nombre); //Se pone super para llamar al constructor del padre pa darle el nombre, es decir la clase empleado el jefe vaya
		this.salarioMensual = salarioMensual; //Si  aqui no pusiera el this el salario siempre daria 0 porque no le estamos diciendo oye coge el de arriba pa cambiarle los dineros
	}
		public double calcularSalario() {
			return salarioMensual; //Añadimos el salario de verdad
		}
		
	
	

}
