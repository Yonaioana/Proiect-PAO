package biblioteca;

import java.util.Date;

final class AbonamentNormal extends Abonament{

    public AbonamentNormal(Date startAbonament, Date endAbonament, int nrCarti, int pretAbonament, String tipAbonament) {
        super(startAbonament, endAbonament, nrCarti, pretAbonament, tipAbonament);
    }

    public AbonamentNormal() {
        super();
    }

    @Override
    public String getTipAbonament() {
        return super.getTipAbonament();
    }

    @Override
    public Date getStartAbonament() {
        return super.getStartAbonament();
    }

    @Override
    public Date getEndAbonament() {
        return super.getEndAbonament();
    }

    @Override
    public int getNrCarti() {
        return super.getNrCarti();
    }

    @Override
    public void setStartAbonament(Date startAbonament) {
        super.setStartAbonament(startAbonament);
    }

    @Override
    public void setTipAbonament(String tipAbonament) {
        super.setTipAbonament(tipAbonament);
    }

    @Override
    public void setEndAbonament(Date endAbonament) {
        super.setEndAbonament(endAbonament);
    }

    @Override
    public void setNrCarti(int nrCarti) {
        super.setNrCarti(nrCarti);
    }

    @Override
    public void setPretAbonament(int pretAbonament) {
        super.setPretAbonament(pretAbonament);
    }

    @Override
    public int getPretAbonament() {
        return super.getPretAbonament();
    }
}
