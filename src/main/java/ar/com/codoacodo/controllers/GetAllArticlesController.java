/* --------------------------------------------------------------------------
 * APUNTES:
 * 		   La ruta para acceder al presente controlador seria aquella .
 *
 *
 * IMPORTANTE:
 *  			  - @WebServlet =  define la ruta para acceder a la página
 *								   creada por la clase del paquete/controlador.
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
@WebServlet("/GetAllArticlesController") // Ruta de acceso --> http://localhost:8080/webapp/GetAllArticlesController
public class GetAllArticlesController extends HttpServlet {

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		var dao = new ArticleDAOMySQLImpl();
		List<Article> articles = new ArrayList<>();

		try {
			articles = dao.getAllArticles();
		} catch (Exception e) {
			e.printStackTrace();
		}

		// Redirigir al listado de artículos.
		req.setAttribute("articles", articles); // Define la variable "articles".
		getServletContext().getRequestDispatcher("/showArticles.jsp").forward(req, resp);
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
}
