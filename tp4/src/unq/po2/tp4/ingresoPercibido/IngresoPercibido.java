package unq.po2.tp4.ingresoPercibido;

import java.util.Calendar;

public class IngresoPercibido {

	protected Double montoPercibido;
	protected Double concepto;
	protected Calendar fechaDePercepcion;
	
	public IngresoPercibido(Calendar fechaDePercepcion, Double concepto, Double montoPercibido) {
		
		setFechaDePercepcion(fechaDePercepcion);
		setConcepto(concepto);
		setMontoPercibido(montoPercibido);
	}

	private void setConcepto(Double concepto) {
		
		this.concepto = concepto;
	}

	private void setFechaDePercepcion(Calendar fechaDePercepcion) {
		
		this.fechaDePercepcion = fechaDePercepcion;
	}
	
	private void setMontoPercibido(Double montoPercibido) {
		this.montoPercibido = montoPercibido;
	}

	public Double getMontoPercibido() {
		return this.montoPercibido;
	}

	public Double montoImponible() {
		return getMontoPercibido();
	}
}
