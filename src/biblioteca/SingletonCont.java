package biblioteca;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

public class SingletonCont {

    private static SingletonCont instance;

    private SingletonCont() {}

    public static SingletonCont getInstance() {
        if(instance == null)    {
            instance = new SingletonCont();
        }
        return instance;
    }
    public void readFromCsv() {
        try {
            Biblioteca biblioteca=  Biblioteca.getInstance();
            String filePath = "messageCont.csv";
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            String line;
            line = reader.readLine();
            while ((line = reader.readLine()) != null) {
                String info[] = line.split(",");

                Cont cont = new Cont(info[0].trim(), info[1], info[2],info[3],Integer.parseInt(info[4]));
                biblioteca.addCont(cont);
            }
            reader.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

}
    public void writeFile() {
        try {

            String filePath = "messageCont.csv";
            BufferedWriter writer = new BufferedWriter((new FileWriter((filePath))));
            ArrayList<Cont> cont = (ArrayList<Cont>) Biblioteca.getInstance().getListaConturi();
            writer.write(  "parola, String username, String email, String nrTelefon, Integer idCititor\n");
            for( Cont c: cont){
                String fout=c.getParola()+" "+c.getUsername()+" "+c.getEmail()+" "+c.getNrTelefon()+" "+c.getIdCititor();

                writer.write(fout);
            }
            writer.close();
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
