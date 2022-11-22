package ar.com.codoacodo.interfaces.messenger;

public class SendEmailImpl implements ISendMessage {
	private String provider = "Gmail";
	private String emailSource = "hoz.lucas@gmail.com";
	private String emailTarget = "carlosGomez38@hotmail.com";
	
	public void action(String message) {
		System.out.println("• Proveedor de email: " + provider);
		System.out.println("• Email de origen: " + emailSource);
		System.out.println("• Email de destino: " + emailTarget);
		System.out.println("- Email enviado con el mensaje: " + message);
	};
}
