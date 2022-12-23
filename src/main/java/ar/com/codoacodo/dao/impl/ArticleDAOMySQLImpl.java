/* --------------------------------------------------------------------------
 * APUNTES:
 * 		   XXX.
 *
 *
 * IMPORTANTE:
 *  			  - <resultSet.next()> = apunta a la columna/registro siguiente,
 *										 devolviendo 'false' si ha terminado
 *										 su recorrido.
-------------------------------------------------------------------------- */

package ar.com.codoacodo.dao.impl;

import ar.com.codoacodo.dao.IArticleDAO;
import ar.com.codoacodo.db.ConnectionManager;
import ar.com.codoacodo.domain.Article;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ArticleDAOMySQLImpl implements IArticleDAO {

	// Devolver artículo con la ID enviada.
	public Article getArticleById(Long id) throws Exception {
		// Establecer conexión
		Connection connection = ConnectionManager.getConnection();
		Statement statement = connection.createStatement();

		// Enviar consulta y obtener resultado
		String query = "SELECT * FROM article WHERE id = " + id;
		ResultSet resultSet = statement.executeQuery(query);

		// Extraer datos del resultado
		Article article = null;
		if (resultSet.next()) {
			article = fromResultSetToArticle(resultSet);
		}
		return article;
	}

	// Devolver los artículos que tengan el título enviado.
	public List<Article> getArticlesByTitle(String key) throws Exception {
		Connection connection = ConnectionManager.getConnection();
		Statement statement = connection.createStatement();

		String query = "SELECT * FROM article WHERE title=" + "'" + key + "'";
		ResultSet resultSet = statement.executeQuery(query);

		List<Article> articles = new ArrayList<>();
		while (resultSet.next()) {
			articles.add(fromResultSetToArticle(resultSet));
		}
		return articles;
	}

	// Devolver todos los artículos.
	public List<Article> getAllArticles() throws Exception {
		Connection connection = ConnectionManager.getConnection();
		Statement statement = connection.createStatement();

		String query = "SELECT * FROM article";
		ResultSet resultSet = statement.executeQuery(query);

		List<Article> articles = new ArrayList<>();
		while (resultSet.next()) {
			articles.add(fromResultSetToArticle(resultSet));
		}
		return articles;
	}

	// Devolver artículo construido en base al resultado enviado.
	public Article fromResultSetToArticle(ResultSet resultSet) throws Exception {
		Long idDB = resultSet.getLong("id");
		String titleDB = resultSet.getString("title");
		String authorDB = resultSet.getString("author");
		Float priceDB = resultSet.getFloat("price");
		String imageDB = resultSet.getString("image");

		return new Article(idDB, titleDB, authorDB, priceDB, imageDB);
	}

	// Crear artículo.
	public void create(Article article) throws Exception {
		Connection connection = ConnectionManager.getConnection();

		String query = "INSERT INTO article(title, author, price, image) VALUES(?,?,?,?)"; // Consulta.
		PreparedStatement statement = connection.prepareStatement(query, PreparedStatement.RETURN_GENERATED_KEYS);

		// Definir y ejecutar consulta
		statement.setString(1, article.getTitle());
		statement.setString(2, article.getAuthor());
		statement.setFloat(3, article.getPrice());
		statement.setString(4, article.getImage());
		statement.execute();

		// Definir ID del nuevo artículo
		ResultSet resultSet = statement.getGeneratedKeys();
		if (resultSet.next()) {
			article.setId(resultSet.getLong(1));
		}
	}

	// Eliminar artículo.
	public void delete(Long id) throws Exception {
		Connection connection = ConnectionManager.getConnection();
		Statement statement = connection.createStatement();

		String query = "DELETE FROM article WHERE id = " + id;
		statement.executeUpdate(query);
	}

	// Actualizar artículo.
	public void update(Article article) throws Exception {
		Connection connection = ConnectionManager.getConnection();
		String query = "UPDATE article SET title = ?, author = ?, price = ?, image = ? WHERE id = ?";
		PreparedStatement statement = connection.prepareStatement(query);

		statement.setString(1, article.getTitle());
		statement.setString(2, article.getAuthor());
		statement.setFloat(3, article.getPrice());
		statement.setString(4, article.getImage());
		statement.setLong(5, article.getId());
		statement.execute();
	}
}
