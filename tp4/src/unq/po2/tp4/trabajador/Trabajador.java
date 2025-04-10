package unq.po2.tp4.trabajador;

import unq.po2.tp4.ingresoPercibido.IngresoPercibido;
import unq.po2.tp4.impuesto.ImpuestoAlTrabajo;

public class Trabajador {
	
	private IngresoPercibido ingreso;

	public Trabajador(IngresoPercibido ingreso) {
		
		setIngreso(ingreso);
	}

	public Double getTotalPercibido() {
		
		return getIngreso().getMontoPercibido();
	}

	public Double getMontoImponible() {
		return getIngreso().montoImponible();
	}

	public Double getImpuestoAPagar() {
		return new ImpuestoAlTrabajo().calcularImpuesto(this);
	}
	
	private IngresoPercibido getIngreso() {
		
		return this.ingreso;
	}
	
	private void setIngreso(IngresoPercibido ingreso) {
		
		this.ingreso = ingreso;
	}

}
