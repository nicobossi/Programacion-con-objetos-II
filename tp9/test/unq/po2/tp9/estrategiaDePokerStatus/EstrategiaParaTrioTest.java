package unq.po2.tp9.estrategiaDePokerStatus;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import unq.po2.tp9.carta.ICarta;

class EstrategiaParaTrioTest {

	private EstrategiaParaTrio estrategia;
	private ICarta otraCarta;
	private ICarta unaCarta;
	
	@BeforeEach
	void setUp() {
		
		estrategia = new EstrategiaParaTrio();
		otraCarta  = mock(ICarta.class);
		unaCarta   = mock(ICarta.class);
	}

	@Test
	void test_unaEstrategiaParaTrioSabeSiHayJugada() {
		
		when(unaCarta.getValor()).thenReturn(1, 3, 4);
		when(otraCarta.getValor()).thenReturn(2);
		
		assertTrue(estrategia.hayJuego(otraCarta, unaCarta, otraCarta, unaCarta, otraCarta));
		
	}
	
	@Test
	void test_unaEstrategiaParaTrioSabeSiNoHayJugada() {
		
		when(otraCarta.getValor()).thenReturn(2);
		
		assertFalse(estrategia.hayJuego(otraCarta, otraCarta, otraCarta, otraCarta, otraCarta));
		
	}
	
	@Test
	void test_unaEstrategiaParaTrioVerificaSuJugada() {
		
		assertEquals("Trio", estrategia.verificar());
		
	}

}
