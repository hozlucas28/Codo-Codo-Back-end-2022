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
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/SearchArticleController") // Ruta de acceso --> http://localhost:8080/webapp/SearchArticleController
public class SearchArticleController extends HttpServlet {

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String searchKey = req.getParameter("searchKey"); // Obtiene la clave de búsqueda.

		var dao = new ArticleDAOMySQLImpl();
		List<Article> articles = new ArrayList<>();

		try {
			articles = dao.getArticlesByTitle(searchKey);
		} catch (Exception e) {
			e.printStackTrace();
		}

		// Redirigir al listado de artículos.
		req.setAttribute("articles", articles); // Define la variable "articles".
		getServletContext().getRequestDispatcher("/showArticles.jsp").forward(req, resp);
	}
}
