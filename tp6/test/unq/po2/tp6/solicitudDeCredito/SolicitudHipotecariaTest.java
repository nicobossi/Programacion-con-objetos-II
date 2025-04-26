package unq.po2.tp6.solicitudDeCredito;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import unq.po2.tp6.cliente.Cliente;
import unq.po2.tp6.iGarantia.IGarantia;
import unq.po2.tp6.propiedad.Propiedad;

public class SolicitudHipotecariaTest { 
	
	private Cliente cliente;
	private SolicitudDeCredito solicitud;
	private IGarantia garantia;
	
	
	@BeforeEach
	void setUp() throws Exception {
		
		garantia  = new Propiedad("Mi casa", "Rodo 1234", Double.valueOf(500000));
		cliente   = new Cliente("Nicolás", "Bossi", "Mosconi 1965", 29, Double.valueOf(800000));
		solicitud = new SolicitudHipotecaria(garantia, cliente, Double.valueOf(4000), 4);
	}

	@Test
	public void test_unaSolicitudEsAceptada() {
		
		assertTrue(solicitud.evaluar());
	}

}
