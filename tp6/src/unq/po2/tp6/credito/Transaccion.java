package unq.po2.tp6.credito;

import unq.po2.tp6.banco.Banco;
import unq.po2.tp6.cliente.Cliente;

class Transaccion {

	void pagar(Banco unBanco, Cliente unCliente, Credito unCredito) {
		
		try {
			
			iniciarPago(unBanco, unCredito);
		}
		catch(Exception e) {
			
			unCliente.finalizarDeuda(unCredito);
			
		}
		
	}
	
	private void iniciarPago(Banco unBanco, Credito unCredito) throws Exception {
		
		if(!unCredito.quedanPlazos()) {
			
			throw new Exception(mensajeDeTransaccionFinalizada());
		}
		
		unCredito.pagar(unBanco);
		
	}

	private String mensajeDeTransaccionFinalizada() {
		
		return "Ya se pagaron todas las cuotas del Crédito";
	}

}
