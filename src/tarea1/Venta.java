package tarea1;

import java.util.ArrayList;
import java.util.List;

public class Venta {

//	Producto listaProductos[] = new Producto[20];
	
	List<Producto> listaProductos = new ArrayList<>();
	
	void anadirServicio(String nombre, int precio) {
		Producto p = new Servicio(nombre, precio);
		listaProductos.add(p);
	}
	
	void anadirArticulo(String nombre, int precio) {
		Producto p = new Articulo(nombre, precio);
		listaProductos.add(p);
	}
	
	void printProductos(){
		for(Producto p : listaProductos) {
			System.out.println(p.getNombre());
			System.out.println(p.getPrecio());
		}
	}
	
	List<Producto> getProductos(){
		return listaProductos;
	}
	
	
	int totalVenta() {
		int total = 0;
		for(Producto p : listaProductos) {
			total += p.calcularTarifa(5);
		}
		return total;
	}
}
