package tarea1;

public interface Producto {
	
	boolean estaDisponible(int cant);
	int calcularTarifa(int cant);
	int getPrecio();
	void setPrecio(int nuevoPrecio);
	String getNombre();
	void setNombre(String nombre);
}
