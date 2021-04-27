package src.biblioteca;

import java.util.Date;

public class Abonament {
    protected Date startAbonament, endAbonament;
    protected int nrCarti,pretAbonament;
    protected String tipAbonament;

    public Abonament(Date startAbonament, Date endAbonament, int nrCarti, int pretAbonament, String tipAbonament) {
        this.startAbonament = startAbonament;
        this.endAbonament = endAbonament;
        this.nrCarti = nrCarti;
        this.pretAbonament = pretAbonament;
        this.tipAbonament = tipAbonament;
    }

    public String getTipAbonament() {
        return tipAbonament;
    }

    public Date getStartAbonament() {
        return startAbonament;
    }

    public Date getEndAbonament() {
        return endAbonament;
    }

    public int getNrCarti() {
        return nrCarti;
    }

    public void setStartAbonament(Date startAbonament) {
        this.startAbonament = startAbonament;
    }

    public void setTipAbonament(String tipAbonament) {
        this.tipAbonament = tipAbonament;
    }

    public void setEndAbonament(Date endAbonament) {
        this.endAbonament = endAbonament;
    }

    public void setNrCarti(int nrCarti) {
        this.nrCarti = nrCarti;
    }

    public void setPretAbonament(int pretAbonament) {
        this.pretAbonament = pretAbonament;
    }

    public int getPretAbonament() {
        return pretAbonament;

    }
}
