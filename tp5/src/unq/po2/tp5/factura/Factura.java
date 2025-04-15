package unq.po2.tp5.factura;

import unq.po2.tp5.caja.Caja;
import unq.po2.tp5.pagable.Pagable;

public abstract class Factura implements Pagable {

	public abstract Double precio();
	
	public void prepararPago(Caja unaCaja) throws Exception {
		
		unaCaja.registrarPago(this);
	};
	
}
