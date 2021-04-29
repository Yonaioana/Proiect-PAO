
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.sql.SQLOutput;

import biblioteca.*;
import com.opencsv.CSVReader;
      public class Main {
          public static void main(String args[]) {
              SingletonCarte.getInstance().readFromCsv();
              for(Carte c: Biblioteca.getInstance().getCarti()){
                  System.out.println(c);
              }
              SingletonAutor.getInstance().readFromCsv();
              for(Autor c: Biblioteca.getInstance().getListaAutori()){
                  System.out.println(c);
              }
              SingletonCititor.getInstance().readFromCsv();
              for(Cititor c: Biblioteca.getInstance().getCititori()){
                  System.out.println(c);
              }
              SingletonCont.getInstance().readFromCsv();
              for(Cont c: Biblioteca.getInstance().getListaConturi()){
                  System.out.println(c);
              }
          }




      }