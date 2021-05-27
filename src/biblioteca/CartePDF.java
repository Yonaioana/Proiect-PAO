package biblioteca;

final class CartePDF extends Carte {

    public CartePDF(int idCarte, String numeCarte, String edituraCarte, String genCarte, String autorCarte, int nrpagCarte, int anCarte) {
        super(idCarte, numeCarte, edituraCarte, genCarte, autorCarte, nrpagCarte, anCarte);
    }

    @Override
    public String getNumeCarte() {
        return super.getNumeCarte();
    }

    @Override
    public String getEdituraCarte() {
        return super.getEdituraCarte();
    }

    @Override
    public int getIdCarte() {
        return super.getIdCarte();
    }

    @Override
    public String getGenCarte() {
        return super.getGenCarte();
    }

    @Override
    public String getAutorCarte() {
        return super.getAutorCarte();
    }

    @Override
    public int getNrpagCarte() {
        return super.getNrpagCarte();
    }

    @Override
    public int getAnCarte() {
        return super.getAnCarte();
    }

    @Override
    public void setIdCarte(int idCarte) {
        super.setIdCarte(idCarte);
    }

    @Override
    public void setNumeCarte(String numeCarte) {
        super.setNumeCarte(numeCarte);
    }

    @Override
    public void setEdituraCarte(String edituraCarte) {
        super.setEdituraCarte(edituraCarte);
    }

    @Override
    public void setGenCarte(String genCarte) {
        super.setGenCarte(genCarte);
    }

    @Override
    public void setAutorCarte(String autorCarte) {
        super.setAutorCarte(autorCarte);
    }

    @Override
    public void setNrpagCarte(int nrpagCarte) {
        super.setNrpagCarte(nrpagCarte);
    }

    @Override
    public void setAnCarte(int anCarte) {
        super.setAnCarte(anCarte);
    }

    @Override
    Carte cautareDupaCategorie(String numeGen) {
        return super.cautareDupaCategorie(numeGen);
    }

    @Override
    Carte cautareDupaAutor(String numeAutor) {
        return super.cautareDupaAutor(numeAutor);
    }

    @Override
    Carte cautareDupaAn(int anCarte) {
        return super.cautareDupaAn(anCarte);
    }

    @Override
    Carte cautareDupaNume(String numeCarte) {
        return super.cautareDupaNume(numeCarte);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
