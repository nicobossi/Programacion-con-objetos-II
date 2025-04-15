package unq.po2.tp5.factura;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import unq.po2.tp5.caja.Caja;

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
	
	@Test
	public void test_CuandoSePreparaUnPago_LaCajaRecibeElPago() throws Exception {
		
		Caja caja = new Caja();
		
		servicio.prepararPago(caja);
		
		assertEquals(180, caja.getMontoTotal());
	}


}
