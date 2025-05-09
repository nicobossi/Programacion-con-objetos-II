package unq.po2.tp3.rectangle;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import unq.po2.tp3.point.Point;

class SquareTest {
	
	private Rectangle square;
	private Point aPoint;

	@BeforeEach
	void setUp() throws Exception {
		aPoint = new Point();
		square = new Square(aPoint, 10);
	}

	@Test
	void UnCuadradoTieneTodosLosLadosIguales() {
		
		assertFalse(square.isHorizontally());
		assertFalse(square.isVertical());
	}
	
	
	@Test
	void ElAreaEsLaLongitudDeSusLadosElevadoALaDos() {
		
		Square aSquare = new Square(aPoint, 10);
		
		assertEquals(100, aSquare.area());
	}
	
	
	@Test
	void ElPerimetroSonSusLadosPorCuatro() {

		Square aSquare = new Square(aPoint, 5);
		
		assertEquals(5 * 4, aSquare.perimeter());
		
	}

}
