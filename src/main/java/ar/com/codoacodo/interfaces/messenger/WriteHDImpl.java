package ar.com.codoacodo.interfaces.messenger;

public class WriteHDImpl implements ISendMessage {
	private String path = "C:/documents/myJava/Personal%20Files";
	
	public void action(String message) {
		System.out.println("• Destino del mensaje: " + path);
		System.out.println("- Disco rígido escrito con el mensaje: " + message);
	};
}
