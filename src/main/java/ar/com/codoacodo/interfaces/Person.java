package ar.com.codoacodo.interfaces;

public class Person {
	/* ------------------------------- Constructor ------------------------------ */

	public Person(String name, String language) {
		setName(name);
		setMainLanguage(language);
		setOtherLanguages(new String[0]);
	}


	/* -------------------------------- Atributos ------------------------------- */

	private String name;
	private String language;
	private String[] otherLanguages;
	
	
	/* --------------------------------- Métodos -------------------------------- */

	// Definir nombre
	public void setName(String name) {
		this.name = name;
	}

	// Definir lenguaje
	private void setMainLanguage(String language) {
		this.language = language;			
	}
	
	// Definir otros lenguajes
	private void setOtherLanguages(String[] languages) {
		this.otherLanguages = languages;
	}
	
	// Obtener nombre
	public String getName() {
		return name;
	}

	// Obtener lenguaje
	public String getMainLanguage() {
		return language;
	}

	// Obtener otros lenguajes
	public String[] getOtherLanguages() {
		return otherLanguages;
	}
	
	// Decir
	public void say(String word, String language) {
		if (canSpeakLanguage(language))
			System.out.println(getName() + " dice " + word);
		else
			System.out.println(getName() + " no habla " + language);
	}
	
	// Aprender un idioma
	public void learnLanguage(String language) {
		if (canSpeakLanguage(language))
			return;
		
		String[] newLanguages = new String[this.otherLanguages.length + 1];
		
		for (int i = 0; i < this.otherLanguages.length; i++) {
			newLanguages[i] = this.otherLanguages[i]; // Copia los idiomas previos.
		}
		newLanguages[this.otherLanguages.length] = language;
		setOtherLanguages(newLanguages);
	}
	
	// ¿Habla el idioma?	
	private boolean canSpeakLanguage(String language) {
		boolean myReturn = false;
		String[] otherLanguages = getOtherLanguages();
		int otherLanguagesLength = otherLanguages.length;
		
		if (getMainLanguage().equals(language)) {
			myReturn = true;
		}
		
		for (int i = 0; !myReturn && i < otherLanguagesLength; i++ ) {
			myReturn = otherLanguages[i].equals(language);
		}
		return myReturn;
	}
}
