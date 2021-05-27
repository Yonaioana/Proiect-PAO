package DB.serverDB;
import biblioteca.Carte;
import javax.swing.table.TableRowSorter;
import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;


public class BookDB extends CRUD{
    public void insert(Carte addCarte) throws IllegalAccessException {
        Class usedClass = Carte.class;


        StringBuilder insertCommand = new StringBuilder("insert into: ");

        insertCommand.append(usedClass.getSimpleName()).append("(id");

        for(Map.Entry<String, String> entry : makeSQL(usedClass).entrySet())
        {
            String mapKey = entry.getKey();

            if(!mapKey.equals("id"))
                insertCommand.append(", ").append(mapKey);
        }


        Field []fieldArray = usedClass.getFields();
        for(int i = 0; i < fieldArray.length; i++)
        {
            fieldArray[i].setAccessible(true);

            insertCommand.append(fieldArray[i].get(addCarte).toString());

            if (i != fieldArray.length - 1)
                insertCommand.append(", ");
        }

        insertCommand.append(")");

        super.insert(insertCommand.toString());
    }

    public void update(Carte addCarte)
    {
        Class usedClass = Carte.class;

    }

}
