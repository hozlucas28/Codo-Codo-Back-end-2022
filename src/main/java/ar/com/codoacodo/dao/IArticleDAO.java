package ar.com.codoacodo.dao;

import ar.com.codoacodo.domain.Article;

public interface IArticleDAO {
	public Article getElementById(Long id) throws Exception;
}
