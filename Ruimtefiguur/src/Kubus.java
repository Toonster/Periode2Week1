public class Kubus extends RuimteFiguur {
    private double ribbe;

    public Kubus() {
        super("zwart");
        ribbe = 1.0;
    }

    public Kubus(String kleur, double ribbe) {
        super(kleur);
        this.ribbe = ribbe;
    }

    public Kubus(double ribbe) {
        super("zwart");
        this.ribbe = ribbe;
    }

    public double getRibbe() {
        return ribbe;
    }

    public double oppervlakte() {
        return (6 * Math.pow(ribbe, 2));
    }

    public double inhoud() {
        return Math.pow(ribbe, 3);
    }
}
