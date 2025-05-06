package unq.po2.tp5.factura;

import unq.po2.tp5.agencia.Agencia;
import unq.po2.tp5.caja.Caja;
import unq.po2.tp5.pagable.Pagable;

public abstract class Factura implements Pagable {
	
	private Agencia agencia;
	
	public Factura() {
		
		
	}
	
	public abstract Double precio();
	
	public void registrarse() {
		
		agencia.registrarPago(this);
	}
	
	
	public void prepararPago(Caja unaCaja) throws Exception {
		
		unaCaja.acumularMonto(this);
	};
	
}
