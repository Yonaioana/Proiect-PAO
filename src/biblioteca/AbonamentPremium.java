package biblioteca;

import java.util.Date;

final class AbonamentPremium extends Abonament{

    public AbonamentPremium(Date startAbonament, Date endAbonament, int nrCarti, int pretAbonament, String tipAbonament) {
        super(startAbonament, endAbonament, nrCarti, pretAbonament, tipAbonament);
    }
}
