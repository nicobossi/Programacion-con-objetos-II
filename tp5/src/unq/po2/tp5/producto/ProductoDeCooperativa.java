package unq.po2.tp5.producto;

public class ProductoDeCooperativa extends ProductoTradicional {

	public ProductoDeCooperativa(Integer stock, Double precio) {
		super(stock, precio);
		
	}

	public Integer descuento() {
		return 10;
	}
	
	@Override
	public Double precio() {
		return super.precio() - descuentoPorIva();
	}

	private double descuentoPorIva() {
		return super.precio() / 100 * 10;
	}

}
