package unq.po2.tp6.solicitudDeCredito;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import unq.po2.tp6.banco.Tesoro;
import unq.po2.tp6.cliente.Cliente;

public class SolicitudDeCreditoTest {

	private Cliente cliente;
	private SolicitudDeCredito solicitud;
	
	@BeforeEach
	void setUp() throws Exception {
		
		cliente   = new Cliente("Nicolás", "Bossi", "Mosconi 1965", 29, Double.valueOf(800000));
		solicitud = new SolicitudPersonal(cliente, Double.valueOf(4000), 4);
	}

	@Test
	public void test_unaSolicitudDeCreditoTieneUnaCuotaMensual() {
		
		assertEquals(1000, solicitud.cuotaMensual());
	}
	
	@Test
	public void test_unaSolicitudDeCreditoTieneUnPlazo() {
		
		assertEquals(4, solicitud.getPlazo());
	}
	
	@Test
	public void test_unaSolicitudAceptadaTieneMontoSolicitado() {
		
		assertEquals(Double.valueOf(4000), solicitud.montoAceptado());
	}
	
	@Test
	public void test_unaSolicitudRechazadaNoTieneUnMontoSolicitado() {
		
		SolicitudDeCredito unSolicitud = solicitud = new SolicitudPersonal(cliente, Double.valueOf(5000000), 4);
		
		assertEquals(Double.valueOf(0), unSolicitud.montoAceptado());
	}
	
	@Test
	public void test_unaSolicitudDeCreditoEsAceptada() throws Exception {
		
		solicitud.aceptar(new Tesoro());
		
		assertTrue(solicitud.evaluar());
	}
	
	@Test
	public void test_unaSolicitudDeCreditoNoEsAceptada() {
		
		Cliente unCliente = new Cliente("Manu", "Mas", "Mosconi 1965", 29, Double.valueOf(5));
		
		SolicitudDeCredito unaSolicitud  = new SolicitudPersonal(unCliente, Double.valueOf(1000), 5);
		
		assertThrows(Exception.class, () -> unaSolicitud.aceptar(new Tesoro()));
	}

}
