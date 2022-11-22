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

public class Xbox360 extends Console {
	/* ------------------------------- Constructor ------------------------------ */

	public Xbox360() {
		super(256, "Xbox 360", "Microsoft");
	}
}
