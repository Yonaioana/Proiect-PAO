package biblioteca;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;


public class SingletonCarte {


    private static SingletonCarte instance;

    private SingletonCarte() {
    }

    public static SingletonCarte getInstance() {
        if (instance == null) {
            instance = new SingletonCarte();
        }
        return instance;
    }

    public void readFromCsv() {
        try {
            Biblioteca biblioteca = Biblioteca.getInstance();
            String filePath = "message.csv";
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            String line;
            line = reader.readLine();
            while ((line = reader.readLine()) != null) {
                String info[] = line.split(",");

                Carte carte = new Carte(Integer.parseInt(info[0].trim()), info[1], info[2], info[3], info[4], Integer.parseInt(info[5].trim()), Integer.parseInt(info[6].trim()));
                biblioteca.addCarte(carte);
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
            ArrayList<Carte> carte = (ArrayList<Carte>) Biblioteca.getInstance().getListaCarti();
            writer.write(  "idCarte, numeCarte, edituraCarte, genCarte, autorCarte, nrpagCarte, anCart\n");
            for( Carte c: carte){
                String fout=c.getIdCarte()+" "+c.getNumeCarte()+" "+c.getEdituraCarte()+" "+c.getGenCarte()+" "+c.getAutorCarte()+" "+c.getNrpagCarte()+" "+c.getAnCarte();

                writer.write(fout);
            }
            writer.close();
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}




