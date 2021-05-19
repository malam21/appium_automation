package utilities;


import java.sql.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.DriverManager;

public class SqlConnector {


    private static final Logger LOGGER = LoggerFactory.getLogger(SqlConnector.class.getName());
    private static final String url = "jdbc:postgresql://localhost:5432/mortgage_calculator";
    //private static final String user = "postgres";
    //private static final String Password = "<Your-pgAdmin-password>";

    /*
     * Connect to the postgreSQL database.
     * Return a connection object.
     */

    private static Connection dbConnect() {

        String user = ReadConfigFiles.getPropertyValue("DbUser");
        LOGGER.debug("DB user name: " + user);
        String password = ReadConfigFiles.getPropertyValue("DbPassword");
        Connection conn = null;

        try {
            conn = DriverManager.getConnection(url, user, password);
            LOGGER.info("Connected to the PostgreSQL server successfully");

        } catch (SQLException e) {
            LOGGER.error("SQL Connection exception: " + e.getMessage());

        }

        return conn;
    }

    /*
     * Reading data from the database.
     * @param SQL is the method parameter to accept SQL Query.
     * @return a result set object.
     */
    public static ResultSet readData(String SQL) {

        ResultSet rs = null;
        try {
            Connection conn = dbConnect();
            Statement stmt = conn.createStatement();
            rs = stmt.executeQuery(SQL);

        } catch (SQLException e) {
            LOGGER.error("SQL ResultSet exception: " + e.getMessage());
        }

        return rs;
    }


}












//------------------------------------------------------------------------------
//private static final Logger LOGGER = LogManager.getLogger(SqlConnector.class);
//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;