package unq.po2.tp5.producto;

public class ProductoTradicional extends Producto {

	public ProductoTradicional(String nombre, Integer stock, Double precio) {
		
		super(nombre, stock, precio);
		
	}
	
	public Double precio() {
		
		return getPrecio();
	}

}
