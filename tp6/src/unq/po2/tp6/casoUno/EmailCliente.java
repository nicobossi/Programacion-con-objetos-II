package unq.po2.tp6.casoUno;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class EmailCliente {
	
	private List<Correo> correos;
	
	public EmailCliente(){
		
		this.correos = new ArrayList<Correo>();
	}
	
	public void borrarCorreo(Correo correo){
		
		this.correos.remove(correo);
	}
	
	public Integer contarBorrados() {
		
		return getBorrados().size();
	}
	
	public Integer contarInbox(){
		
		return getInbox().size();
	}
	
	public void eliminarBorrado(Correo correo){
		
		getBorrados().remove(correo);
	}
	
	private List<Correo> getBorrados() {
		
		return this.correos.stream().filter(unCorreo -> unCorreo.estaBorrado()).toList();
	}
	
	private List<Correo> getInbox() {
		
		return this.correos.stream().filter(unCorreo -> !unCorreo.estaBorrado()).toList();
	}
	
}
