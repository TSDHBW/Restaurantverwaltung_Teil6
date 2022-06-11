/**
 * Klasse zur Generierung eines Objekts für die Rezeptverwaltung. Jede Rezeptverwaltung besitzt je ein Array für Rezepte für Pastagerichte, Fleischgerichte,
 * COcktais und Limonaden
 * @author Timo
 * @version 1
 */
public class Rezeptverwaltung {

    private BasisRezept[] rezepte;

    public Rezeptverwaltung (){

        rezepte = new BasisRezept[1000];

    }

    public void nehmeRezeptAuf (BasisRezept rezept){

        // zu implementieren

    }

    public void zeigeAlleRezepteAn () {

        // zu implementieren

    }

    public void loescheRezept (String rezeptname, String rezeptart){

        // zu implementieren

    }

    public void zeigeRezeptAn (String rezeptname, String rezeptart){

        // zu implementieren

    }

    public int ermittleAnzahlRezepte (String rezeptart){

        // zu implementieren
        return 0;

    }

    public int ermittleAnzahlRezepte (){

        // zu implementieren
        return 0;

    }

    public BasisRezept getRezept(String rezeptname, String rezeptart){

        // zu implmeneiteren
        return null;
    }

    public BasisRezept[] getRezepte() {
        return rezepte;
    }

    public void setRezepte(BasisRezept[] rezepte) {
        this.rezepte = rezepte;
    }
}
