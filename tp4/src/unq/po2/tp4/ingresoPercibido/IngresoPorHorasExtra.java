package unq.po2.tp4.ingresoPercibido;

import java.util.Calendar;

public class IngresoPorHorasExtra extends IngresoPercibido {

	private Integer horasExtra;

	public IngresoPorHorasExtra(Calendar fechaDePercepcion, Double concepto, Double montoPercibido, Integer horasExtra) {
		super(fechaDePercepcion, concepto, montoPercibido);
		setHorasExtra(horasExtra);
	}

	private void setHorasExtra(Integer horasExtra) {
		this.horasExtra = horasExtra;
	}
	
	@Override
	public Double montoImponible() {
		return 0.0;
	}

}
