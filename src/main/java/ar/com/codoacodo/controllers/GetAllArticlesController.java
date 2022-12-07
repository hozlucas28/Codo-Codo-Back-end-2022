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

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.cj.x.protobuf.MysqlxDatatypes.Array;

import ar.com.codoacodo.dao.IArticleDAO;
import ar.com.codoacodo.dao.impl.ArticleDAOMySQLImpl;
import ar.com.codoacodo.domain.Article;

@WebServlet("/GetAllArticlesController") // Ruta de acceso --> http://localhost:8080/webapp/GetAllArticlesController
public class GetAllArticlesController extends HttpServlet {
	// Aplicación de consola
	public static void main(String[] args) throws Exception {
		IArticleDAO dao = new ArticleDAOMySQLImpl();
		List<Article> articles = dao.getAllArticles();

		for (Article i : articles) {
			System.out.println(i.getAttributes());
		}
	}

	// Controlador - API ==> [Devuelve listado de artículos]
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		IArticleDAO dao = new ArticleDAOMySQLImpl();
		List<Article> articles = new ArrayList<>();

		try {
			articles = dao.getAllArticles();
			
			for (Article i : articles) {
				System.out.println(i.getAttributes());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		req.setAttribute("listado", articles);
		getServletContext().getRequestDispatcher("/list.html").forward(req, resp);
	}
}
