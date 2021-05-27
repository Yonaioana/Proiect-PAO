package DB.serverDB;
import org.w3c.dom.ls.LSInput;

import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CRUD {

    private Map<String, String> converter = new HashMap<>();

    public CRUD() {
        this.converter.put("class java.lang.Integer", "int");

        this.converter.put("interface java.util.List", "ARRAY");

        this.converter.put("class java.lang.String", "varchar(255)");
    }


    public Map<String, String> makeSQL(Class cls)
    {
        Map<String, String> bindingMap = new HashMap<>();

        Field[] fieldsName = cls.getFields();

        for (Field field : fieldsName)
        {
            bindingMap.put(field.getName(), converter.get(field.getType().toString()));
        }

        return bindingMap;
    }

    public void createTable(Class cls)
    {
        StringBuilder createCommand = new StringBuilder("CREATE TABLE IF NOT EXISTS " + cls.getSimpleName() + "(id int PRIMARY KEY");

        for(Map.Entry<String, String> entry : makeSQL(cls).entrySet())
        {
            String key = entry.getKey();
            String val = entry.getValue();


        }


        Connection connection = configuration.getConfiguration();
        try {
            Statement statement = connection.createStatement();
            statement.execute(createCommand.toString());
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public void deleteTable(Class cls)
    {
        StringBuilder deleteCommand = new StringBuilder("DROP TABLE ").append(cls.getSimpleName());
        Connection connection = configuration.getConfiguration();

        try {
            Statement statement = connection.createStatement();
            statement.execute(deleteCommand.toString());
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public void insert(String insertSQL)
    {
        Connection connection = configuration.getConfiguration();

        try {
            Statement statement = connection.createStatement();
            statement.executeUpdate(insertSQL);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }



    public void update(String updateSQL)
    {
        Connection connection = configuration.getConfiguration();

        try
        {
            Statement statement = connection.createStatement();
            statement.executeQuery(updateSQL);
        }
        catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }

    public void delete(String deleteSQL)
    {
        Connection connection = configuration.getConfiguration();

        try
        {
            Statement statement = connection.createStatement();
            statement.executeQuery(deleteSQL);
        }
        catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

}
