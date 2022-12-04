package ar.com.codoacodo.dao;

import java.util.List;

import ar.com.codoacodo.domain.Article;

public interface IArticleDAO {
	public Article getElementById(Long id) throws Exception; // Devuelve el artículo con la ID enviada.
	public List<Article> getAllArticles() throws Exception; // Devuelve todos los artículos.
	public void create(Article article) throws Exception; // Crea un artículo.
	public void delete(Long id) throws Exception; // Elimina un artículo.
	public void update(Article article) throws Exception; // Actualiza un artículo.
}
