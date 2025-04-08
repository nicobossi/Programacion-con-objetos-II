package unq.po2.tp3.point;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class PointTest {

	private Point point;
	
	@BeforeEach
	void setUp() throws Exception {
		
		point = new Point();
	}

	@Test
	void InicialmenteUnPuntoTieneCoordenada0EnX() {
		
		assertEquals(0, point.getX());
	}
	
	@Test
	void InicialmenteUnPuntoTieneCoordenada0EnY() {
		
		assertEquals(0, point.getY());
	}
	
	@Test
	void UnPuntoPuedeTenerInicialmenteUnaCoordenadaEspecificaEnX() {
		
		Point aPoint = new Point(3, 5);
		
		assertEquals(3, aPoint.getX());
	}
	
	
	@Test
	void UnPuntoPuedeTenerInicialmenteUnaCoordenadaEspecificaEnY() {
		
		Point aPoint = new Point(3, 5);
		
		assertEquals(5, aPoint.getY());
	}
	
	
	@Test
	void AlMoverUnPuntoAOtraPosicion_ElEjeXCambia() {
		
		point.MoveTo(1, 2);
		
		assertEquals(1, point.getX());
	}
	
	
	@Test
	void AlMoverUnPuntoAOtraPosicion_ElEjeYCambia() {
		
		point.MoveTo(1, 2);
		
		assertEquals(2, point.getY());
	}
	
	@Test
	void AlSumarleUnPunto_ElEjeXCambia() {
		
		Point aPoint = new Point(2, 2);
		
		aPoint.sumTo(new Point(1, 2));
		
		assertEquals(3, aPoint.getX());
	}
	
	
	@Test
	void AlSumarleUnPunto_ElEjeYCambia() {
		
		Point aPoint = new Point(2, 2);
		
		aPoint.sumTo(new Point(1, 2));
		
		assertEquals(4, aPoint.getY());
	}

}
