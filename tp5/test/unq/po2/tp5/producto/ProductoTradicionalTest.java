package unq.po2.tp5.producto;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import unq.po2.tp5.caja.Caja;

public class ProductoTradicionalTest {

	private ProductoTradicional producto;
	
	@BeforeEach
	void setUp() throws Exception {
		producto = new ProductoTradicional(1, Double.valueOf(100));
	}

	@Test
	public void test_UnProductoTieneUnStock() {
		
		assertTrue(producto.hayStock());
	}
	
	@Test
	public void test_UnProductoDecrementaSuStock() throws Exception {
				
		producto.decrementarStock();
		
		assertFalse(producto.hayStock());
	}
	
	@Test
	public void test_UnProductoNoTieneStock() throws Exception {
		
		ProductoTradicional producto = new ProductoTradicional(1, Double.valueOf(0));
		
		producto.decrementarStock();
		
		assertThrows(Exception.class, () -> producto.decrementarStock());
	}
	
	
	@Test
	public void test_CuandoUnProductoEsPreparado_DecrementaSuStock() throws Exception {
		
		producto.prepararPago(new Caja());
		
		assertFalse(producto.hayStock());
	}
	
	@Test
	public void test_UnProductoTieneUnPrecio() {
		
		assertEquals(Double.valueOf(100), producto.precio());
	}

}
