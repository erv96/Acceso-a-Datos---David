package dao;

import java.sql.Connection;
import java.sql.SQLException;

import pojo.Temporada;
import util.DataBaseConnection;

public abstract class ObjetoDao {
	private static Connection connection;
	
	protected static Connection openConnection() {
		DataBaseConnection dbConnection = new DataBaseConnection();
		connection = dbConnection.getConnection();
		return connection;
	}

	protected static void closeConnection() {
		try {
			connection.close();
			connection = null;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
}
