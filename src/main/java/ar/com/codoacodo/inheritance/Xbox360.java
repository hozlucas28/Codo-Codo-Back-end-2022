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

import ar.com.codoacodo.inheritance.interfaces.IUpgradable;

public class Xbox360 extends Console implements IUpgradable {
	/* ------------------------------- Constructor ------------------------------ */

	public Xbox360() {
		super(256, "Xbox 360", "Microsoft");
	}


	/* --------------------------------- Métodos -------------------------------- */
	
	public void update() {
		System.out.println("Actualizando Xbox 360...");
		System.out.println("¡Xbox 360 actualizada!");
	}
}
