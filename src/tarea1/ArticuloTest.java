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
}
