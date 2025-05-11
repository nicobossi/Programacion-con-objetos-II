package unq.po2.tp9.estrategiaDePokerStatus;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import unq.po2.tp9.carta.Carta;
import unq.po2.tp9.carta.ICarta;

class EstrategiaParaColorTest {
	
	private EstrategiaParaColor estrategia;
	private ICarta dosDePicaRojo;
	private ICarta tresDePicaRojo;
	private ICarta cuatroDePicaRojo;
	private ICarta cuatroDePicaAzul;

	@BeforeEach
	void setUp() throws Exception {
		
		estrategia = new EstrategiaParaColor();
		dosDePicaRojo = new Carta(2, "Picas");
		tresDePicaRojo = new Carta(3, "Picas");
		cuatroDePicaRojo = new Carta(4, "Picas");
		cuatroDePicaAzul = new Carta(4, "Corazones");
	}

	@Test
	void test_unaEstraegiaParaColorSabeSiHayJugada() {
		
		assertTrue(estrategia.hayJuego(dosDePicaRojo, tresDePicaRojo, dosDePicaRojo, tresDePicaRojo, cuatroDePicaRojo));
		
	}
	
	@Test
	void test_unaEstraegiaParaColorSabeSiNoHayJugada() {
		
		assertFalse(estrategia.hayJuego(dosDePicaRojo, tresDePicaRojo, dosDePicaRojo, tresDePicaRojo, cuatroDePicaAzul));
		
	}
	
	@Test
	void test_unaEstraegiaParaColorVerificaQueHayJugada() {
		
		assertEquals("Color", estrategia.verificar());
		
	}

}
