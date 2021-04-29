package biblioteca;

import java.util.Date;

final class AbonamentNormal extends Abonament{

    public AbonamentNormal(Date startAbonament, Date endAbonament, int nrCarti, int pretAbonament, String tipAbonament) {
        super(startAbonament, endAbonament, nrCarti, pretAbonament, tipAbonament);
    }
}
