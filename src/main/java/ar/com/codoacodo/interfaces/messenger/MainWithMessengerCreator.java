package ar.com.codoacodo.interfaces.messenger;

public class MainWithMessengerCreator {
	public static void main(String[] args) {
		ISendMessage myInterface = MessengerCreator.createMessenger(target);
		
		String target = "B";
		String message = "¡Hola Mundo!";
		
		
		if (myInterface != null)
			myInterface.action(message);
	}
}
