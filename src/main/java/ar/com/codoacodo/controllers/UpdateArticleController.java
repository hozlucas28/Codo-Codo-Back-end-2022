package ar.com.codoacodo.controllers;

import ar.com.codoacodo.dao.IArticleDAO;
import ar.com.codoacodo.dao.impl.ArticleDAOMySQLImpl;
import ar.com.codoacodo.domain.Article;

public class UpdateArticleController {
	public static void main(String[] args) throws Exception {
		Long id = 3l;
		String title = "Titulo de Prueba - Actualizado";
		String author = "Autor de Prueba - Actualizado";
		Float price = 1234.56f;
		String image = "Imagen de Prueba - Actualizado";
		
		IArticleDAO dao = new ArticleDAOMySQLImpl();
		var articleToUpdate = dao.getElementById(id);
		
		if(articleToUpdate != null) {
			articleToUpdate.setTitle(title);
			articleToUpdate.setAuthor(author);
			articleToUpdate.setPrice(price);
			articleToUpdate.setImage(image);
			dao.update(articleToUpdate);
			System.out.println(articleToUpdate.getAttributes());
		} else {
			System.out.println("El ID enviado no existe.");
		}
	}
}
