public abstract class Werknemer {
    protected final double uurloon = 12.5;
    protected String naam;
    protected long rijksregisternummer;

    public Werknemer(String naam, long rijksregisternummer) {
        this.naam = naam;
        this.rijksregisternummer = rijksregisternummer;
    }

    public abstract double getLoon();

    public String toString(){
        return String.format("Naam: %s\nNummer: %d\n", naam, rijksregisternummer);
    }
}
