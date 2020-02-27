package tarea1;

public class Servicio implements Producto{

	private String nombre;
	private int precio;
	
	public Servicio(String nombre, int precio) {
		this.setNombre(nombre);
		this.setPrecio(precio);
	}
	
	@Override
	public boolean estaDisponible(int cant) {
		return cant > 0;
	}
	
	@Override
	public int calcularTarifa(int hours){
		return hours * this.precio;
	}
	
	public int getPrecio() {
		return this.precio;
	}
	
	public void setPrecio(int nuevoPrecio) {
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

