package dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;


public class DAO {
		private DataSource ds;

	public DAO() {
		// chargement des propriétés dans un objet de la classe Properties
		Context initContext;
		try {
			initContext = new InitialContext();
			Context envContext  = (Context)initContext.lookup("java:/comp/env");
			this.ds = (DataSource)envContext.lookup("jdbc/mydb");
			System.out.println("contexte chargé");
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	protected Connection getConnection() throws SQLException {
		// retourne une connexion ˆ la base
		System.out.println("recupération de la connection");
		Connection conn = this.ds.getConnection();
		System.out.println("Connection get!");
		return conn;
		}

}