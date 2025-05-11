package unq.po2.tp9.estrategiaDePokerStatus;

import static org.junit.jupiter.api.Assertions.*;
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
		
		ICarta dosDePicas = new Carta(2, "Picas");
		
		assertFalse(estrategia.hayJuego(dosDePicas, dosDePicas, dosDePicas, dosDePicas, dosDePicas));
	}
	
	@Test
	void test_unaEstrategiaVerificaQueNoHayNada() {
		
		assertEquals("Nada", estrategia.verificar());
	}

}
