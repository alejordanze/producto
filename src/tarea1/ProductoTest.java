package tarea1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ProductoTest {
	Producto v1 = new Producto();
	@Test
	void estaDisponible() {
		assertEquals(true, v1.estaDisponible(10));
	}

	@Test
	void noEstaDisponible() {
		assertEquals(false, v1.estaDisponible(-10));
	}
	
	@Test
	void calcularTarifaIgualAMenos1() {
		assertEquals(10, v1.calcularTarifa(10));
	}
}
