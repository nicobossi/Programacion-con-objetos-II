package unq.po2.tp6.casoUno;
import java.util.ArrayList;
import java.util.List;

public class ServidorPop implements IConexionDeServidor {

	public List<Correo> recibirNuevos(Cliente unCliente) {
		List<Correo> retorno = new ArrayList<Correo>();
	  //Verificar autenticidad de usuario.
		//obtener emails Nuevos del usuario.
		//asignar a retorno la lista de los nuevos e-mails.
		return retorno;
	}

	public void conectar(Cliente unCliente) {
	   //Verifica que el usuario sea valido y establece la conexion.
		
	}

	public void enviar(Correo correo) {
      //realiza lo necesario para enviar el correo.		
	}
}
