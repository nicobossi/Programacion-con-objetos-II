package unq.po2.tp4.producto;

public class ProductoPrimeraNecesidad extends Producto {

	private Double descuento;

	public ProductoPrimeraNecesidad(String nombre, Double precio) {
		super(nombre, precio);
		initializeDescuento();
	}


	public ProductoPrimeraNecesidad(String nombre, Double precio, boolean esPrecioCuidado) {
		super(nombre, precio, esPrecioCuidado);
		initializeDescuento();
	}
	
	public ProductoPrimeraNecesidad(String nombre, Double precio, Double descuento) {
		super(nombre, precio);
		setDescuento(descuento);
	}
	
	public ProductoPrimeraNecesidad(String nombre, Double precio, boolean esPrecioCuidado, Double descuento) {
		super(nombre, precio, esPrecioCuidado);
		setDescuento(descuento);
	}
	
	@Override
	public Double getPrecio() {
		return super.getPrecio() * getDescuento();
	}
	
	private void setDescuento(Double descuento) {
		this.descuento = descuento;
	}
	
	private Double getDescuento() {
		return this.descuento;
	}
	
	private void initializeDescuento() {
		this.descuento = defoultDescuento();
	}

	private double defoultDescuento() {
		return 0.9;
	}

}
