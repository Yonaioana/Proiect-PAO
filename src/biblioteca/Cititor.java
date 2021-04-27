package src.biblioteca;

public class Cititor {

    private String numeCititor, prenumeCititor;
    private int idCititor;
    private Istoric[] cartiImprumutate;
    private Abonament abonament;

    public Cititor(String numeCititor, String prenumeCititor, int idCititor, Istoric[] cartiImprumutate, Abonament abonament) {
        this.numeCititor = numeCititor;
        this.prenumeCititor = prenumeCititor;
        this.idCititor = idCititor;
        this.cartiImprumutate = cartiImprumutate;
        this.abonament = abonament;
    }

    public String getNumeCititor() {
        return numeCititor;
    }

    public String getPrenumeCititor() {
        return prenumeCititor;
    }

    public int getIdCititor() {
        return idCititor;
    }

    public Istoric[] getCartiImprumutate() {
        return cartiImprumutate;
    }

    public Abonament getAbonament() {
        return abonament;
    }

    public void setNumeCititor(String numeCititor) {
        this.numeCititor = numeCititor;
    }

    public void setPrenumeCititor(String prenumeCititor) {
        this.prenumeCititor = prenumeCititor;
    }

    public void setIdCititor(int idCititor) {
        this.idCititor = idCititor;
    }

    public void setCartiImprumutate(Istoric[] cartiImprumutate) {
        this.cartiImprumutate = cartiImprumutate;
    }

    public void setAbonament(Abonament abonament) {
        this.abonament = abonament;
    }
}
