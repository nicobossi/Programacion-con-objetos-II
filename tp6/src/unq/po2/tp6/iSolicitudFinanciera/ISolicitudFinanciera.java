package unq.po2.tp6.iSolicitudFinanciera;

import unq.po2.tp6.banco.Banco;

public interface ISolicitudFinanciera {

	public Boolean evaluar();
	public void aceptar(Banco unBanco) throws Exception;
}
