package unq.po2.tp9.estrategiaDePokerStatus;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import unq.po2.tp9.carta.Carta;
import unq.po2.tp9.carta.ICarta;

class EstrategiaParaPoquerTest {

	private EstrategiaParaPoquer estrategia;
	private ICarta dosDeDiamantes;
	private ICarta tresCorazones;
	
	
	@BeforeEach
	private void setUp() {
		
		estrategia = new EstrategiaParaPoquer();
		dosDeDiamantes = new Carta(2, "Diamante");
		tresCorazones = new Carta(3, "Corazones");
	}
	
	@Test
	void test_unaEstrategiaDePokerSabeSiHayJuego() {
		
		assertTrue(estrategia.hayJuego(tresCorazones, tresCorazones, tresCorazones, dosDeDiamantes, tresCorazones));
	}
	
	@Test
	void test_unaEstrategiaDePokerSabeSiNoHayJuego() {
				
		assertFalse(estrategia.hayJuego(tresCorazones, tresCorazones, tresCorazones, tresCorazones, tresCorazones));
		
	}
	
	@Test
	void test_unaEstrategiaDePokerVerificaSiHayJuego() {
				
		assertEquals("Poquer", estrategia.verificar());
		
	}

}
