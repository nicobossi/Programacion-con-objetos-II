package unq.po2.tp5.producto;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ProductoDeCooperativaTest {
	
	private ProductoDeCooperativa producto;
		
	@BeforeEach
	void setUp() throws Exception {
		producto = new ProductoDeCooperativa(5, Double.valueOf(50));
	}

	@Test
	void test_UnProductoDeCooperativaTieneUnDescuento() {
		
		assertEquals(10, producto.descuento());
	}
	
	
	@Test
	void test_UnProductoTieneDescuentoEnSuPrecio() {
		
		assertEquals(45, producto.precio());
	}

}
