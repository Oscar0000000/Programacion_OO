package concesionario;


public class Vehiculo {

		//ATRIBUTOS DE LA CLASE VEHICULO
		String matricula;
		String marca;
		int anioFabricacion;
		double precio;
		TipoVehiculo tipo;
	


	//CONSTRUCTORES
	Vehiculo(String matricula, String marca, int anioFabricacion, double precio, TipoVehiculo tipo) {
		this.matricula = matricula;
		this.marca = marca;
		this.anioFabricacion = anioFabricacion;
		this.precio = precio;
		this.tipo = tipo;
		
	}
	
	
	//METODOS
	public void mostrarInformacion() {
		System.out.println("Matricula" + matricula);
		System.out.println("Marca" + marca);
		System.out.println("Año fabricacion" + anioFabricacion);
		System.out.println("Precio" + precio);
		System.out.println("Tipo" + tipo);
	}
	
	public boolean esAntiguo() {
		int anioActual = 2026;
		return (anioActual - anioFabricacion) > 10;
		
	}
	public void aplicarDescuento(double porcentaje) {
		precio = precio - (precio * porcentaje / 100);
		
	}
}


