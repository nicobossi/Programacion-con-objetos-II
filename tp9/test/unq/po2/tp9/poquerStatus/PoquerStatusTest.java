package unq.po2.tp9.poquerStatus;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import unq.po2.tp9.carta.Carta;
import unq.po2.tp9.carta.ICarta;

class PoquerStatusTest {

	private PoquerStatus poquer;
	private ICarta tresDiamantes;
	private ICarta dosDeDiamantes;
	private ICarta cuatroDePica;
	private ICarta cuatroDeCorazones;
	private ICarta dosDePicas;
	private ICarta cincoDeDiamantes;
	
	@BeforeEach
	private void setUp() {
		
		poquer = new PoquerStatus();
		tresDiamantes = new Carta(3, "Diamantes");
		dosDeDiamantes = new Carta(2, "Diamantes");
		cuatroDePica = new Carta(4, "Pica");
		cuatroDeCorazones = new Carta(4, "Corazones");
		dosDePicas = new Carta(2, "Picas");
		cincoDeDiamantes = new Carta(5, "Diamantes");
	}
	
	@Test
	void test_pokerStatusIndicaQueHayPoquer() {
		
		Carta dosDePicas = new Carta(2, "Picas");
		Carta cincoDeDiamantes = new Carta(5, "Diamantes");
		
		assertEquals("Poquer", poquer.verificar(dosDePicas, dosDePicas, dosDePicas, dosDePicas, cincoDeDiamantes));
	}
	
	@Test
	void test_pokerStatusIndicaQueNoHayNingunaJugada() {
		
		assertEquals("Nada", poquer.verificar(dosDePicas, cincoDeDiamantes, tresDiamantes, dosDePicas, tresDiamantes));
	}
	
	@Test
	void test_pokerStatusIndicaQueHayTrio() {
		
		assertEquals("Trio", poquer.verificar(cuatroDePica, cuatroDeCorazones, cuatroDeCorazones, dosDeDiamantes, tresDiamantes));
	}
	
	@Test
	void test_pokerStatusIndicaQueHayColor() {
				
		assertEquals("Color", poquer.verificar(tresDiamantes, tresDiamantes, dosDeDiamantes, dosDeDiamantes, cincoDeDiamantes));
	}

}
