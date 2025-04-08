package unq.po2.tp3.multioperator;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class MultioperatorTest {
	
	private Multioperator multioperator;
	
	@BeforeEach
	void setUp() {
		multioperator = new Multioperator();
	}
	

	@Test
	void UnMultioperadorSumaTodosSusNumeros() {
		
		multioperator.add(1);
		multioperator.add(2);
		multioperator.add(3);
		multioperator.add(4);
		multioperator.add(5);
		
		assertEquals(15, multioperator.sum());
	}
	
	@Test
	void UnMultioperadorMultiplicaTodosSusNumeros() {
		
		multioperator.add(1);
		multioperator.add(2);
		multioperator.add(3);
		multioperator.add(4);
		multioperator.add(5);
		
		assertEquals(120, multioperator.multiply());
	}
	
	@Test
	void UnMultioperadorRestaTodosSusNumerosDeMayorAMenor() {
		
		multioperator.add(18);
		multioperator.add(1);
		
		assertEquals(17, multioperator.substract());
	}
}
