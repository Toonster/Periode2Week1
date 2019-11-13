public class Bol extends RuimteFiguur {
    private double straal;

    public Bol() {
        super("zwart");
        straal = 1.0;

    }
    public Bol(String kleur, double straal) {
        super(kleur);
        this.straal = straal;
    }

    public Bol(double straal) {
        super("zwart");
        this.straal = straal;
    }

    public double getStraal() {
        return straal;
    }

    public double oppervlakte() {
        return (4 * Math.PI * Math.pow(straal, 2));
    }

    public double inhoud() {
        return (((double)4 / 3) * Math.PI * Math.pow(straal, 3));
    }
}
