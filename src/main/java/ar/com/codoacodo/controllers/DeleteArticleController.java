package ar.com.codoacodo.controllers;

import ar.com.codoacodo.dao.IArticleDAO;
import ar.com.codoacodo.dao.impl.ArticleDAOMySQLImpl;

public class DeleteArticleController {
	public static void main(String[] args) throws Exception {
		IArticleDAO dao = new ArticleDAOMySQLImpl();
		dao.delete(4l);
	}
}
