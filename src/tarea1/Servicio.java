package tarea1;

public class Servicio extends Producto{

	private String nombre;
	private int precio;
	
	public Servicio(String nombre, int precio) {
		this.setNombre(nombre);
		this.setPrecio(precio);
	}
	
	int getPrecio() {
		return this.precio;
	}
	
	void setPrecio(int nuevoPrecio) {
		this.precio = nuevoPrecio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
