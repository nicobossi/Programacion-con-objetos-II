package unq.po2.tp6.banco;

import java.util.ArrayList;
import java.util.List;
import unq.po2.tp6.cliente.Cliente;
import unq.po2.tp6.iSolicitudFinanciera.ISolicitudFinanciera;

class ManualDeAlta {
	
	private List<Cliente> clientes;
	private List<ISolicitudFinanciera> solicitudes;
	
	public ManualDeAlta() {
		
		initializeClientes();
		initializeSolicitudes();
	}


	public void agregarCliente(Cliente cliente) {
		
		clientes.add(cliente);
	}

	public Boolean estaElCliente(Cliente cliente) {
		
		return getClientes().contains(cliente);
	}


	public void agregarSolicitud(ISolicitudFinanciera solicitud) {
		
		getSolicitudes().add(solicitud);
	}

	public Boolean estaLaSolicitud(ISolicitudFinanciera solicitud) {
		
		return getSolicitudes().contains(solicitud);
	}
	
	private void initializeSolicitudes() {
		
		this.solicitudes = new ArrayList<ISolicitudFinanciera>();
	}
	
	private List<ISolicitudFinanciera> getSolicitudes() {
		
		return this.solicitudes;
	}
	
	private List<Cliente> getClientes() {
		
		return this.clientes;
	}
	
	private void initializeClientes() {
		
		this.clientes = new ArrayList<Cliente>();
	}


	Double cantidadDeDesembolsos() {
		
		return getSolicitudes().stream().mapToDouble(ISolicitudFinanciera :: montoAceptado).sum();
	}


}
