package unq.po2.tp5.producto;

import unq.po2.tp5.caja.Caja;

public abstract class Producto {
	
	private Integer stock;
	private Double precio;

	public Producto(Integer stock, Double precio) {
		setStock(stock);
		setPrecio(precio);
	}
	
	public void prepararPago(Caja caja) throws Exception {
		
		decrementarStock();
		caja.acumularMonto(this);
	}


	public boolean hayStock() {
		return getStock() > 0;
	}

	public Double precio() {
		return this.precio;
	}

	public void decrementarStock() throws Exception {
		
		if(!hayStock()) {
			
			throw new Exception(mensajeDeStock());
		}
		
		setStock(getStock() - 1);
		
	}

	private String mensajeDeStock() {
		return "El producto no tiene más stock";
	}
	
	private void setStock(Integer stock) {
		this.stock = stock;
		
	}
	
	private void setPrecio(Double precio) {
		this.precio = precio;
	}
	
	private Integer getStock() {
		return this.stock;
	}
}
