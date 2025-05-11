package unq.po2.tp6.solicitudDeCredito;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import unq.po2.tp6.cliente.Cliente;

public class SolicitudPersonalTest {
	
	private Cliente cliente;
	private SolicitudDeCredito solicitud;

	@BeforeEach
	void setUp() throws Exception {
		
		cliente = new Cliente("Nicolás", "Bossi", "Mosconi 1965", 29, Double.valueOf(800000));
		solicitud = new SolicitudPersonal(cliente, Double.valueOf(4000), 4);
	}

	@Test
	public void test_unaSolicitudEsAceptada() {
		
		assertTrue(solicitud.evaluar());
	}

}
