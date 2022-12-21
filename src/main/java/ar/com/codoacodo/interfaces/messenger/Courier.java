package ar.com.codoacodo.interfaces.messenger;

public class Courier {

	/* -------------------------------- Atributos ------------------------------- */

	private ISendMessage messenger;

	/* --------------------------------- Métodos -------------------------------- */

	public void initMessengerAction(String message) {
		this.messenger.action(message);
	}

	public void setMessenger(ISendMessage messenger) {
		this.messenger = messenger;
	}

	public boolean isMessengerSeted() {
		return this.messenger != null;
	}
}
