public class Kip extends Dier {
    private int aantalEierenPerWeek;

    public Kip(String naam, int aantalEierenPerWeek) {
        super(naam, "Toktok", "mais");
        this.aantalEierenPerWeek = aantalEierenPerWeek;
    }

    public String toString() {
        return String.format("%s maakt geluid \"%s\" en eet %s en legt %d eieren per week\n", getNaam(),getGeluid(), getVoeding(), aantalEierenPerWeek);
    }
}
