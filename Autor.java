package biblioteca;

public class Autor {
    private  int idAutor;
    private String numeAutor;
    private Carte[] listaCartiPublicate;

    public Autor(int idAutor, String numeAutor, Carte[] listaCartiPublicate) {
        this.idAutor = idAutor;
        this.numeAutor = numeAutor;
        this.listaCartiPublicate = listaCartiPublicate;
    }

    public String getNumeAutor() {
        return numeAutor;
    }

    public Carte[] getListaCartiPublicate() {
        return listaCartiPublicate;
    }

    public int getIdAutor() {
        return idAutor;
    }

    public void setNumeAutor(String numeAutor) {
        this.numeAutor = numeAutor;
    }

    public void setListaCartiPublicate(Carte[] listaCartiPublicate) {
        this.listaCartiPublicate = listaCartiPublicate;
    }

    public void setIdAutor(int idAutor) {
        this.idAutor = idAutor;
    }
}

