package biblioteca;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class SingletonCititor {


    private static SingletonCititor instance;

    private SingletonCititor()   {
        System.out.println("constructor");
    }

    public static SingletonCititor getInstance() {
        if(instance == null)    {
            instance = new SingletonCititor();
        }
        return instance;
    }
    public void readFromCsv() {
        try {
            Biblioteca biblioteca=  Biblioteca.getInstance();
            String filePath = "message2.csv";
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            String line;
            line = reader.readLine();
            while ((line = reader.readLine()) != null) {
                String info[] = line.split(",");
                Istoric array[]=new Istoric[100];
                Abonament ab=new Abonament();
                Cititor cititor = new Cititor(info[0],info[1],Integer.parseInt(info[2]),array,ab);
                biblioteca.addCititor(cititor);
            }
            reader.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }



}

    public void writeFile() {
        try {

            String filePath = "message2.csv";
            BufferedWriter writer = new BufferedWriter((new FileWriter((filePath))));
            List<Cititor> cititors =  Biblioteca.getInstance().getListaCititori();
            writer.write(  "numeCititor, String prenumeCititor, int idCititor, Istoric[] cartiImprumutate, Abonament abonament\n");
            for( Cititor c: cititors){
                String fout=c.getNumeCititor()+" "+c.getPrenumeCititor()+" "+c.getIdCititor()+" "+c.getCartiImprumutate()+" "+c.getAbonament();

                writer.write(fout);
            }
            writer.close();
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
}}
