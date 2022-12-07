/* --------------------------------------------------------------------------
 * APUNTES:
 * 		   XXX.
 *
 *
 * IMPORTANTE:
 *  			  - Scanner(System.in) =  Me permite capturar las entradas
 *										  del teclado.
  *  			  - <VARIABLE>.nextInt() = Lee/Interpreta la variable como
  *										   un entero.
-------------------------------------------------------------------------- */

package ar.com.codoacodo.controllers;

import java.util.Scanner;

import ar.com.codoacodo.dao.IArticleDAO;
import ar.com.codoacodo.dao.impl.ArticleDAOMySQLImpl;
import ar.com.codoacodo.domain.Article;

public class CrudMain {
	public static void main(String[] args) throws Exception {
		// Menú de navegación
		System.out.println("• Por favor seleccioné una opción:");
		System.out.println("[1] - Crear artículo");
		System.out.println("[2] - Eliminar artículo");
		System.out.println("[3] - Modificar artículo");
		System.out.println("[4] - Buscar artículo por ID");
		System.out.println("[5] - Salir");

		Scanner keyword = new Scanner(System.in); // Comienza a capturar las entradas.
		int optionSelected = -1;
		
		do {
			optionSelected = keyword.nextInt(); // Guarda la interpretación de la entrada.
			switch (optionSelected) {
				case 1:
					System.out.println("\n• Ingrese los datos del artículo...");
					// TODO
					break;
				case 2:
					System.out.println("\n• Ingrese el ID del artículo que quiere eliminar...");
					// TODO
					break;
				case 3:
					System.out.println("\n• Ingrese el ID del artículo que quiere modificar...");
					// TODO
					break;
				case 4:
					System.out.println("\n• Ingrese el ID del artículo que quiere buscar...");
					// TODO
					break;
				case 5:
					System.out.println("\n• Ingrese el ID del artículo que quiere buscar...");
					// TODO
					break;
				default:
					System.out.println("¡Error! La opción ingresada es invalida, vuelva a intentar...");
					break;
			}
		} while (optionSelected < 1 && optionSelected > 5);
	}
}