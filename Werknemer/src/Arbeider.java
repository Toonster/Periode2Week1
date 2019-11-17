public class Arbeider extends Werknemer{
    private final int MAX_UREN_PER_WEEK = 38;
    private int aantalUren;

    public Arbeider(String naam, long rijksregisternummer, int aantalUren) {
        super(naam, rijksregisternummer);
        this.aantalUren = aantalUren;
    }

    public double getLoon() {
        if (aantalUren > MAX_UREN_PER_WEEK) {
            return (uurloon * MAX_UREN_PER_WEEK) + ((aantalUren - MAX_UREN_PER_WEEK) * uurloon * 1.5);
        } else {
            return aantalUren * uurloon;
        }
    }

    public String toString() {
        return String.format("Naam: %s\nNummer: %d\nLoon: %.1f\n", naam, rijksregisternummer, getLoon());
    }
}
