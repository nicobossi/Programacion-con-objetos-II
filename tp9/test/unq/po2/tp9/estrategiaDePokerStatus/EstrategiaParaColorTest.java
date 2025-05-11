package unq.po2.tp9.estrategiaDePokerStatus;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import unq.po2.tp9.carta.ICarta;

class EstrategiaParaColorTest {
	
	private EstrategiaParaColor estrategia;
	private ICarta unaCarta;
	private ICarta otraCarta;
	
	@BeforeEach
	void setUp() throws Exception {
		
		estrategia     = new EstrategiaParaColor();
		unaCarta  = mock(ICarta.class);
		otraCarta = mock(ICarta.class);
	}

	@Test
	void test_unaEstraegiaParaColorSabeSiHayJugada() {
		
		when(unaCarta.getPalo()).thenReturn("Picas");
		
		assertTrue(estrategia.hayJuego(unaCarta, unaCarta, unaCarta, unaCarta, unaCarta));
		
	}
	
	@Test
	void test_unaEstraegiaParaColorSabeSiNoHayJugada() {
		
		when(unaCarta.getPalo()).thenReturn("Picas");
		when(otraCarta.getPalo()).thenReturn("Corazones");
		
		assertFalse(estrategia.hayJuego(unaCarta, unaCarta, unaCarta, unaCarta, otraCarta));
		
	}
	
	@Test
	void test_unaEstraegiaParaColorVerificaQueHayJugada() {
		
		assertEquals("Color", estrategia.verificar());
		
	}

}
