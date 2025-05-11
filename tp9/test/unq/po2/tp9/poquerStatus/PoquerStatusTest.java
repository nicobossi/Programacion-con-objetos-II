package unq.po2.tp9.poquerStatus;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import unq.po2.tp9.carta.ICarta;

class PoquerStatusTest {

	private PoquerStatus poquer;
	private ICarta unaCarta;
	private ICarta otraCarta;
	
	@BeforeEach
	private void setUp() {
		
		poquer    = new PoquerStatus();
		unaCarta  = mock(ICarta.class);
		otraCarta = mock(ICarta.class);
	}
	
	@Test
	void test_pokerStatusIndicaQueHayPoquer() {
		
		when(unaCarta.getValor()).thenReturn(1);
		when(otraCarta.getValor()).thenReturn(2);
		
		assertEquals("Poquer", poquer.verificar(unaCarta, unaCarta, unaCarta, unaCarta, otraCarta));
	}
	
	@Test
	void test_pokerStatusIndicaQueNoHayNingunaJugada() {
		
		when(unaCarta.getPalo()).thenReturn("Corazones", "Diamantes");
		when(unaCarta.getValor()).thenReturn(1);
		
		assertEquals("Nada", poquer.verificar(unaCarta, unaCarta, unaCarta, unaCarta, unaCarta));
	}
	
	@Test
	void test_pokerStatusIndicaQueHayTrio() {
		
		when(unaCarta.getValor()).thenReturn(1);
		when(otraCarta.getValor()).thenReturn(2);
		
		assertEquals("Trio", poquer.verificar(unaCarta, unaCarta, unaCarta, otraCarta, otraCarta));
	}
	
	@Test
	void test_pokerStatusIndicaQueHayColor() {
		
		when(unaCarta.getPalo()).thenReturn("Picas");
		
		assertEquals("Color", poquer.verificar(unaCarta, unaCarta, unaCarta, unaCarta, unaCarta));
	}

}
