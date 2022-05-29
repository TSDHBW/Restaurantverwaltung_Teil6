public class Reservierung {

    private String datum;
    private String uhrzeit;
    private int id;
    private boolean bestaetigt = false;

    public Reservierung (String datum, String uhrzeit, int id){

        this.datum = datum;
        this.uhrzeit = uhrzeit;
        this.id = id;

    }

    public boolean passeReservierungAn (String datum, String uhrzeit){

        return true;

    }

    public String getDatum() {
        return datum;
    }

    public void setDatum(String datum) {
        this.datum = datum;
    }

    public String getUhrzeit() {
        return uhrzeit;
    }

    public void setUhrzeit(String uhrzeit) {
        this.uhrzeit = uhrzeit;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isBestaetigt() {
        return bestaetigt;
    }

    public void setBestaetigt(boolean bestaetigt) {
        this.bestaetigt = bestaetigt;
    }

}
