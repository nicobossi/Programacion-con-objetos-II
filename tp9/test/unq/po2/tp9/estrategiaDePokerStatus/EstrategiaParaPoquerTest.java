package unq.po2.tp9.estrategiaDePokerStatus;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import unq.po2.tp9.carta.ICarta;

class EstrategiaParaPoquerTest {

	private EstrategiaParaPoquer estrategia;
	private ICarta unaCarta;
	private ICarta otraCarta;
	
	
	@BeforeEach
	private void setUp() {
		
		estrategia = new EstrategiaParaPoquer();
		unaCarta   = mock(ICarta.class);
		otraCarta  = mock(ICarta.class);
	}
	
	@Test
	void test_unaEstrategiaDePokerSabeSiHayJuego() {
		
		when(unaCarta.getValor()).thenReturn(2);
		when(otraCarta.getValor()).thenReturn(1);
		
		assertTrue(estrategia.hayJuego(otraCarta, otraCarta, otraCarta, unaCarta, otraCarta));
	}
	
	@Test
	void test_unaEstrategiaDePokerSabeSiNoHayJuego() {
		
		when(unaCarta.getValor()).thenReturn(2);
		
		assertFalse(estrategia.hayJuego(unaCarta, unaCarta, unaCarta, unaCarta, unaCarta));
		
	}
	
	@Test
	void test_unaEstrategiaDePokerVerificaSiHayJuego() {
				
		assertEquals("Poquer", estrategia.verificar());
	}

}
