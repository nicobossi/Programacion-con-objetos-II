package unq.po2.tp5.pagable;

import unq.po2.tp5.caja.Caja;

public interface Pagable {
	
	public Double precio();
	public void prepararPago(Caja unaCaja) throws Exception;
}
