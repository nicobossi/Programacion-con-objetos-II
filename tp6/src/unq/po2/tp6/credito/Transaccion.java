package unq.po2.tp6.credito;

import unq.po2.tp6.banco.Tesoro;
import unq.po2.tp6.cliente.Cliente;

class Transaccion {

	void pagar(Tesoro unBanco, Cliente unCliente, Credito unCredito) {
		
		try {
			
			iniciarPago(unBanco, unCredito);
		}
		catch(Exception e) {
			
			unCliente.finalizarDeuda(unCredito);
			
		}
		
	}
	
	private void iniciarPago(Tesoro unBanco, Credito unCredito) throws Exception {
		
		if(!unCredito.quedanPlazos()) {
			
			throw new Exception(mensajeDeTransaccionFinalizada());
		}
		
		unCredito.pagar(unBanco);
		
	}

	private String mensajeDeTransaccionFinalizada() {
		
		return "Ya se pagaron todas las cuotas del Crédito";
	}

}
