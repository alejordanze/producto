package tarea1;

public class Servicio extends Producto{

	private String nombre;
	private int precio;
	
	public Servicio(String nombre, int precio) {
		this.setNombre(nombre);
		this.setPrecio(precio);
	}
	
	boolean estaDisponible(int cant) {
		return cant > 0;
	}
	
	int calcularTarifa(int hours){
		return hours * this.precio;
	}
	
	@Override
	int getPrecio() {
		return this.precio;
	}
	
	void setPrecio(int nuevoPrecio) {
		this.precio = nuevoPrecio;
	}

	@Override
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}

