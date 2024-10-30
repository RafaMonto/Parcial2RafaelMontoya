package ejercicio2;

public class Sistema {
	public void enviarNotificacionPorSMS(Notificacion notificacion) {
		System.out.println("ENVIANDO NOTIFICACION POR SMS");
	}
	public void enviarNotificacionPorWhatsapp(Notificacion notificacion) {
		System.out.println("ENVIANDO NOTIFICACION POR WHATSAPP");
	}
	public void insertarTare(Tarea tarea) {
		System.out.println("INSERTANDO TAREA");
	}
	public void leerTarea() {
		System.out.println("OBTENIENDO UNA TAREA");
	}
}
