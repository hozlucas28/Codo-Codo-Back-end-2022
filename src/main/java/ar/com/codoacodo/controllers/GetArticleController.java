package ar.com.codoacodo.controllers;

import ar.com.codoacodo.dao.IArticleDAO;
import ar.com.codoacodo.dao.impl.ArticleDAOMySQLImpl;
import ar.com.codoacodo.domain.Article;

public class GetArticleController {
	public static void main(String[] args) throws Exception {
		IArticleDAO dao = new ArticleDAOMySQLImpl();
		Article article = dao.getElementById(1l);

		System.out.println(article);
	}
}
