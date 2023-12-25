/**
 * Klasse MVCController ist für die Erzeugung des User Interface und des Datenmodells verantwortlich.
 * Zusätzlich werden alle Benutzeraktionen im User Interface in Form von ActionEvents behandelt.
 * @author Timo
 * @version 1.0
 */
public class MVCController {

    private MVCView view;
    private MVCModel model;

    public MVCController() {
        //Erzeugung des User Interface durch ein Objekt der Klasse MVCView
        this.view = new MVCView(this);
        //Erzeugung des Datenmodells durch ein Objekt der Klasse MVCModel
        this.model = new MVCModel();

        testeRezeptverwaltung();

    }

    public void testeRezeptverwaltung(){

        Zutat zitrone = new Zutat("Zitrone", 1.00);
        Zutat orange = new Zutat("Orange", 1.50);
        Zutat minze = new Zutat("Minze", 0.75);
        Zutat zucker = new Zutat("Zucker", 0.25);
        Zutat wasser = new Zutat("Wasser", 0.10);
        Zutat eis = new Zutat("Eis", 0.50);
        Zutat limette = new Zutat("Limette", 2.00);

        Zutat[] zutatenOrangenlimo = {orange, minze, wasser, eis};
        Limonade orangenlimo = new Limonade("Orangenlimo", zutatenOrangenlimo, false,true, "Orange", true);

        Zutat[] zutatenZitronenlimo = {zitrone, minze, zucker, wasser, eis};
        Limonade zitronenlimo = new Limonade("Zitronenlimo", zutatenZitronenlimo, false, false, "Zitrone", false);

        Zutat[] zutatenCaipirinha = {minze, limette, zucker, wasser, eis};
        Cocktail caipirinha = new Cocktail("Caipirinha", zutatenCaipirinha, false, false, 0, true);

        model.rezeptverwaltung.nehmeRezeptAuf(orangenlimo);
        model.rezeptverwaltung.nehmeRezeptAuf(zitronenlimo);
        model.rezeptverwaltung.nehmeRezeptAuf(caipirinha);
        model.rezeptverwaltung.zeigeAlleRezepteAn();
        System.out.println("Anzahl: " + model.rezeptverwaltung.ermittleAnzahlRezepte());
        System.out.println("Anzahl Limo: " + model.rezeptverwaltung.ermittleAnzahlRezepte("Limonade"));
        model.rezeptverwaltung.loescheRezept("Zitronenlimo", "Limonade");
        System.out.println("Anzahl Limo: " + model.rezeptverwaltung.ermittleAnzahlRezepte("Limonade"));
        model.rezeptverwaltung.zeigeAlleRezepteAn();
        model.rezeptverwaltung.zeigeRezeptAn("Orangenlimo", "Limonade");
        System.out.println("");
        System.out.println("---");
        Zutat[] zutatenOrangenlimoNeu = {orange, zitrone, minze, wasser, eis};
        orangenlimo.setZutaten(zutatenOrangenlimoNeu);
        model.rezeptverwaltung.nehmeRezeptAuf(orangenlimo);
        model.rezeptverwaltung.zeigeAlleRezepteAn();
        model.rezeptverwaltung.zeigeRezeptAn("Orangenlimo", "Limonade");

    }
    /*
    public void legeRezeptan() {

        Zutat limette = new Zutat("Limette", 2.00);
        Zutat zucker = new Zutat("Zucker", 0.25);
        Zutat orange = new Zutat("Orange", 1.50);

        Zutat[] zutatenCaipirinha = {limette, zucker};
        Cocktail caipirinha = new Cocktail("Caipirinha", zutatenCaipirinha, false, false, 0, true);

        //Cocktail-Array aus der Rezeptverwaltung holen
        Cocktail[] cocktails= model.rezeptverwaltung.getCocktailRezepte();
        //Caipirinha-Cocktail in das Cocktail-Array aufnehmen
        for (int i = 0; i < cocktails.length; i++){
            if (cocktails[i]==null){
                cocktails[i] = caipirinha;
                break;
            }
        }
        //Ausgabe aller Cocktailnamen in dem Cocktail-Array
        for (int i = 0; i < cocktails.length;i++){
            if (cocktails[i]!=null) {
                System.out.println(cocktails[i].getName());
            }
        }
        //Cocktail-Array in die Rezeptverwaltung übernehmen
        model.rezeptverwaltung.setCocktailRezepte(cocktails);

        Zutat minze = new Zutat("Minze", 0.75);
        Zutat wasser = new Zutat("Wasser", 0.10);
        Zutat eis = new Zutat("Eis", 0.50);

        Zutat[] zutatenOrangenlimo = {orange, minze, wasser, eis};
        Limonade orangenlimo = new Limonade("Orangenlimo", zutatenOrangenlimo, false, true, "Orange", true);

        //Limonaden-Array aus der Rezeptverwaltung holen
        Limonade[] limos= model.rezeptverwaltung.getLimonadeRezepte();
        //Organenlimo in das Limonaden-Array aufnehmen
        for (int i = 0; i < limos.length; i++){
            if (limos[i]==null){
                limos[i] = orangenlimo;
                break;
            }
        }
        //Ausgabe aller Limonadennamen in dem Cocktail-Array
        for (int i = 0; i < limos.length;i++){
            if (limos[i]!=null) {
                System.out.println(limos[i].getName());
            }
        }
        //Limonaden-Array in die Rezeptverwaltung übernehmen
        model.rezeptverwaltung.setLimonadeRezepte(limos);
    } */


}
