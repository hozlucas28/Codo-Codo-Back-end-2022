package ar.com.codoacodo.interfaces.messenger;

public class Messenger {
	public void sendEmail(String message) {
		System.out.println("Email enviado con el mensaje: " + message);
	}
	
	public void writeHD(String message) {
		System.out.println("Disco rígido escrito con el mensaje: " + message);
	}
	
	public void updateDB(String message) {
		System.out.println("Base de datos modificada con el mensaje: " + message);
	}
}
