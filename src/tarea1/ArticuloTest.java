package tarea1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ArticuloTest {

	
	@Test
	void creatingArticulo() {
		Articulo s1 = new Articulo("Plomeria",25,5);
		assertEquals(s1.getPrecio(), 5);
		assertEquals(s1.getNombre(), "Plomeria");
		assertEquals(s1.getSaldo(), 25);
	}

	@Test
	void creatingArticulo2() {
		Articulo s1 = new Articulo("Cerrajeria",5,150);
		assertEquals(s1.getPrecio(), 150);
		assertEquals(s1.getNombre(), "Cerrajeria");
		assertEquals(s1.getSaldo(), 5);
	}
	@Test
	void calculandoTarifa(){
		Producto s2 = new Articulo("Carpinteria", 10, 15);
		assertEquals(25,s2.calcularTarifa(10));
	}
	
	@Test 
	void noEstaDisponible() {
		Producto s3 = new Articulo("Carpinteria", 0, 15);
		assertEquals(false, s3.estaDisponible(3));
	}
	
	@Test 
	void estaDisponible() {
		Producto s3 = new Articulo("Carpinteria", 1, 15);
		assertEquals(true, s3.estaDisponible(3));
	}

}
