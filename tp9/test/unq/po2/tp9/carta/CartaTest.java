package unq.po2.tp9.carta;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CartaTest {
	
	private Carta unaCarta;
	private Carta otraCarta;

	@BeforeEach
	void setUp() throws Exception {
		
		unaCarta = new Carta(2, "Corazones"); 
		otraCarta = new Carta(1, "Corazones"); 
	}

	@Test
	void test_unaCartaTieneUnValor() {
		 
		assertEquals(2, unaCarta.getValor());
	}
	
	@Test
	void test_unaCartaTieneUnPalo() {
		 
		assertEquals("Corazones", unaCarta.getPalo());
	}
	
	@Test
	void test_unaCartaSabeSiEsSuperiorAOtra() {
		 		
		assertTrue(unaCarta.esSuperior(otraCarta));
	}
	
	@Test
	void test_unaCartaSabeSiEsDelMismoPaloQueOtra() {
		 		
		assertTrue(unaCarta.esDePalo(otraCarta));
	}

}
