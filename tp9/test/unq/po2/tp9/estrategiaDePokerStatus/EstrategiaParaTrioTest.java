package unq.po2.tp9.estrategiaDePokerStatus;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import unq.po2.tp9.carta.Carta;
import unq.po2.tp9.carta.ICarta;

class EstrategiaParaTrioTest {
	
	private EstrategiaParaTrio estrategia;
	private ICarta dosDePicas;
	private ICarta dosDeCorazones;
	private ICarta dosDeDiamantes;
	private ICarta cuatroDeDiamantes;
	
	@BeforeEach
	void setUp() {
		estrategia = new EstrategiaParaTrio();
		dosDePicas = new Carta(2, "Picas");
		dosDeCorazones = new Carta(2, "Corazones");
		dosDeDiamantes = new Carta(2, "Diamantes");
		cuatroDeDiamantes = new Carta(4, "Diamantes");
		
	}

	@Test
	void test_unaEstrategiaParaTrioSabeSiHayJugada() {
		
		assertTrue(estrategia.hayJuego(dosDeCorazones, dosDeDiamantes, dosDePicas, cuatroDeDiamantes, cuatroDeDiamantes));
		
	}
	
	@Test
	void test_unaEstrategiaParaTrioSabeSiNoHayJugada() {
		
		assertFalse(estrategia.hayJuego(dosDeCorazones, dosDeDiamantes, dosDePicas, dosDeDiamantes, cuatroDeDiamantes));
		
	}
	
	@Test
	void test_unaEstrategiaParaTrioVerificaSuJugada() {
		
		assertEquals("Trio", estrategia.verificar());
		
	}

}
