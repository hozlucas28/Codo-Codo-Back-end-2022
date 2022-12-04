package ar.com.codoacodo.seeker;

public class Article {
	/* ------------------------------- Constructor ------------------------------ */

	public Article() {
		
	}
	
	
	/* -------------------------------- Atributos ------------------------------- */

	private String title;
	private String author;
	private float price;
	private String image;
	

	/* --------------------------------- Métodos -------------------------------- */

	public void showData() {
		System.out.println("• Título " + title);
		System.out.println("• Autor " + author);
		System.out.println("• Precio " + price);
		System.out.println("• Imagen " + image);
	}
}
