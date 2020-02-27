package tarea1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class VentaTest {

	Venta v1 = new Venta();
	
	@Test
	void test() {
		v1.anadirServicio("Fontaneria", 12);
		assertEquals(v1.getProductos().get(0).getNombre(), "Fontaneria");
	}

	@Test
	void ventaValor0() {
		assertEquals(v1.totalVenta(),0);
	}
	
	@Test
	void ventaSumas() {
		v1.anadirArticulo("Fontaneria", 12);
		v1.anadirServicio("Cerrajeria", 5);
		assertEquals(v1.totalVenta(),42);
	}
	
	
	@Test
	void ventaSumas2() {
		v1.anadirArticulo("Fontaneria", 65);
		v1.anadirServicio("Albanil", 25);
		v1.anadirArticulo("Cemento", 555);
		v1.anadirServicio("Electricidad", 250);
		v1.anadirArticulo("Tubos", 123);
		v1.anadirServicio("Albanil", 45);
		assertEquals(v1.totalVenta(),2358);
	}
}
