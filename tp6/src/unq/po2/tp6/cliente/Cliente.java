package unq.po2.tp6.cliente;

import java.util.ArrayList;
import java.util.List;

import unq.po2.tp6.banco.Tesoro;
import unq.po2.tp6.credito.Credito;
import unq.po2.tp6.iOperacionFinanciera.IOperacionFinanciera;

public class Cliente {
	
	private Integer edad;
	private String nombre;
	private String apellido;
	private String direccion;
	private Double sueldoMensual;
	private List<IOperacionFinanciera> operacionesFinancieras;

	public Cliente(String nombre, String apellido, String direccion, int edad, Double sueldoMensual) {
		
		initializeOperacionesFinancieras();
		setNombre(nombre);
		setApellido(apellido);
		setDireccion(direccion);
		setEdad(edad);
		setSueldoMensual(sueldoMensual);
	}
	
	public String getDireccion() {
		
		return this.direccion;
	}
	
	public void recibir(IOperacionFinanciera unaOperacionFinanciera) {
		
		getOperacionesFinancieras().add(unaOperacionFinanciera);
	}
	

	public Integer getEdad() {
		
		return this.edad;
	}
	
	public Double getSueldoMensual() {
		
		return this.sueldoMensual;
	}

	public Double sueldoAnual() {
		
		return getSueldoMensual() * 12;
	}

	public String nombreCompleto() {
		
		return getNombre() + " " + getApellido();
	}

	private String getApellido() {
		
		return this.apellido;
	}

	private String getNombre() {
		
		return this.nombre;
	}

	private void initializeOperacionesFinancieras() {
		
		this.operacionesFinancieras = new ArrayList<IOperacionFinanciera>();
	}


	private List<IOperacionFinanciera> getOperacionesFinancieras() {
		
		return this.operacionesFinancieras;
	}
	
	private void setSueldoMensual(Double sueldoMensual) {
		
		this.sueldoMensual = sueldoMensual;
	}

	private void setDireccion(String direccion) {
		
		this.direccion = direccion;
	}

	private void setApellido(String apellido) {
		
		this.apellido = apellido;
	}

	private void setNombre(String nombre) {
		
		this.nombre = nombre;
	}

	private void setEdad(int edad) {
		
		this.edad = edad;
	}

	public void pagar(Tesoro unBanco) {
		
		getOperacionesFinancieras().getFirst().descontarCuota(unBanco, this);
	}

	public void finalizarDeuda(IOperacionFinanciera unaOperacionFinanciera) {
		
		getOperacionesFinancieras().remove(unaOperacionFinanciera);
	}
}
