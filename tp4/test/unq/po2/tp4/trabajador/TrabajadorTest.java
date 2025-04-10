package unq.po2.tp4.trabajador;


import static org.junit.jupiter.api.Assertions.*;
import java.util.Calendar;
import java.util.GregorianCalendar;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import unq.po2.tp4.ingresoPercibido.IngresoPercibido;
import unq.po2.tp4.ingresoPercibido.IngresoPorHorasExtra;

public class TrabajadorTest {

	private Calendar fechaDePercepcion;
	private IngresoPercibido ingreso; 
	private IngresoPercibido ingresoConHorasExtra; 
	private Trabajador trabajador;
	
	@BeforeEach
	public void setUp() {
		fechaDePercepcion = new GregorianCalendar(2025, 05, 05);
		ingreso = new IngresoPercibido(fechaDePercepcion, Double.valueOf(50), Double.valueOf(50));
		ingresoConHorasExtra = new IngresoPorHorasExtra(fechaDePercepcion, Double.valueOf(50), Double.valueOf(50), 2);
		trabajador = new Trabajador(ingreso);
	}
	
	@Test
	public void test_UnTrabajadorSabeSuMontoTotalPercibido() {
		
		assertEquals(Double.valueOf(50), trabajador.getTotalPercibido());
	}
	
	
	@Test
	public void test_UnTrabajadorSabeSuMontoImponible() {
		
		assertEquals(Double.valueOf(50), trabajador.getMontoImponible());
	}
	
	
	@Test
	public void test_UnTrabajadorConIngresoDeHorasExtraSabeSuMontoImponible() {
		
		Trabajador unTrabajadorConHorasExtra = new Trabajador(ingresoConHorasExtra);
		
		assertEquals(Double.valueOf(0), unTrabajadorConHorasExtra.getMontoImponible());
	}
	
	
	@Test
	public void test_UnTrabajadorSabeElMontoDelImpuestoAlTrabajoAPagar() {
		
		assertEquals(Double.valueOf(1), trabajador.getImpuestoAPagar());
	}
	
	
	@Test
	public void test_UnTrabajadorDeHorasExtrasNoPagaImpuestoAlTrabajo() {
		
		Trabajador unTrabajadorConHorasExtra = new Trabajador(ingresoConHorasExtra);
		
		assertEquals(Double.valueOf(0), unTrabajadorConHorasExtra.getImpuestoAPagar());
	}
}
