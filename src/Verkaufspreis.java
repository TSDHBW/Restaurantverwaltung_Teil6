public interface Verkaufspreis {

    public static final double BASISPREIS = 1.50;
    public static final double KOCHBOX_BASIS = 0.75;

    public abstract double getAufschlag();
    public abstract double ermittleVerkaufspreis();

}
