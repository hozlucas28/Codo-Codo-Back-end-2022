package ar.com.codoacodo.interfaces;

public class Main {
	public static void main(String[] args) {
		Person person = new Person("Lucas", "Ingles");
		
		person.learnLanguage("Español");
		person.say("Amarillo", "Español");
	}
}
