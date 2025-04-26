package unq.po2.tp6.casoUno;

public class Cliente {
	
	 private IConexionDeServidor servidor;
	 private String nombreUsuario;
	 private String passusuario;
	 private EmailCliente email;
	
	public Cliente(IConexionDeServidor servidor, String nombreUsuario, String pass, EmailCliente email){
		this.servidor=servidor;
		this.nombreUsuario=nombreUsuario;
		this.passusuario=pass;
		this.email = email;
		this.conectar();
	}
	
	public void conectar(){
		
		this.servidor.conectar(this);
	}
	
	
	public void recibirNuevos(){
		
		this.servidor.recibirNuevos(this);
	}
	
	public void enviarCorreo(Correo unCorreo){
		
		this.servidor.enviar(unCorreo);
	}
	
	public EmailCliente getEmail(){
		
		return this.email;
	}
}
