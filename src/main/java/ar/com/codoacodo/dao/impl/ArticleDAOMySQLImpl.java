/* --------------------------------------------------------------------------
 * APUNTES:
 * 		   XXX.
 *
 *
 * IMPORTANTE:
 *  			  - <resultSet.next()> = apunta a la columna siguiente,
 *										 devolviendo 'false' si ha terminado
 *										 su recorrido.
-------------------------------------------------------------------------- */

package ar.com.codoacodo.dao.impl;

import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;

import ar.com.codoacodo.domain.Article;
import ar.com.codoacodo.dao.IArticleDAO;
import ar.com.codoacodo.db.ConnectionManager;

public class ArticleDAOMySQLImpl implements IArticleDAO {
	public Article getElementById(Long id) throws Exception {

		// Establecer conexión
		Connection connection = ConnectionManager.getConnection();
		Statement statement = connection.createStatement();
		
		// Enviar consulta y obtener resultado
		String query = "SELECT * FROM article WHERE id = " + id; // Consulta.
		ResultSet resultSet = statement.executeQuery(query);
		
		// Extraer datos del registro (resultado obtenido)
		if (resultSet.next()) {
			Long idDB = resultSet.getLong("id");
			String titleDB = resultSet.getString("title");
			String authorDB = resultSet.getString("author");
			Float priceDB = resultSet.getFloat("price");
			String imgDB = resultSet.getString("img");
			return new Article(idDB, titleDB, authorDB, priceDB, imgDB);
		}
		return null;
	}
}
