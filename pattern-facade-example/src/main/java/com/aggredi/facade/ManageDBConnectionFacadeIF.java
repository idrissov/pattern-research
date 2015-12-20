package com.aggredi.facade;

import java.sql.Connection;

/**
 * Created by Serik Idrissov
 * 12/20/15
 */
public interface ManageDBConnectionFacadeIF {
    Connection createConnection(String dbUrl, String username, String password);

    void closeConnection(Connection connection);
}
