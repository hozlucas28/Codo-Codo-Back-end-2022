package ar.com.codoacodo.controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ar.com.codoacodo.dao.impl.ArticleDAOMySQLImpl;

@SuppressWarnings("serial")
@WebServlet("/UpdateArticleController") // Ruta de acceso --> http://localhost:8080/webapp/UpdateArticleController
public class UpdateArticleController extends HttpServlet {	
	// Cargar artículo en el .jsp para actualizar sus datos
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Long id = Long.parseLong(req.getParameter("id")); // Obtengo el ID.
		
		try {
			var dao = new ArticleDAOMySQLImpl();
			var article = dao.getArticleById(id);
			req.setAttribute("article", article);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// Redirigir a actualizar artículo.
		getServletContext().getRequestDispatcher("/updateArticle.jsp").forward(req, resp);		
	}
	
	// Realiza la actualización del artículo
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Long id = Long.parseLong(req.getParameter("id")); // Obtiene el ID.
		String title = req.getParameter("title"); // Obtiene el título.
		String author = req.getParameter("author"); // Obtiene el autor.
		Float price = Float.parseFloat(req.getParameter("price")); // Obtiene el precio.
		String image = req.getParameter("image"); // Obtiene la imagen.
		
		try {
			var dao = new ArticleDAOMySQLImpl();
			var articleToUpdate = dao.getArticleById(id);
			articleToUpdate.setTitle(title);
			articleToUpdate.setAuthor(author);
			articleToUpdate.setPrice(price);
			articleToUpdate.setImage(image);
			dao.update(articleToUpdate); // Actualiza el artículo.
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// Redirigir al listado de artículos.
		getServletContext().getRequestDispatcher("/GetAllArticlesController").forward(req, resp);
	}
}
