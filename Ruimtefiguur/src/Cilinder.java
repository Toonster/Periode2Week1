public class Cilinder extends RuimteFiguur {
    private double diameter;
    private double lengte;

    public Cilinder() {
        super("zwart");
        diameter = 1.0;
        lengte = 1.0;
    }

    public Cilinder(String kleur, double diameter, double lengte) {
        super(kleur);
        this.diameter = diameter;
        this.lengte = lengte;
    }

    public Cilinder(double diameter, double lengte) {
        super("zwart");
        this.diameter = diameter;
        this.lengte = lengte;
    }

    public double getDiameter() {
        return diameter;
    }

    public double oppervlakte() {
        return (2 * Math.PI * (diameter / 2) * (lengte + (diameter/2)));
    }

    public double inhoud() {
        return (Math.PI * lengte * (diameter / 2));
    }
}
