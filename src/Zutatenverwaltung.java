import java.util.InputMismatchException;
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

    public Zutat sucheZutat(){
        Scanner scanner = new Scanner(System.in);
        boolean zutatGefunden = false;
        try{
            String name = scanner.nextLine();
            for (int i = 0; i < zutaten.length; i++){
                if (zutaten[i] != null){
                    if (zutaten[i].getName().equals(name)){
                        zutatGefunden = true;
                        return zutaten[i];
                    }
                }
            }
        } catch (InputMismatchException e){
            System.out.println(e.getMessage());
            System.out.println("Ungeültige Eingabe");
        } finally {
            //scanner.close();
        }
        if (zutatGefunden == false){
            System.out.println("Zutat nicht gefunden");
        }
        return null;
    }

    public void aendereZutatenPreis(){

        Zutat zutat = sucheZutat();
        if (zutat != null) {
            Scanner scanner = new Scanner(System.in);
            try {
                System.out.println("Neuen Preis eingegeben");
                double preis = scanner.nextDouble();
                zutat.setPreis(preis);
                nehmeZutatAuf(zutat);
            }   catch (InputMismatchException e){
                System.out.println(e.getMessage());
                System.out.println("Kein gültiger Preis.");
            }finally {
                scanner.close();
                System.out.println("Preisänderung abgeschlossen");
            }
        }

    }

}
