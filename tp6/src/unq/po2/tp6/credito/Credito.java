package unq.po2.tp6.credito;

import unq.po2.tp6.banco.Banco;
import unq.po2.tp6.cliente.Cliente;
import unq.po2.tp6.iOperacionFinanciera.IOperacionFinanciera;
import unq.po2.tp6.solicitudDeCredito.SolicitudDeCredito;

public class Credito implements IOperacionFinanciera {
	
	private Double  cuotaMensual;
	private Integer mesesDePlazo;

	public Credito(SolicitudDeCredito solicitud) {
		
		setMonto(solicitud.cuotaMensual());
		setPlazo(solicitud.getPlazo());
	}

	@Override
	public Double cuota() {
		
		return this.cuotaMensual;
	}

	@Override
	public void descontarCuota(Banco unBanco, Cliente unCliente) {
		
		new Transaccion().pagar(unBanco, unCliente, this);
	}
	
	boolean quedanPlazos() {
		
		return getPlazo() > 0;
	}
	
	void disminuirPlazo() {
		
		setMesesDePlazo(getPlazo() - 1);
	}

	public Integer getPlazo() {
		
		return this.mesesDePlazo;
	}
	
	private void setMesesDePlazo(Integer mesesDePlazo) {
		
		this.mesesDePlazo = mesesDePlazo;
	}

	private void setMonto(Double cuotaMensual) {
		
		this.cuotaMensual = cuotaMensual;
	}
	
	private void setPlazo(Integer plazoDeMeses) {
		
		this.mesesDePlazo = plazoDeMeses;
	}

	void pagar(Banco unBanco) {
		
		unBanco.recibirPago(this);
		disminuirPlazo();
	}
}
