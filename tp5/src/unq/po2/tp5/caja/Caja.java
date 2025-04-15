package unq.po2.tp5.caja;

import java.util.ArrayList;
import java.util.List;

import unq.po2.tp5.agencia.Agencia;
import unq.po2.tp5.factura.Factura;
import unq.po2.tp5.pagable.Pagable;

public class Caja implements Agencia {
	
	private Double montoTotal;
	private List<Factura> facturas;
	
	public Caja() {
		
		initializeMonto();
		initializeFacturas();
	}


	public void acumularMonto(Pagable unPagable) {
		
		setMonto(unPagable.precio());
	}

	public Double getMontoTotal() {
		
		return this.montoTotal;
	}

	public void procesar(Pagable unPagable) throws Exception {
		
		unPagable.prepararPago(this);
	}

	@Override
	public void registrarPago(Factura unaFactura) {
		
		acumularMonto(unaFactura);
		getFacturas().add(unaFactura);
		
	}

	private List<Factura> getFacturas() {
		
		return this.facturas;
	}
	
	private void initializeFacturas() {
		
		this.facturas = new ArrayList<Factura>();
	}
	
	private void setMonto(Double precio) {
		
		this.montoTotal += precio;
	}
	
	private void initializeMonto() {
		
		this.montoTotal = Double.valueOf(0);
	}

}
