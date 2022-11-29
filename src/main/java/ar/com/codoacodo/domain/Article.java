package ar.com.codoacodo.domain;

public class Article {
	/* ------------------------------- Constructor ------------------------------ */
	
	// Constructor con argumento ID
	public Article(Long id, String title, String author, float price, String image) {
		this.id = id;
		this.title = title;
		this.author = author;
		this.price = price;
		this.image = image;
	}	

	// Constructor sin argumento ID
	public Article(String title, String author, float price, String image) {
		this.title = title;
		this.author = author;
		this.price = price;
		this.image = image;
	}	


	/* -------------------------------- Atributos ------------------------------- */

	private Long id;
	private String image;
	private String title;
	private String author;
	private float price;
	

	/* --------------------------------- Métodos -------------------------------- */

	public void setId(Long id) {
		this.id = id;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void setPrice(float price) {
		this.price = price;
	}
	
	public void setImage(String image) {
		this.image = image;
	}

	public Long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public float getPrice() {
		return price;
	}
	
	public String getImage() {
		return image;
	}
	
	public void showData() {
		System.out.println("• ID: " + id);
		System.out.println("• Título: " + title);
		System.out.println("• Autor: " + author);
		System.out.println("• Precio: " + price);
		System.out.println("• Imagen: " + image);
	}
}
