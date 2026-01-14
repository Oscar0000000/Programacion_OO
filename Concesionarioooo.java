package concesionario;
public class Concesionarioooo {
	//CREO TRES OBJETOS NUEVOS
	public static void main(String[] args) {
		Vehiculo seat = new Vehiculo("12345AAA", "Seat", 2018, 15000, TipoVehiculo.TURISMO);
		Vehiculo kawasaki = new Vehiculo("45678CCC", "Kawasaki", 2012, 9000, TipoVehiculo.MOTOCICLETA);
		Vehiculo volvo = new Vehiculo("78965FFF", "Volvo", 2000, 12000, TipoVehiculo.CAMION);
		
		//USO EL OPERADOR . PARA LLAMAR METODOS
		System.out.println("Antes de descuento");
		seat.mostrarInformacion();
		kawasaki.mostrarInformacion();
		volvo.mostrarInformacion();
		
		//ACCEDO A ATRIBUTOS
		System.out.println("Marca primer vehiculo" + seat.marca);
		System.out.println("Marca segundo vehiculo" + kawasaki.marca);
		System.out.println("Marca tercer vehiculo" + volvo.marca);

		//REFERENCIAS
		Vehiculo referencia = seat;
		referencia.aplicarDescuento(10);
		
		//DESPUES DE DESCUENTO
		System.out.println("Despues del descuento");
		seat.mostrarInformacion();
		kawasaki.mostrarInformacion();
		volvo.mostrarInformacion();

		
	}

}
