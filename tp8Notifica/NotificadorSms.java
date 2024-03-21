package tp8Notifica;

import java.util.ArrayList;

public class NotificadorSms extends Gzip{
	private String numeroTelefono;
	private ArrayList <String> notificaciones;
	
	public NotificadorSms (String numeroTelefono){
		this.numeroTelefono=numeroTelefono;
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

	@Override
	public String comprimir(String s) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String descomprimir(String s) {
		// TODO Auto-generated method stub
		return null;
	}
}
