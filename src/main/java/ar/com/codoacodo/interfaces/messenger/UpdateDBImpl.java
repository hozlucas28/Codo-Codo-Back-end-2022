package ar.com.codoacodo.interfaces.messenger;

public class UpdateDBImpl implements ISendMessage {

	/* -------------------------------- Atributos ------------------------------- */

	private String host = "MongoDB";
	private String userName = "Lucas28";
	private String password = "LucasHD2022";

	/* --------------------------------- Métodos -------------------------------- */

	public void action(String message) {
		System.out.println("• Host: " + host);
		System.out.println("• Usuario: " + userName);
		System.out.println("• Contraseña: " + password);
		System.out.println("- Base de datos modificada con el mensaje: " + message);
	}
}
