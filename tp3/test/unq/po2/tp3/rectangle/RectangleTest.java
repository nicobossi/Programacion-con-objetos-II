package unq.po2.tp3.rectangle;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import unq.po2.tp3.point.Point;

class RectangleTest {

	private Rectangle rectangle; 
	private Point aPoint;
	
	@BeforeEach
	void setUp() throws Exception {
		
		aPoint = new Point(1, 2);
		rectangle = new Rectangle(aPoint, 6, 4);
	}
	
	
	@Test
	void UnRectanguloTieneUnaUbicacionEnEjeX() {
				
		assertEquals(1, rectangle.xCoordenate());
	}
	
	
	@Test
	void UnRectanguloTieneUnaUbicacionEnEjeY() {
				
		assertEquals(2, rectangle.yCoordenate());
	}
	

	@Test
	void UnRectanguloSabeSuArea() {
				
		assertEquals(24, rectangle.area());
	}
	
	
	@Test
	void UnRectanguloSabeSuPerimetro() {
		
		assertEquals(20, rectangle.perimeter());
	}
	
	
	@Test
	void UnRectanguloSabeSiEstaOrientadoVerticalmente() {
		
		Rectangle rectangle = new Rectangle(aPoint, 5, 10);
		
		assertTrue(rectangle.isVertical());
	}
	
	
	@Test
	void UnRectanguloSabeSiEstaOrientadoHorizontalmente() {
		
		Rectangle rectangle = new Rectangle(aPoint, 10, 5);
		
		assertTrue(rectangle.isHorizontally());
	}

}
