package ar.com.codoacodo.controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ar.com.codoacodo.dao.impl.ArticleDAOMySQLImpl;

@SuppressWarnings("serial")
@WebServlet("/DeleteArticleController") // Ruta de acceso --> http://localhost:8080/webapp/DeleteArticleController
public class DeleteArticleController extends HttpServlet {
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Long id = Long.parseLong(req.getParameter("id"));
		
		try {
			var dao = new ArticleDAOMySQLImpl();
			dao.delete(id);
		} catch (Exception e) {
			System.out.println("ERROR LUCAS HOZ");
			e.printStackTrace();
		}
		
		// Redirigir al listado de artículos.
		getServletContext().getRequestDispatcher("/GetAllArticlesController").forward(req, resp);
	}
}
