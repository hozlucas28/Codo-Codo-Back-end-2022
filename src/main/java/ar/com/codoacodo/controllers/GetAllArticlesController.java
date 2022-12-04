package ar.com.codoacodo.controllers;

import java.util.List;

import ar.com.codoacodo.dao.IArticleDAO;
import ar.com.codoacodo.dao.impl.ArticleDAOMySQLImpl;
import ar.com.codoacodo.domain.Article;

public class GetAllArticlesController {
	public static void main(String[] args) throws Exception {
		IArticleDAO dao = new ArticleDAOMySQLImpl();
		List<Article> articles = dao.getAllArticles();

		for (Article i : articles) {
			System.out.println(i.getAttributes());
		}
	}
}
