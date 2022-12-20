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

import ar.com.codoacodo.dao.impl.ArticleDAOMySQLImpl;
import ar.com.codoacodo.domain.Article;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/CreateArticleController") // Ruta de acceso --> http://localhost:8080/webapp/CreateArticleController
public class CreateArticleController extends HttpServlet {

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String title = req.getParameter("title"); // Obtiene el título.
		String author = req.getParameter("author"); // Obtiene el autor.
		Float price = Float.parseFloat(req.getParameter("price")); // Obtiene el precio.
		String image = req.getParameter("image"); // Obtiene la imagen.

		try {
			var dao = new ArticleDAOMySQLImpl();
			var newArticle = new Article(title, author, price, image);
			dao.create(newArticle);
		} catch (Exception e) {
			e.printStackTrace();
		}

		// Redirigir al listado de artículos.
		getServletContext().getRequestDispatcher("/GetAllArticlesController").forward(req, resp);
	}
}
