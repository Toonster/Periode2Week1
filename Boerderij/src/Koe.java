public class Koe extends Dier {
    private int aantalLiterMelkPerDag;

    public Koe(String naam, int aantalLiterMelkPerDag) {
        super(naam, "Boeboe", "gras");
        this.aantalLiterMelkPerDag = aantalLiterMelkPerDag;
    }

    public String toString() {
        return String.format("%s maakt geluid \"%s\" en eet %s en geeft %d liter melk per dag\n", getNaam(), getGeluid(), getVoeding(), aantalLiterMelkPerDag);
    }
}
