public class RuimteFiguren {
    private RuimteFiguur[] figuren;

    public RuimteFiguren() {
        figuren = new RuimteFiguur[5];
        vulTabel();
    }

    private void vulTabel() {
        figuren[0] = new Bol();
        figuren[1] = new Kubus(2.0);
        figuren[2] = new Cilinder("groen", 2.0, 5.0);
        figuren[3] = new Kubus("geel", 3.0);
        figuren[4] = new Bol("rood", 2.0);
    }

    public void toonFiguren() {
        for (RuimteFiguur figuur : figuren) {
            System.out.printf("kleur: %s   oppervlakte: %2.3f   inhoud: %2.3f\n", figuur.getKleur(),figuur.oppervlakte(),figuur.inhoud());
        }
    }
}
