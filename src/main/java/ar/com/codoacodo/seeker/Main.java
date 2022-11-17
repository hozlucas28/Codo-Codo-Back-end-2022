package ar.com.codoacodo.seeker;

public class Main {
	public static void main(String[] args) {
		Seeker mySeeker = new Seeker(); // Crea la clase 'Seeker'.
		mySeeker.setSeekerKey("Iron Man 2"); // Define el atributo 'seekerKey' de la clase.
		mySeeker.seek(); // Llama al método 'seek' de la clase.
		
		int amountOfResults = mySeeker.getAmountOfResults(); // Obtiene la cantidad de resultados encontrados.
		String seekerKey = mySeeker.getSeekerKey(); // Obtiene la clave de búsqueda.
		System.out.println("• " + amountOfResults + " resultados encontrados para " +  seekerKey);
	}
}
