package unq.po2.tp9.carta;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CartaTest {
	
	private Carta unaCarta;
	private ICarta otraCarta;

	@BeforeEach
	void setUp() throws Exception {
		
		unaCarta = new Carta(2, "Corazones"); 
		otraCarta = mock(ICarta.class);
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
		
		when(otraCarta.getValor()).thenReturn(1);
		
		assertTrue(unaCarta.esSuperior(otraCarta));
		
		verify(otraCarta, times(1)).getValor();
	}
	
	@Test
	void test_unaCartaSabeSiEsDelMismoPaloQueOtra() {
		
		when(otraCarta.getPalo()).thenReturn(unaCarta.getPalo());
		
		assertTrue(unaCarta.esDePalo(otraCarta));
		
		verify(otraCarta, times(1)).getPalo();
	}

}
