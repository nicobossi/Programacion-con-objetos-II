package unq.po2.tp3.counter;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CounterTest {
	
	private Counter counter;
	
	@BeforeEach
	void setUp() {
		counter = new Counter();
	}

	@Test
	void unContadorSabeLaCantidadDeNumerosPares() {
		
		counter.addNumber(1);
		counter.addNumber(2);
		
		assertEquals(counter.countPeer(), 1);
	}
	
	
	@Test
	void unContadorPuedeTenerUnaCantidadInicialDeNumeros() {
		
		Integer[] numeros = {1, 2, 3, 4, 5};
		
		Counter counter = new Counter(numeros);
		
		assertEquals(counter.countPeer(), 2);
	}
	
	@Test
	void unContadorSabeLaCantidadDeNumerosImpares() {
				
		counter.addNumber(1);
		counter.addNumber(2);
		
		assertEquals(counter.countOdd(), 1);
	}
	
	@Test
	void unContadorSabeCuantosMultiplosHay() {
				
		counter.addNumber(6);
		counter.addNumber(12);
		counter.addNumber(18);
		counter.addNumber(19);
		
		assertEquals(counter.countMultipleTo(3), 3);
	}
	
	@Test
	void unContadorNoPuedeFiltrarSiNoHayNumeros() throws Exception {
		
		int[] numbers = {100, 1, 22, 2424, 1268};
		
		assertThrows(Exception.class, () -> counter.maxWithPare(numbers));
	}
	
	@Test
	void unContadorSabeQueNumeroTieneMasPares() throws Exception {
		
		int[] numbers = {100, 1, 22, 2424, 1268};
		
		assertEquals(counter.maxWithPare(numbers), 2424);
	}
	
	@Test
	void unContadorDaMenosSiAlgunNumeroEsNegativo() {
		
		assertEquals(-1, counter.maxMultipleBetween(-9, 3));
	}
	
	@Test
	void unContadorSabeElMultiploMaximoEntreDosNumeros() {
		
		assertEquals(999, counter.maxMultipleBetween(9, 3));
	}
	

}
