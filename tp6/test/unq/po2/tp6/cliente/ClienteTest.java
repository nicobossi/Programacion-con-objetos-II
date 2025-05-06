package unq.po2.tp6.cliente;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import unq.po2.tp6.banco.Tesoro;
import unq.po2.tp6.credito.Credito;
import unq.po2.tp6.solicitudDeCredito.SolicitudPersonal;
import unq.po2.tp6.iSolicitudFinanciera.ISolicitudFinanciera;

public class ClienteTest {

	private Cliente cliente;
	private Tesoro banco;
	
	@BeforeEach
	void setUp() throws Exception {
		
		banco = new Tesoro();
		cliente = new Cliente("Nicolás", "Bossi", "Mosconi 1965", 29, Double.valueOf(800000));
	}
	
	@Test
	public void test_unClienteTieneUnNombreCompleto() {
		
		assertEquals("Nicolás Bossi", cliente.nombreCompleto());
	}
	
	@Test
	public void test_unClienteTieneUnaDireccion() {
		
		assertEquals("Mosconi 1965", cliente.getDireccion());
	}

	@Test
	public void test_unClienteTieneUnaEdad() {
		
		assertEquals(29, cliente.getEdad());
	}
	
	@Test
	public void test_unClienteTieneUnSueldoMensual() {
		
		assertEquals(Double.valueOf(800000), cliente.getSueldoMensual());
	}
	
	@Test
	public void test_unClienteTieneUnSueldoAnual() {
		
		assertEquals(Double.valueOf(9600000), cliente.sueldoAnual());
	}
	
	@Test
	public void test_unClienteRecibeFinanciamiento() {
		
		Credito unCredito = new Credito(new SolicitudPersonal(cliente, Double.valueOf(4000), 4));
		
		cliente.recibir(unCredito);
		
		assertEquals(Double.valueOf(1000), unCredito.cuota());
	}
	
	@Test
	public void test_unClienteLePagaAlBanco() throws Exception {
		
		ISolicitudFinanciera unaSolicitudDeCredito = new SolicitudPersonal(cliente, Double.valueOf(4000), 4);
		
		unaSolicitudDeCredito.aceptar(banco);
		
		cliente.pagar(banco);
		
		assertEquals(Double.valueOf(1000), banco.getDevoluciones());
	}
}
