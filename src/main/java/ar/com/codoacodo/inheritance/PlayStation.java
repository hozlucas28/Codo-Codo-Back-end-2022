/* --------------------------------------------------------------------------
 * APUNTES:
 * 		   Recordar utilizar la función <super()>.
 *
 *
 * IMPORTANTE:
 *  			  - <extends> = indica que la clase de la izquierda (clase hija)
 *								tendrá los mismos atributos y métodos que la clase
 *								de la derecha (clase padre).
 *  			  - <super()> = referencia al método/constructor de la clase padre,
 *								depende cual sea el caso.
-------------------------------------------------------------------------- */

package ar.com.codoacodo.inheritance;

public class PlayStation extends Console {
	/* ------------------------------- Constructor ------------------------------ */
	
	public PlayStation(int bit, String name, String version, String brand) {
		super(bit, "PlayStation", "Sony");
		this.version = version;
	}


	/* -------------------------------- Atributos ------------------------------- */

	private String version;


	/* --------------------------------- Métodos -------------------------------- */

	public String getVersion() {
		return version;
	}

	public String getAttributes() {
		return  super.getAttributes() + " PlayStation [version=" + version + "]";
	}
}
