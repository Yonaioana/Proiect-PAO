package biblioteca;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class SingletonAutor {

    private static SingletonAutor instance;

    private SingletonAutor()   {
        System.out.println("constructor");
    }

    public static SingletonAutor getInstance() {
        if(instance == null)    {
            instance = new SingletonAutor();
        }
        return instance;
    }
    public void readFromCsv() {
        try {
            Biblioteca biblioteca=  Biblioteca.getInstance();
            String filePath = "messageAutor.csv";
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            String line;
            line = reader.readLine();
            while ((line = reader.readLine()) != null) {
                String info[] = line.split(",");
Carte array[]=new Carte[103];
                Autor autor = new Autor(Integer.parseInt(info[0]), info[1], array);
                biblioteca.addAutor(autor);
            }
            reader.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void writeFile() {
        try {

            String filePath = "message.csv";
            BufferedWriter writer = new BufferedWriter((new FileWriter((filePath))));
            List<Autor> autor =  Biblioteca.getInstance().getListaAutori();
            writer.write(  "idAutor, String numeAutor, Carte[] listaCartiPublicate\n");
            for( Autor a: autor){
                String fout=a.getIdAutor()+" "+a.getNumeAutor()+" "+a.getListaCartiPublicate();

                writer.write(fout);
            }
            writer.close();
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }


}}
