package unq.po2.tp9.estrategiaDePokerStatus;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import unq.po2.tp9.carta.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EstrategiaSinJugadaTest {

	private EstrategiaSinJuagada estrategia;
	
	@BeforeEach
	void setUp() {
		
		estrategia = new EstrategiaSinJuagada();
	}
	
	@Test
	void test_unaEstrategiaSinJugadaSabeQueNoHayJuego() {
		
		ICarta unaCarta = mock(ICarta.class);
	
		assertFalse(estrategia.hayJuego(unaCarta, unaCarta, unaCarta, unaCarta, unaCarta));
	}
	
	@Test
	void test_unaEstrategiaVerificaQueNoHayNada() {
		
		assertEquals("Nada", estrategia.verificar());
	}

}
