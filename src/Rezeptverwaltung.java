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

        for (int i = 0; i < rezepte.length; i++){

            if (rezepte[i] == null){

                rezepte[i] = rezept;
                break;

            }
        }
    }

    public void zeigeAlleRezepteAn () {

        for (int i = 0; i < rezepte.length; i++){

            if (rezepte[i] != null){

                System.out.println(rezepte[i].getName());

            }
        }

    }

    public void loescheRezept (String rezeptname, String rezeptart){

        for (int i = 0; i < rezepte.length; i++){

            if (rezepte[i] != null){

                if (rezepte[i].getName().equals(rezeptname) && rezepte[i].getTyp().equals(rezeptart)){

                    rezepte[i] = null;

                }
            }
        }

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
