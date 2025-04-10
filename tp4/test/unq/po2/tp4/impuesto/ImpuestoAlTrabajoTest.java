package unq.po2.tp4.impuesto;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Calendar;
import java.util.GregorianCalendar;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import unq.po2.tp4.ingresoPercibido.IngresoPercibido;
import unq.po2.tp4.trabajador.Trabajador;

public class ImpuestoAlTrabajoTest {
	
	private ImpuestoAlTrabajo impuestoAlTrabajo;
	private Calendar fechaDePercepcion;
	private IngresoPercibido ingreso; 
	private Trabajador trabajador;

	@BeforeEach
	public void setUp() throws Exception {
		
		impuestoAlTrabajo = new ImpuestoAlTrabajo();
		fechaDePercepcion = new GregorianCalendar(2025, 05, 05);
		ingreso = new IngresoPercibido(fechaDePercepcion, Double.valueOf(50), Double.valueOf(50));
		trabajador = new Trabajador(ingreso);
	}

	@Test
	public void test_UnImpuestoAlTrabajadorTieneUnDescuentoDe2() {
		
		assertEquals(2, impuestoAlTrabajo.porcentaje());
	}
	
	
	@Test
	public void test_UnImpuestoAlTrabajadorCalculaElMontoAPagar() {
		
		assertEquals(1, impuestoAlTrabajo.calcularImpuesto(trabajador));
	}

}
