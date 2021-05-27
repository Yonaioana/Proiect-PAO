package DB.serverDB;

import biblioteca.Carte;

import java.sql.Connection;


public class MainDB {

    public static void main(String[] args) throws ClassNotFoundException {
       // Class.forName("com.mysql.jdbc.Driver");

        CRUD setUpData = new CRUD();
        setUpData.createTable(Carte.class);
      //  Connection connection = DatabaseConfiguration.getDatabaseConnection();
         Connection connection= configuration.getConfiguration();
        configuration.closeConfiguration();
        //DatabaseConfiguration.closeDatabaseConnection();
    }
}
