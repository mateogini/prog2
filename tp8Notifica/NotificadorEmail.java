package tp8Notifica;

import java.util.ArrayList;

public class NotificadorEmail implements Notificador{
	public String emailEnvio, emailRecepcion;
	private ArrayList <String> notificaciones;

	
	public NotificadorEmail (String emailEnvio, String emailRecepcion){
		this.emailEnvio = emailEnvio;
		this.emailRecepcion = emailRecepcion;
		this.notificaciones= new ArrayList<>();

		
		}

	@Override
	public void enviarNotificacion(String s) {
		notificaciones.add(s);		
	}

	@Override
	public String getNotificacion() {
		int i = notificaciones.size();
		return notificaciones.get(i-1);
	}


}
