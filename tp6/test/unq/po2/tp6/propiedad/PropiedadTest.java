package unq.po2.tp6.propiedad;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropiedadTest {
	
	private Propiedad propiedad; 

	@BeforeEach
	void setUp() throws Exception {
		
		propiedad = new Propiedad("Mi casa", "Rodo 456", Double.valueOf(5000));
	}

	@Test
	void test_unaPropiedadTieneUnaDireccion() {
		
		assertEquals("Rodo 456", propiedad.getDireccion());
	}
	
	@Test
	void test_unaPropiedadTieneUnaDescripcion() {
		
		assertEquals("Mi casa", propiedad.getDescripcion());
	}
	
	@Test
	void test_unaPropiedadTieneUnValor() {
		
		assertEquals(Double.valueOf(5000), propiedad.valorFiscal());
	}

}
