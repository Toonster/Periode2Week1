public class Konijn extends Dier {
    private boolean isGraver;

    public Konijn(String naam, boolean isGraver) {
        super(naam, "Snifsnif", "gras");
        this.isGraver = isGraver;
    }

    public String toString() {
        return String.format("%s maakt geluid \"%s\" en eet %s en graaft %s\n", getNaam(), getGeluid(), getVoeding(), isGraver ? "wel" : "niet" );
    }
}
