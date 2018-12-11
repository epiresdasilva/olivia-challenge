package br.com.evandropires.oliviachallenge.dao.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by evandro on 21/11/2018.
 */
public class ConnectionUtil {

	public static Connection newConnection() throws SQLException {
        String userName = "ibm_cloud_659b7d6e_4eab_4313_91ec_895c18d0c88d";
		String password = "1ddad4da246a66d2ad0f4e34d694885a4254e7a9907909a0e227868cb1d992b4";
		String url = "jdbc:postgresql://8bfd3125-5249-4a6f-af72-b6d5640e21b8.8f7bfd8f3faa4218aec56e069eb46187.databases.appdomain.cloud:32064/oliviachallenge?sslmode=require";

		return DriverManager.getConnection(url, userName, password);
	}
}