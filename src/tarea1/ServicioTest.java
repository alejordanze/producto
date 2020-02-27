package tarea1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ServicioTest {

	@Test
	void creatingServicio() {
		Servicio s1 = new Servicio("Plomeria",25);
		assertEquals(s1.getPrecio(), 25);
		assertEquals(s1.getNombre(), "Plomeria");
	}
	
	@Test
	void creatingServicio2() {
		Servicio s2 = new Servicio("Cerrajeria",40);
		assertEquals(s2.getPrecio(), 40);
		assertNotEquals(s2.getNombre(), "Plomeria");
	
	}
}
