package ar.com.codoacodo.interfaces.messenger;

public class Courier {
	private ISendMessage messenger;
	
	public void setMessenger(ISendMessage messenger) {
		this.messenger = messenger;
	}
	
	public void initMessengerAction(String message) {
		this.messenger.action(message);
	}
	
	public boolean isMessengerSeted() {
		return this.messenger != null;
	}
}
