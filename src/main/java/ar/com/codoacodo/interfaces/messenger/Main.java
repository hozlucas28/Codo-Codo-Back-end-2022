package ar.com.codoacodo.interfaces.messenger;

public class Main {

	public static void main(String[] args) {
		var messenger = new Messenger();

		String target = "B";
		String message = "¡Hola Mundo!";

		switch (target) {
			case "A":
				messenger.sendEmail(message);
				break;
			case "B":
				messenger.writeHD(message);
				break;
			case "C":
				messenger.updateDB(message);
				break;
			default:
				System.out.println("¡LA OPCIÓN INGRESADA ES INVALIDA!");
				break;
		}
	}
}
