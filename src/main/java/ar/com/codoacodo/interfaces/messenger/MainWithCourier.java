package ar.com.codoacodo.interfaces.messenger;

public class MainWithCourier {

	public static void main(String[] args) {
		var courier = new Courier();

		String target = "B";
		String message = "¡Hola Mundo!";

		switch (target) {
			case "A":
				courier.setMessenger(new SendEmailImpl());
				break;
			case "B":
				courier.setMessenger(new WriteHDImpl());
				break;
			case "C":
				courier.setMessenger(new UpdateDBImpl());
				break;
			default:
				System.out.println("¡LA OPCIÓN INGRESADA ES INVALIDA!");
				break;
		}
		if (courier.isMessengerSeted()) courier.initMessengerAction(message);
	}
}
