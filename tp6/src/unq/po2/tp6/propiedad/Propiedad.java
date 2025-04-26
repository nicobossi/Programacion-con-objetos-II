package unq.po2.tp6.propiedad;

import unq.po2.tp6.iGarantia.IGarantia;

public class Propiedad implements IGarantia {
	
	private String descripcion;
	private String direccion;
	private Double valorFiscal;

	public Propiedad(String descripcion, String direccion, Double valorFiscal) {
		
		setDescripcion(descripcion);
		setDireccion(direccion);
		setValorFiscal(valorFiscal);
	}
	
	@Override
	public Double valorFiscal() {
		
		return this.valorFiscal;
	}

	private void setValorFiscal(Double valorFiscal) {
		
		this.valorFiscal = valorFiscal;
	}

	private void setDireccion(String direccion) {
		
		this.direccion = direccion;
	}

	private void setDescripcion(String descripcion) {
		
		this.descripcion = descripcion;
	}

	public String getDireccion() {
		
		return this.direccion;
	}

	public String getDescripcion() {
		
		return this.descripcion;
	}

}
