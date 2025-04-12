package unq.po2.tp5.servicio;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ServicioTest {
	
	private Servicio servicio;

	@BeforeEach
	void setUp() throws Exception {
		
		servicio = new Servicio(Double.valueOf(20), 9);
	}

	@Test
	void test_UnServicioTieneUnPrecio() {
		
		assertEquals(180, servicio.precio());
	}

}
