package ar.com.codoacodo.inheritance;

public class Console {

	/* ------------------------------- Constructor ------------------------------ */

	public Console(int bit, String name, String brand) {
		this.bit = bit;
		this.name = name;
		this.brand = brand;
	}

	/* -------------------------------- Atributos ------------------------------- */

	protected int bit;
	private String name;
	private String brand;

	/* --------------------------------- Métodos -------------------------------- */

	public int getBit() {
		return bit;
	}

	public String getName() {
		return name;
	}

	public String getBrand() {
		return brand;
	}

	public String getAttributes() {
		return "Console [bit=" + bit + ", name=" + name + ", brand=" + brand + "]";
	}

	public void showAttributes() {
		System.out.println(this.getAttributes());
	}
}
