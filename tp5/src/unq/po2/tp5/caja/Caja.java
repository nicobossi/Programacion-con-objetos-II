package unq.po2.tp5.caja;

import unq.po2.tp5.producto.Producto;

public class Caja {
	
	private Double montoTotal;
	
	public Caja() {
		
		initializeMonto();
	}

	public Double getMontoTotal() {
		
		return this.montoTotal;
	}

	public void registrar(Producto producto) throws Exception {
		
		producto.prepararPago(this);
	}

	private void setMonto(Double precio) {
		
		this.montoTotal += precio;
	}
	
	private void initializeMonto() {
		
		this.montoTotal = Double.valueOf(0);
	}

	public void acumularMonto(Producto producto) {
		
		setMonto(producto.precio());
	}

}
