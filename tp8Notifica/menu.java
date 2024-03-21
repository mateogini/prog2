package tp8Notifica;

public class menu {

	public static void main(String[] args) {
		NotificadorSms sms = new NotificadorSms("242315");
		NotificadorEmail email = new NotificadorEmail("@geasas", "@gasas");
		
		sms.enviarNotificacion("holaa");
		System.out.println(sms.getNotificacion());
		sms.enviarNotificacion("chau");
		sms.enviarNotificacion("chaasasa");
		System.out.println(sms.getNotificacion());


	}

}
