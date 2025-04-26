package unq.po2.tp6.iOperacionFinanciera;

import unq.po2.tp6.banco.Banco;
import unq.po2.tp6.cliente.Cliente;

public interface IOperacionFinanciera {
	
	public Double cuota();
	void descontarCuota(Banco unBanco, Cliente unCliente);

}
