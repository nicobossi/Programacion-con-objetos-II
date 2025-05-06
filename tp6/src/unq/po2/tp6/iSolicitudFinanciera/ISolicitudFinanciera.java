package unq.po2.tp6.iSolicitudFinanciera;

import unq.po2.tp6.banco.Tesoro;

public interface ISolicitudFinanciera {

	public Boolean evaluar();
	public void aceptar(Tesoro unBanco) throws Exception;
}
