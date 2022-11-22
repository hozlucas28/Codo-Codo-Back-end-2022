package ar.com.codoacodo.interfaces.messenger;

public class MainWithMessengerCreator {
	public static void main(String[] args) {
		String target = "B";
		String message = "¡Hola Mundo!";
		
		ISendMessage myInterface = MessengerCreator.createMessenger(target);
		
		if (myInterface != null)
			myInterface.action(message);
	}
}
