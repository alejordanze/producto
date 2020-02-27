package tarea1;

public class Articulo extends Producto{

	private String nombre;
	private int saldo;
	private int precio;
	
	public Articulo(String nombre, int saldo, int precio) {
		this.setNombre(nombre);
		this.setSaldo(saldo);
		this.setPrecio(precio);
	}
	
	boolean estaDisponible(int cant) {
		return this.saldo > 0;
	}
	
	int calcularTarifa(int cant) {
		int tarifa = -1;
		if(cant <= this.saldo) {
			tarifa = cant + this.precio;
		}
		return tarifa;
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
	
	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}
}

