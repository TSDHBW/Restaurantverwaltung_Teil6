import java.util.Scanner;

public class Zutatenverwaltung {

    private Zutat[] zutaten;

    public Zutatenverwaltung(){

        zutaten = new Zutat[1000];

    }

    public void nehmeZutatAuf(Zutat zutat){

        boolean aufgenommen = false;
        // Aktualisieren von bestehender Zutat
        for (int i =0; i < zutaten.length; i++){

            if(zutaten[i]!=null && zutaten[i].getName().equals(zutat.getName())){
                aufgenommen = true;
                zutaten[i] = zutat;
                System.out.println("Zutat: " + zutat.getName() + " wurde aktualisiert");
                break;

            }
        }
        // Aufnahme an den ersten freien Platz
        if (aufgenommen == false){
            for (int i = 0; i < zutaten.length; i++){

                if (zutaten[i] == null){
                    aufgenommen = true;
                    zutaten[i] = zutat;
                    System.out.println("Zutat: " + zutat.getName() + " wurde aufgenommen");
                    break;
                }
            }}
        if (aufgenommen == false) {
            System.out.println("Zutat: " + zutat.getName() + " wurde nicht aufgenommen, da kein Platz");
        }
    }

    public Zutat sucheZutat (){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte Zutatenname eingeben");
        String eingabe = scanner.nextLine();

        for (int i = 0; i< zutaten.length; i++){

            if (zutaten[i] != null && zutaten[i].getName().equals(eingabe)){
                return zutaten[i];
            } else {
                System.out.println("Zutat ist nicht vorhanden");
                return null;
            }
        }

        return null;
    }

}
