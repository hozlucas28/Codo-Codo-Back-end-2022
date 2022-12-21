package ar.com.codoacodo.dao;

import ar.com.codoacodo.domain.Article;
import java.util.List;

public interface IArticleDAO {
	public Article getArticleById(Long id) throws Exception; // Devuelve el artículo con la ID enviada.

	public List<Article> getArticlesByTitle(String key) throws Exception; // Devuelve los artículos con el título enviado.

	public List<Article> getAllArticles() throws Exception; // Devuelve todos los artículos.

	public void create(Article article) throws Exception; // Crea un artículo.

	public void delete(Long id) throws Exception; // Elimina un artículo.

	public void update(Article article) throws Exception; // Actualiza un artículo.
}
