package biblioteca;

import java.util.Date;

public class Istoric {
    private Date imprumut;
    private Carte carteImprumutata;

    public Date getImprumut() {
        return imprumut;
    }

    public void setImprumut(Date imprumut) {
        this.imprumut = imprumut;
    }

    public Carte getCarteImprumutata() {
        return carteImprumutata;
    }

    public void setCarteImprumutata(Carte carteImprumutata) {
        this.carteImprumutata = carteImprumutata;
    }
}
