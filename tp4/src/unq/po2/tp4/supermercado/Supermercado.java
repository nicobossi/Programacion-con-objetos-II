package unq.po2.tp4.supermercado;

import java.util.List;
import java.util.ArrayList;
import unq.po2.tp4.producto.*;

public class Supermercado {

	private String nombre;
	private String direccion;
	private List<Producto> productos;
	
	public Supermercado(String nombre, String direccion) {
		
		setNombre(nombre);
		setDireccion(direccion);
		initializeProductos();
	}
	
	public void agregarProducto(Producto unProducto) {
		
		getProductos().add(unProducto);
	}
	
	public int getCantidadDeProductos() {
		
		return getProductos().size();
	}
	
	public Double getPrecioTotal() {
		return getProductos().stream().mapToDouble(Producto :: getPrecio).sum();
	}

	private List<Producto> getProductos() {
		return this.productos;
	}

	private void initializeProductos() {
		
		this.productos = new ArrayList<Producto>();
	}

	private void setDireccion(String direccion) {
		
		this.direccion = direccion;
	}

	private void setNombre(String nombre) {
		
		this.nombre = nombre;
	}
}
