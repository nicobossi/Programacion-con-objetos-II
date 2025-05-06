package unq.po2.tp5.caja;

import unq.po2.tp5.pagable.Pagable;

public class Caja {
	
	private Double montoTotal;
	
	public Caja() {
		
		initializeMonto();
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

	private void setMonto(Double precio) {
		
		this.montoTotal += precio;
	}
	
	private void initializeMonto() {
		
		this.montoTotal = Double.valueOf(0);
	}

}
