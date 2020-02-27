package tarea1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ServicioTest {
	Servicio s2 = new Servicio("Cerrajeria",40);
	
	@Test
	void creatingServicio() {
		Servicio s1 = new Servicio("Plomeria",25);
		assertEquals(s1.getPrecio(), 25);
		assertEquals(s1.getNombre(), "Plomeria");
	}
	
	@Test
	void creatingServicio2() {
		assertEquals(s2.getPrecio(), 40);
		assertNotEquals(s2.getNombre(), "Plomeria");
	}
	@Test
	void calculandoTarifa(){
		assertEquals(80,s2.calcularTarifa(2));
	}
	
	@Test
	void calculandoTarifa2(){
		Producto s3 = new Servicio("Cerrajeria", 50);
		assertEquals(100,s3.calcularTarifa(2));
	}
	
	@Test 
	void estaDisponible() {
		
	}
}
