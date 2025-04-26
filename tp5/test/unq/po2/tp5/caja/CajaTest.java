package unq.po2.tp5.caja;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import unq.po2.tp5.factura.Impuesto;
import unq.po2.tp5.factura.Servicio;
import unq.po2.tp5.pagable.Pagable;
import unq.po2.tp5.producto.ProductoDeCooperativa;

class CajaTest {

	private Caja caja; 
	private Pagable producto;
	private Pagable servicio;
	private Pagable impuesto;
	
	@BeforeEach
	void setUp() throws Exception {
		
		caja = new Caja();
		producto = new ProductoDeCooperativa("Arroz", 5, Double.valueOf(50));
		servicio = new Servicio(Double.valueOf(40), 2);
		impuesto = new Impuesto(Double.valueOf(50));
	}

	@Test
	void test_UnaCajaInicialmenteTieneMontoCero() {
		
		assertEquals(0, caja.getMontoTotal());
	}
	
	@Test
	void test_UnaCajaAcumulaMonto() {
		
		caja.acumularMonto(producto);
		
		assertEquals(Double.valueOf(45), caja.getMontoTotal());
	}
	
	@Test
	void test_AlRegistrarUnProducto_ElMontoAumenta() throws Exception {
		
		caja.procesar(producto);
		
		assertEquals(Double.valueOf(45), caja.getMontoTotal());
	}
	
	@Test
	void test_AlRegistrarPagables_ElMontoTotalSeSuman() throws Exception {
		
		caja.procesar(producto);
		caja.procesar(servicio);
		caja.procesar(impuesto);
		
		assertEquals(Double.valueOf(175), caja.getMontoTotal());
	}

}
