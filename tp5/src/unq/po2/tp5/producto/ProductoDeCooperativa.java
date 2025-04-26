package unq.po2.tp5.producto;

public class ProductoDeCooperativa extends Producto {

	public ProductoDeCooperativa(String nombre, Integer stock, Double precio) {
		super(nombre, stock, precio);
		
	}

	public Integer descuento() {
		return 10;
	}
	
	@Override
	public Double precio() {
		return getPrecio() - descuentoPorIva();
	}

	private Double descuentoPorIva() {
		
		return getPrecio() / 100 * 10;
	}

}
