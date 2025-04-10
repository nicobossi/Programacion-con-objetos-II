package unq.po2.tp4.ingresoPercibido;

import static org.junit.jupiter.api.Assertions.*;
import java.util.Calendar;
import java.util.GregorianCalendar;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class IngresoPercibidoTest {

	private Calendar fechaDePercepcion;
	private IngresoPercibido ingreso;
	
	@BeforeEach
	void setUp() throws Exception {
		fechaDePercepcion = new GregorianCalendar(2025, 05, 05);
		ingreso = new IngresoPercibido(fechaDePercepcion, Double.valueOf(50), Double.valueOf(50));
	}

	@Test
	void test_UnIngresoTieneUnMontoPercibido() {
		
		assertEquals(Double.valueOf(50), ingreso.getMontoPercibido());
	}
	
	@Test
	void test_UnIngresoCalculaTieneComoMontoImponibleElPercibido() {
		
		assertEquals(Double.valueOf(50), ingreso.montoImponible());
	}

}
