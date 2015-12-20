package com.aggredi.facade;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by Serik Idrissov
 * 12/20/15
 */
public class H2ManageDBConnectionFacade implements ManageDBConnectionFacadeIF {

    private static final String DRIVER_PACKAGE = "org.h2.Driver";

    private DriverManager driverManager;

    static {
        try {
            Class.forName(DRIVER_PACKAGE);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("Error when loading driver class");
        }
    }

    @Override
    public Connection createConnection(String dbUrl, String username, String password) {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(dbUrl, username, password);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
        return connection;
    }

    @Override
    public void closeConnection(Connection connection) {
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
                System.out.println("Error when closing connection");
            }
        }
    }
}
