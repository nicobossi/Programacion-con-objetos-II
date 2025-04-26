package unq.po2.tp6.solicitudDeCredito;
import unq.po2.tp6.banco.Banco;
import unq.po2.tp6.cliente.Cliente;
import unq.po2.tp6.credito.Credito;
import unq.po2.tp6.iSolicitudFinanciera.ISolicitudFinanciera;

public abstract class SolicitudDeCredito implements ISolicitudFinanciera {

	private Integer plazoDeMeses;
	private Double  montoSolicitado;
	private Cliente cliente;

	public SolicitudDeCredito(Cliente cliente, Double montoSolicitado, Integer plazoDeMeses) {
		
		setMontoSolicituda(montoSolicitado);
		setPlazoDeMeses(plazoDeMeses);
		setCliente(cliente);
	}
	
	public abstract Boolean evaluar();
	
	public void aceptar(Banco unBanco) throws Exception {
		
		if(!evaluar()) {
			
			throw new Exception(mensajeDeSolicitudRechazada());
		}
		
		unBanco.desembolsar(getCliente(), new Credito(this));
	}
	
	public Integer getPlazo() {
		
		return this.plazoDeMeses;
	}

	public Double cuotaMensual() {
		
		return getMontoSolicitado() / getPlazo();
	}
	
	public Double montoAceptado() {
		
		return evaluar() ? getMontoSolicitado() : Double.valueOf(0);
	}
	
	private void setCliente(Cliente cliente) {
		
		this.cliente = cliente;
	}

	private void setPlazoDeMeses(Integer plazoDeMeses) {
		
		this.plazoDeMeses = plazoDeMeses;
	}

	private void setMontoSolicituda(Double montoSolicitado) {
		
		this.montoSolicitado = montoSolicitado;
	}

	protected Double getMontoSolicitado() {
		
		return this.montoSolicitado;
	}
	
	protected Cliente getCliente() {
		
		return this.cliente;
	}

	protected Boolean superaIngresoMensual(Double descuento) {
		
		return cuotaMensual() > descuento;	
	}
	
	private String mensajeDeSolicitudRechazada() {
	
		return "La solicitud es rechazada";
	}
	
	abstract Double descuentoSueldoMensual();

}
