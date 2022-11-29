/* --------------------------------------------------------------------------
 * APUNTES:
 * 		   Al utilizar JBDC el armado de la url es el desarrollado en dicha
 *		   instrucción.
 *
 *
 * IMPORTANTE:
 *  			  - XXX.
-------------------------------------------------------------------------- */


package ar.com.codoacodo.db;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionManager {
	public static Connection getConnection() throws Exception {
		String port = "3306";
		String host = "localhost";
		String userName = "root";
		String password = "289137tx";
		String dbName = "3306";
		
		// Crear instancia
		String url = "jbdc:mysql://" + host + "/" + port + "/" + dbName + "?serverTimeZone=UTC&useSSL=false";
		String driverClassname = "com.mysql.cj.jdbc.Driver";		
		Class.forName(driverClassname);
		
		Connection connection = DriverManager.getConnection(url, userName, password);
		return connection;
	};
}
