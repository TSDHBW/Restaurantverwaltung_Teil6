public class Kunde {

    private String name;
    private String adresse;
    private Reservierung[] reservierungen;

    public Kunde (String name, String adresse, Reservierung[] reservierungen){

        this.name = name;
        this.adresse = adresse;
        this.reservierungen = reservierungen;

    }

    public void sendeGutschein (double hoehe){

    }

    public boolean bestaetigeReservierung (int id){

        return true;

    }

    public boolean erstellReservierung (String datum, String uhrzeit, int id){

        return true;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public Reservierung[] getReservierungen() {
        return reservierungen;
    }

    public void setReservierungen(Reservierung[] reservierungen) {
        this.reservierungen = reservierungen;
    }

}
