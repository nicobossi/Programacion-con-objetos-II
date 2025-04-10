package unq.po2.tp4.impuesto;

import unq.po2.tp4.trabajador.Trabajador;

public class ImpuestoAlTrabajo {

	public Integer porcentaje() {
		return 2;
	}

	public Double calcularImpuesto(Trabajador trabajador) {

		return trabajador.getMontoImponible() / 100 * porcentaje();
	}

}
