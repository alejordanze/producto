package tarea1;

public class Producto {

	public Producto() {	
	}
	
	boolean estaDisponible(int cant) {
		return cant > 0;
	}
	
	int calcularTarifa(int cant) {
		return cant;
	}
}
