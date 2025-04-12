package unq.po2.tp5.caja;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import unq.po2.tp5.producto.ProductoDeCooperativa;

class CajaTest {

	private Caja caja; 
	
	@BeforeEach
	void setUp() throws Exception {
		caja = new Caja();
	}

	@Test
	void test_UnaCajaInicialmenteTieneMontoCero() {
		
		assertEquals(0, caja.getMontoTotal());
	}
	
	@Test
	void test_UnaCajaAcumulaMonto() {
		
		caja.acumularMonto(new ProductoDeCooperativa(1, Double.valueOf(3)));
		
		assertEquals(3, caja.getMontoTotal());
	}
	
	@Test
	void test_AlRegistrarUnProducto_ElMontoAumenta() throws Exception {
		
		caja.registrar(new ProductoDeCooperativa(5, Double.valueOf(50)));
		
		assertEquals(Double.valueOf(50), caja.getMontoTotal());
	}

}
