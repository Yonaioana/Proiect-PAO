package src.biblioteca;

public class Cont {
    private String parola, username, email, nrTelefon;
    Integer idCititor;

    public Integer getIdCititor() {
        return idCititor;
    }

    public void setIdCititor(Integer idCititor) {
        this.idCititor = idCititor;
    }

    public String getParola() {
        return parola;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNrTelefon() {
        return nrTelefon;
    }
    Cont creareCont(Integer idCititor)
    {
        if(this.idCititor.equals(idCititor))
            return this;
        else
            return null;
    }
    Cont stergereCont(Integer idCititor)
    {
        if(this.idCititor.equals(idCititor))
            return this;
        else
            return null;
    }

    public void setNrTelefon(String nrTelefon) {
        this.nrTelefon = nrTelefon;
    }
}
