package ar.com.codoacodo.seeker;

public class Seeker {

	/* ------------------------------- Constructor ------------------------------ */

	public Seeker() {
		System.out.println("¡Nace un Buscador!");
	}

	/* -------------------------------- Atributos ------------------------------- */

	private String seekerKey; // Clave de búsqueda.
	public Article[] results; // Resultados encontrados.
	private int amountOfResults; // Cantidad de resultados encontrados.

	/* --------------------------------- Métodos -------------------------------- */

	public void setSeekerKey(String newKey) {
		seekerKey = newKey;
	}

	public String getSeekerKey() {
		if (seekerKey == null) {
			return "";
		} else {
			return seekerKey;
		}
	}

	public int getAmountOfResults() {
		return amountOfResults;
	}

	public void seek() {
		// Simulación de resultados encontrados
		Article firstResult = new Article();
		Article secondResult = new Article();
		Article thirdResult = new Article();

		// Inicialización de los resultados encontrados
		results = new Article[3];
		results[0] = firstResult;
		results[1] = secondResult;
		results[2] = thirdResult;
		amountOfResults = results.length; // Actualiza la cantidad de resultados encontrados.

		System.out.println("• Buscando... " + seekerKey);
	}
}
