package unq.po2.tp6.banco;

import unq.po2.tp6.cliente.Cliente;
import unq.po2.tp6.credito.Credito;
import unq.po2.tp6.iOperacionFinanciera.IOperacionFinanciera;
import unq.po2.tp6.solicitudDeCredito.SolicitudDeCredito;

public class Banco {
	
	private ManualDeAlta manualDeAlta;
	private Double devoluciones;

	public Banco() {
		
		initializeManualDeAlta();
		initializeDevoluciones();
	}

	public ManualDeAlta getRegistrador() {
		
		return this.manualDeAlta;
	}
	
	public void desembolsar(Cliente cliente, IOperacionFinanciera unaOperacionFinanciera) {
		
		cliente.recibir(unaOperacionFinanciera);
	}


	public Double totalDeDesembolso() {
		
		return getRegistrador().cantidadDeDesembolsos();
	}


	public void recibirPago(IOperacionFinanciera unaOperacionFinanciera) {
		
		setDevoluciones(unaOperacionFinanciera);
	}
	
	public Double getDevoluciones() {
		
		return this.devoluciones;
	}

	private void setDevoluciones(IOperacionFinanciera unaOperacionFinanciera) {
		
		this.devoluciones = unaOperacionFinanciera.cuota();
	}
	
	private void initializeManualDeAlta() {
		
		this.manualDeAlta = new ManualDeAlta();
	}
	
	private void initializeDevoluciones() {
		
		this.devoluciones = Double.valueOf(0);
	}
}
