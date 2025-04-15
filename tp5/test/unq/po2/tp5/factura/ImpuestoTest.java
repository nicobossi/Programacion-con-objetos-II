package unq.po2.tp5.factura;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import unq.po2.tp5.caja.Caja;

public class ImpuestoTest {
	
	private Impuesto impuesto;
	

	@BeforeEach
	public void setUp() throws Exception {
		
		impuesto = new Impuesto(Double.valueOf(10));
	}

	@Test
	public void test_UnImpuestoTieneUnaTasaFija() {
		
		assertEquals(Double.valueOf(10), impuesto.precio());
	}
	
	
	@Test
	public void test_CuandoSePreparaUnPago_LaCajaRecibeElPago() throws Exception {
		
		Caja caja = new Caja();
		
		impuesto.prepararPago(caja);
		
		assertEquals(Double.valueOf(10), caja.getMontoTotal());
	}

}
