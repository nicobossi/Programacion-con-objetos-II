package unq.po2.tp4.producto;

public class ProductoPrimeraNecesidad extends Producto {

	public ProductoPrimeraNecesidad(String nombre, Double precio) {
		super(nombre, precio);
		
	}
	
	public ProductoPrimeraNecesidad(String nombre, Double precio, boolean esPrecioCuidado) {
		super(nombre, precio, esPrecioCuidado);
	}
	
	@Override
	public Double getPrecio() {
		return super.getPrecio() * 0.9;
	}


}
