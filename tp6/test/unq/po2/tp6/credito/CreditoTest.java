package unq.po2.tp6.credito;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import unq.po2.tp6.banco.Tesoro;
import unq.po2.tp6.cliente.Cliente;
import unq.po2.tp6.solicitudDeCredito.SolicitudDeCredito;
import unq.po2.tp6.solicitudDeCredito.SolicitudPersonal;

class CreditoTest {

	private Cliente cliente;
	private SolicitudDeCredito solicitud;
	private Credito credito;
	
	@BeforeEach
	void setUp() throws Exception {
		
		cliente   = new Cliente("Nicolás", "Bossi", "Mosconi 1965", 29, Double.valueOf(800000));
		solicitud = new SolicitudPersonal(cliente, Double.valueOf(4000), 4);
		credito   = new Credito(solicitud);
	}

	@Test
	void test_unCreditoTieneUnaCuota() {
		
		assertEquals(1000, credito.cuota());
	}
	
	@Test
	void test_alPagarseUnCreditoElPlazoSeReduce() {
		
		credito.descontarCuota(new Tesoro(), cliente);
		
		assertEquals(3, credito.getPlazo());
	}
	
	@Test
	void test_unCreditoConElPlazoFinalizadoNoSeTrandfiereALBanco() {
		
		Tesoro unBancoSinPlata = new Tesoro();
		
		credito.descontarCuota(new Tesoro(), cliente);
		credito.descontarCuota(new Tesoro(), cliente);
		credito.descontarCuota(new Tesoro(), cliente);
		credito.descontarCuota(new Tesoro(), cliente);
		credito.descontarCuota(unBancoSinPlata, cliente);
		
		assertEquals(Double.valueOf(0), unBancoSinPlata.totalDeDesembolso());
	}

}
