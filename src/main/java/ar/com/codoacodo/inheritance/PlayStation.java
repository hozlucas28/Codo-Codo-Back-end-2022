/* --------------------------------------------------------------------------
 * APUNTES:
 * 		   Recordar utilizar la función <super()>.
 *
 *
 * IMPORTANTE:
 *  			  - <extends> = indica que la clase de la izquierda (clase hija)
 *								tendrá los mismos atributos y métodos que la clase
 *								de la derecha (clase padre).
 *  			  - <implements> = hereda la interfaz siguiente a dicha instrucción.
 *  			  - <super()> = referencia al método/constructor de la clase padre,
 *								depende cual sea el caso.
-------------------------------------------------------------------------- */

package ar.com.codoacodo.inheritance;

import ar.com.codoacodo.inheritance.interfaces.IPlayable;
import ar.com.codoacodo.inheritance.interfaces.IUpgradable;

public class PlayStation extends Console implements IPlayable, IUpgradable {

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
		return super.getAttributes() + " PlayStation [version=" + version + "]";
	}

	public void play() {
		if (this.version == "4" || this.version == "5") {
			System.out.println("Jugando a la PlayStation " + version + ".");
		} else {
			System.out.println("No se puede jugar a la PlayStation " + version + ".");
		}
	}

	public void update() {
		System.out.println("Actualizando PlayStation " + version + "...");
		System.out.println("¡PlayStation actualizada!");
	}
}
