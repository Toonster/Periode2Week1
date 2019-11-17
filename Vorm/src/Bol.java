public class Bol extends Vorm{
    private int straal;

    public Bol(String kleur, int straal) {
        super(kleur);
        this.straal = straal;
    }

    public double oppervlakte() {
        return   (4 * Math.PI * Math.pow(straal, 2));
    }

    public double volume() {
        return (((double)4 / 3) * Math.PI * Math.pow(straal, 3));
    }

    public String toString() {
        return String.format("Kleur: %s, straal: %d, oppervlakte: %.3f  volume: %.3f\n", getKleur(), straal, oppervlakte(), volume());
    }
}
