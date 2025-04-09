package unq.po2.tp4.producto;

public class Producto {
	
	protected String nombre;
	protected Double precio;
	protected boolean esPrecioCuidado;
	
	public Producto(String nombre, Double precio, boolean esPrecioCuidado) {
		
		setNombre(nombre);
		setPrecio(precio);
		setEsPrecioCuidado(esPrecioCuidado);
	}
	
	public Producto(String nombre, Double precio) {
		
		setNombre(nombre);
		setPrecio(precio);
	}
	
	public Double getPrecio() {
		
		return this.precio;
	}
	
	public String getNombre() {
		
		return this.nombre;
	}
	
	public boolean esPrecioCuidado() {
		
		return this.esPrecioCuidado;
	}
	
	public void aumentarPrecio(Double aumento) {
		
		setPrecio(getPrecio() + aumento);
	}

	protected void setEsPrecioCuidado(boolean esPrecioCuidado) {
		
		this.esPrecioCuidado = esPrecioCuidado;
	}

	protected void setPrecio(Double precio) {

		this.precio = precio;
	}

	protected void setNombre(String nombre) {
		
		this.nombre = nombre;
	}
}
