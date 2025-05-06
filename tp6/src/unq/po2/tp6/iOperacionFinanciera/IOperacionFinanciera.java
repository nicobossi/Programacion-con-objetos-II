package unq.po2.tp6.iOperacionFinanciera;

import unq.po2.tp6.banco.Tesoro;
import unq.po2.tp6.cliente.Cliente;

public interface IOperacionFinanciera {
	
	public Double cuota();
	void descontarCuota(Tesoro unBanco, Cliente unCliente);

}
