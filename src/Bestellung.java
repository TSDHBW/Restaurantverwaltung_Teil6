/**
 * Klasse zur Generierung von Objekten für Bestellungen. Eine Bestellung enthält ein Fleisch- und Pastagericht und beliebig viele Cocktails und Limonaden.
 * Zusätzlich wird in jedem Bestllung-Objekt der Kunde gespeichert, der die Bestellung aufgegeben hat.
 * @author Timo
 * @version 1
 */
public class Bestellung {

    private Kunde kunde;
    private FleischGericht fleischGericht;
    private PastaGericht pastaGericht;
    private Cocktail[] cocktails;
    private Limonade[] limonaden;

    public Bestellung(Kunde kunde, FleischGericht fleischGericht, PastaGericht pastaGericht, Cocktail[] cocktails, Limonade[] limonaden){

        this.kunde = kunde;
        this.fleischGericht = fleischGericht;
        this.pastaGericht = pastaGericht;
        this.cocktails = cocktails;
        this.limonaden = limonaden;

    }

    public Bestellung() {

    }

    public double erstelleRechnung() {

        return 0.0;

    }

    public Kunde getKunde() {
        return kunde;
    }

    public void setKunde(Kunde kunde) {
        this.kunde = kunde;
    }

    public FleischGericht getFleischGericht() {
        return fleischGericht;
    }

    public void setFleischGericht(FleischGericht fleischGericht) {
        this.fleischGericht = fleischGericht;
    }

    public PastaGericht getPastaGericht() {
        return pastaGericht;
    }

    public void setPastaGericht(PastaGericht pastaGericht) {
        this.pastaGericht = pastaGericht;
    }

    public Cocktail[] getCocktails() {
        return cocktails;
    }

    public void setCocktails(Cocktail[] cocktails) {
        this.cocktails = cocktails;
    }

    public Limonade[] getLimonaden() {
        return limonaden;
    }

    public void setLimonaden(Limonade[] limonaden) {
        this.limonaden = limonaden;
    }

}
