package unq.po2.tp6.solicitudDeCredito;

import unq.po2.tp6.cliente.Cliente;

public class SolicitudPersonal extends SolicitudDeCredito {

	public SolicitudPersonal(Cliente solicitante, Double montoSolicitado, Integer plazoDeMeses) {
		
		super(solicitante, montoSolicitado, plazoDeMeses);
	}

	@Override
	public Boolean evaluar() {
		
		return superaIngresoAnual() && !superaIngresoMensual(descuentoSueldoMensual());
	}

	private boolean superaIngresoAnual() {
		
		return getCliente().sueldoAnual() >= 15000;
	}

	@Override
	Double descuentoSueldoMensual() {
		
		return getCliente().getSueldoMensual() / 100 * 70;
	}
}
