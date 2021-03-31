package biblioteca;

public class Carte {
protected int idCarte;
protected String numeCarte, edituraCarte, genCarte, autorCarte;
protected Integer nrpagCarte, anCarte;

    public Carte(int idCarte, String numeCarte, String edituraCarte, String genCarte, String autorCarte, int nrpagCarte, int anCarte) {
        this.idCarte = idCarte;
        this.numeCarte = numeCarte;
        this.edituraCarte = edituraCarte;
        this.genCarte = genCarte;
        this.autorCarte = autorCarte;
        this.nrpagCarte = nrpagCarte;
        this.anCarte = anCarte;
    }

    public String getNumeCarte() {
        return numeCarte;
    }

    public String getEdituraCarte() {
        return edituraCarte;
    }

    public int getIdCarte() {
        return idCarte;
    }

    public String getGenCarte() {
        return genCarte;
    }

    public String getAutorCarte() {
        return autorCarte;
    }

    public int getNrpagCarte() {
        return nrpagCarte;
    }

    public int getAnCarte() {
        return anCarte;
    }

    public void setIdCarte(int idCarte) {
        this.idCarte = idCarte;
    }

    public void setNumeCarte(String numeCarte) {
        this.numeCarte = numeCarte;
    }


    public void setEdituraCarte(String edituraCarte) {
        this.edituraCarte = edituraCarte;
    }

    public void setGenCarte(String genCarte) {
        this.genCarte = genCarte;
    }

    public void setAutorCarte(String autorCarte) {
        this.autorCarte = autorCarte;
    }

    public void setNrpagCarte(int nrpagCarte) {
        this.nrpagCarte = nrpagCarte;
    }

    public void setAnCarte(int anCarte) {
        this.anCarte = anCarte;
    }
    Carte cautareDupaCategorie(String numeGen)
    {
        if(genCarte.equals(numeGen))
            return this;
        else
        return null;
    }
    Carte cautareDupaAutor(String numeAutor)
    {
        if(autorCarte.equals(numeAutor))
            return this;
        else
            return null;
    }
    Carte cautareDupaAn(int anCarte)
    {
        if(this.anCarte.equals(anCarte))
            return this;
        else
            return null;
    }
    Carte cautareDupaNume(String numeCarte)
    {
        if(this.numeCarte.equals(numeCarte))
            return this;
        else
            return null;
    }
}
