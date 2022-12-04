/* --------------------------------------------------------------------------
 * APUNTES:
 * 		   Un método estático se utiliza cuando no se quiere instanciar un
 *		   objeto de la clase, para ejecutar dicho método.
 *
 *
 * IMPORTANTE:
 *  			  - XXX.
-------------------------------------------------------------------------- */

package ar.com.codoacodo.controllers;

import ar.com.codoacodo.dao.IArticleDAO;
import ar.com.codoacodo.dao.impl.ArticleDAOMySQLImpl;
import ar.com.codoacodo.domain.Article;

public class CreateArticleController {
	public static void main(String[] args) throws Exception {
		IArticleDAO dao = new ArticleDAOMySQLImpl();
		var article = new Article("Nombre de Prueba", "Autor de Prueba", 1780.69f, "Imagen de Prueba");
		System.out.println(article.getAttributes());
		
		dao.create(article); 
		System.out.println(article.getAttributes());
	}
}
