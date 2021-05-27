package DB.serverDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class configuration {



        private static final String DATABSE_URL = "jdbc:mysql://localhost:3308";
        private static final String USER = "ioanag";
        private static final String PASSWORD = "pass-word";

        private static Connection databaseConnection;

        private configuration() {
        }

        public static Connection getConfiguration()    {
            try {
                if(databaseConnection == null || databaseConnection.isClosed()) {
                    databaseConnection = DriverManager.getConnection(DATABSE_URL, USER, PASSWORD);
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
            return databaseConnection;
        }

        public static void closeConfiguration()    {
            try {
                if(databaseConnection != null && !databaseConnection.isClosed()) {
                    databaseConnection.close();
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }

    }

