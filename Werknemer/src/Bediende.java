public class Bediende extends Werknemer {
    private final int LOONFACTOR = 192;
    private double weddeBarema;

    public Bediende(String naam, long rijksregisternummer, double weddeBarema) {
        super(naam, rijksregisternummer);
        this.weddeBarema = weddeBarema;
    }

    public double getLoon() {
        return uurloon * LOONFACTOR * weddeBarema;
    }

    public String toString() {
        return String.format("Naam: %s\nNummer: %d\nLoon: %.1f\n", naam, rijksregisternummer, getLoon());
    }
}
