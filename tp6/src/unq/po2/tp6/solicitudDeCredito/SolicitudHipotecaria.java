package unq.po2.tp6.solicitudDeCredito;

import unq.po2.tp6.cliente.Cliente;
import unq.po2.tp6.iGarantia.IGarantia;

public class SolicitudHipotecaria extends SolicitudDeCredito {
	
	private IGarantia garantia;

	public SolicitudHipotecaria(IGarantia garantia, Cliente cliente, Double montoSolicitado, Integer plazoDeMeses) {
		
		super(cliente, montoSolicitado, plazoDeMeses);
		setGarantia(garantia);
		
	}

	@Override
	public Boolean evaluar() {
		
		return !superaIngresoMensual(descuentoSueldoMensual()) && !superaGarantia() && esSolicitanteMenor();
	}
	
	private Boolean esSolicitanteMenor() {

		return getCliente().getEdad() < 65;
		
	}

	private Boolean superaGarantia() {
		
		return getMontoSolicitado() > getGarantia().valorFiscal() / 100 * 70;
	}

	private IGarantia getGarantia() {
		
		return this.garantia;
	}

	private void setGarantia(IGarantia garantia) {
		
		this.garantia = garantia;
	}

	@Override
	Double descuentoSueldoMensual() {
		
		return getCliente().getSueldoMensual() / 100 * 50;
	}

}
