package com.comcast.crm.generic.databaseutility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class DataBaseUtility {

	// declare connection object globally because we cant access outside the method
	// because i am closing the db
	// connection in another method.thats y we cant declare it locallly.so we can
	// close dbconnection in another method
	// and what happened if connection not happened, in this case we have to put try
	// catch block
	Connection conn;

	public void getDbConnection() throws SQLException {
		try {
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/projets", "root", "root");
		} catch (Exception e) {
		}
	}
	
	

	public void closeDbConnection() throws SQLException {
		try {
			conn.close();
		} catch (Exception e) {

		}
	}

	public ResultSet executeSelectQuery(String query) throws SQLException {
		ResultSet result = null;
		try {
			Statement stat = conn.createStatement();
			result = stat.executeQuery(query);

		} catch (Exception e) {
		}
		return result;
	}

	public int executeNonSelectQuery(String query) {
		int result = 0; // it will give result in + or in -
		try {
			Statement stat = conn.createStatement();
			result = stat.executeUpdate(query);

		} catch (Exception e) {
		}

		return result;

	}

}
