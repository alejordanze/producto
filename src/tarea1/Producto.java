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
	
	int getPrecio() {
		return -1;
	}
	
	void setPrecio(int nuevoPrecio) {
	
	}

	public String getNombre() {
		return "Hola";
	}

	public void setNombre(String nombre) {
	}
}
