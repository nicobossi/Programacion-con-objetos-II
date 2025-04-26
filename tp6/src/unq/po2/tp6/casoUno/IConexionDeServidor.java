package unq.po2.tp6.casoUno;

import java.util.List;

public interface IConexionDeServidor {
	
	public List<Correo> recibirNuevos(Cliente unCliente);

	public void conectar(Cliente unCliente);

	public void enviar(Correo correo);
}


