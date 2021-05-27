package biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
   
    private List<Autor>listaAutori=new ArrayList<>();
    private List<Carte>listaCarti=new ArrayList<>();
    private List<Cititor>listaCititori=new ArrayList<>();
    private List<Cont>listaConturi= new ArrayList<>();
    private static Biblioteca instance;

    private Biblioteca() {}
    public static Biblioteca getInstance() {
        if (instance == null) {
            instance = new Biblioteca();
        }
        return instance;
    }

    public List<Carte> getCarti() {
        return listaCarti;
    }

    public List<Autor> getListaAutori() {
        return listaAutori;
    }

    public List<Carte> getListaCarti() {
        return listaCarti;
    }

    public List<Cititor> getListaCititori() {
        return listaCititori;
    }

    public List<Cont> getListaConturi() {
        return listaConturi;
    }

    public List<Cititor> getCititori() {
        return listaCititori;
    }

    public void setCititori(List<Cititor> listaCititori) {
        this.listaCititori = listaCititori;
    }

    public void setCarti(List<Carte> carti) {
        this.listaCarti = carti;
    }

    public List<Carte> cautareDupaCategorie(String numeGen, List<Carte> carti) {
        List<Carte> listaCartiC = new ArrayList<Carte>();
        for (Carte c : carti) {
            Carte carteGasita = c.cautareDupaCategorie(numeGen);
            if (carteGasita != null)
                listaCartiC.add(carteGasita);
        }

        return listaCartiC;
    }
    public List<Carte> cautareDupaAutor(String numeAutor, List<Carte> carti) {
        List<Carte> listaCartiA = new ArrayList<Carte>();
        for (Carte c : carti) {
            Carte carteGasita = c.cautareDupaAutor(numeAutor);
            if (carteGasita != null)
                listaCartiA.add(carteGasita);
        }

        return listaCartiA;
    }
    public List<Carte> cautareDupaAn(int anCarte, List<Carte> carti) {
        List<Carte> listaCartiAn = new ArrayList<Carte>();
        for (Carte c : carti) {
            Carte carteGasitaAn = c.cautareDupaAn(anCarte);
            if (carteGasitaAn != null)
                listaCartiAn.add(carteGasitaAn);
        }

        return listaCartiAn;
    }

        public List<Carte> cautareDupaNume(String numeCarte, List<Carte> carti) {
            List<Carte> listaCartiNume = new ArrayList<Carte>();
            for (Carte c : carti) {
                Carte carteGasitaNume = c.cautareDupaNume(numeCarte);
                if (carteGasitaNume != null)
                    listaCartiNume.add(carteGasitaNume);
            }

            return listaCartiNume;
        }

    public List<Cititor> stergereCont(int idCititor)
    {
        this.listaCititori.remove(idCititor);
        return listaCititori;
    }

    public List<Cititor> stergereAbonament(int idCititor)
    {
        this.listaCititori.remove(idCititor);
        return listaCititori;
    }
    public void addAutor(Autor autor){
        listaAutori.add(autor);
    }
    public void addCarte(Carte carte){
        listaCarti.add(carte);
    }
    public void addCititor(Cititor cititor){
        listaCititori.add(cititor);
    }
    public void addCont(Cont cont){
        listaConturi.add(cont);
    }
    }


