package unq.po2.tp5.producto;

import unq.po2.tp5.caja.Caja;
import unq.po2.tp5.pagable.Pagable;

public abstract class Producto implements Pagable {
	
	protected Integer stock;
	protected Double precio;
	protected String nombre;

	public Producto(String nombre, Integer stock, Double precio) {
		
		setNombre(nombre);
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
	
	protected void setNombre(String nombre) {
		
		this.nombre = nombre;
	}
	
	private Integer getStock() {
		
		return this.stock;
	}
	
	public String getNombre() {
		
		return this.nombre;
	}
	
	protected Double getPrecio() {
		
		return this.precio;
	}
	
	public abstract Double precio();
}
