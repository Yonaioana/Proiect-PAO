package src.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Cititor> cititori;
    private List<Carte> carti;

    public List<Carte> getCarti() {
        return carti;
    }

    public List<Cititor> getCititori() {
        return cititori;
    }

    public void setCititori(List<Cititor> cititori) {
        this.cititori = cititori;
    }

    public void setCarti(List<Carte> carti) {
        this.carti = carti;
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
    public List<Cititor> creareCont(int idCititor)
    {
        this.cititori.remove(idCititor);
        return cititori;
    }
    public List<Cititor> stergereCont(int idCititor)
    {
        this.cititori.remove(idCititor);
        return cititori;
    }
    public List<Cititor> creareAbonament(int idCititor)
    {
        this.cititori.remove(idCititor);
        return cititori;
    }
    public List<Cititor> stergereAbonament(int idCititor)
    {
        this.cititori.remove(idCititor);
        return cititori;
    }
    }


