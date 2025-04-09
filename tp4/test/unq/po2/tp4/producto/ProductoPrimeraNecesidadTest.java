package unq.po2.tp4.producto;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ProductoPrimeraNecesidadTest {

	private ProductoPrimeraNecesidad leche;
	private ProductoPrimeraNecesidad arroz;
	
	@BeforeEach
	public void setUp() {
		leche = new ProductoPrimeraNecesidad("Leche", 8d, false);
		arroz = new ProductoPrimeraNecesidad("Arroz", 6d, true, 0.5d);
	}
	
	@Test
	public void testCalcularPrecio() {
		assertEquals(Double.valueOf(7.2), leche.getPrecio());
	}
	
	@Test
	public void testVariarDescuento() {
		assertEquals(Double.valueOf(3d), arroz.getPrecio());
	}
}
