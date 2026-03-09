package ejer8;

class Empleado {
    protected String nombre; //Atributo y pongo protected para que las clases hijas si puedan ver el nombre los demas no podran y asi las hijas lo usen
    
    public Empleado(String nombre) { //Constructor
    	this.nombre = nombre; //Con this se diferencia el atributo del parametro 
    }
    
    public double calcularSalario() { //Metodo que se pide
    	return 0;
    	
    	
    }
    
    
}
