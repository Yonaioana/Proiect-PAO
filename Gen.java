package biblioteca;

public class Gen {
    private String numeGen;
    private Carte[] listaCartiGen;
    private int idGen;

    public Gen(String numeGen, Carte[] listaCartiGen, int idGen) {
        this.numeGen = numeGen;
        this.listaCartiGen = listaCartiGen;
        this.idGen = idGen;
    }

    public String getNumeGen() {
        return numeGen;
    }

    public int getIdGen() {
        return idGen;
    }

    public Carte[] getListaCartiGen() {
        return listaCartiGen;
    }

    public void setNumeGen(String numeGen) {
        this.numeGen = numeGen;
    }

    public void setListaCartiGen(Carte[] listaCartiGen) {
        this.listaCartiGen = listaCartiGen;
    }

    public void setIdGen(int idGen) {
        this.idGen = idGen;
    }
}
