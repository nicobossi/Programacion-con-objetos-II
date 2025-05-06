package unq.po2.tp6.banco;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import unq.po2.tp6.cliente.Cliente;
import unq.po2.tp6.credito.Credito;
import unq.po2.tp6.solicitudDeCredito.SolicitudDeCredito;
import unq.po2.tp6.solicitudDeCredito.SolicitudPersonal;

public class BancoTest {
	
	private Cliente cliente;
	private Tesoro banco;
	private SolicitudDeCredito solicitud;

	@BeforeEach
	void setUp() throws Exception {
		
		banco = new Tesoro();
		cliente = new Cliente("Nicolás", "Bossi", "Mosconi 1965", 29, Double.valueOf(800000));
		solicitud = new SolicitudPersonal(cliente, Double.valueOf(4000), 4);
	}

	@Test
	public void test_unBancoRegistraUnCliente() {
		
		banco.getRegistrador().agregarCliente(cliente);
		
		assertTrue(banco.getRegistrador().estaElCliente(cliente));
	}
	
	
	@Test
	public void test_unBancoRegistraUnaSolicitudDeCredito() {
		
		banco.getRegistrador().agregarSolicitud(solicitud);
		
		assertTrue(banco.getRegistrador().estaLaSolicitud(solicitud));
	}
	
	
	@Test
	public void test_unBancoDesembolsaParaUnCliente() {
		
		banco.getRegistrador().agregarSolicitud(solicitud);
		
		banco.desembolsar(cliente, new Credito(solicitud));
		
		assertEquals(4000, banco.totalDeDesembolso());
	}
	
	@Test
	public void test_unBancoRecibeUnPagoDelCliente() {
				
		banco.recibirPago(new Credito(solicitud));
		
		assertEquals(Double.valueOf(1000), banco.getDevoluciones());
	}

}
