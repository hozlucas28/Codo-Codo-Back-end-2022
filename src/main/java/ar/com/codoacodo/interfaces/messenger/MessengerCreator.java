package ar.com.codoacodo.interfaces.messenger;

public class MessengerCreator {
	public static ISendMessage createMessenger(String target) {
		ISendMessage message = null;
		
		switch (target) {
			case "A":
				message = new SendEmailImpl();
				break;
			case "B":
				message = new WriteHDImpl();
				break;
			case "C":
				message = new UpdateDBImpl();
				break;
			default:
				System.out.println("¡LA OPCIÓN INGRESADA ES INVALIDA!");
				break;
		};
		return message;
	}
}
