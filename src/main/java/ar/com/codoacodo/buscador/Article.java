package ar.com.codoacodo.buscador;

public class Article {
	/* ------------------------------- Constructor ------------------------------ */

	public Article() {
		
	}
	
	
	/* -------------------------------- Atributos ------------------------------- */

	private String image;
	private String title;
	private String author;
	private float price;
	

	/* --------------------------------- Métodos -------------------------------- */

	public void showData() {
		System.out.println("• Imagen " + image);
		System.out.println("• Título " + title);
		System.out.println("• Autor " + author);
		System.out.println("• Precio " + price);
	}
}
