public class Maten {
    private int borstOmtrek;
    private int heupOmtrek;
    private int taille;

    public Maten() {
        borstOmtrek = 90;
        heupOmtrek = 60;
        taille = 90;
    }

    public Maten(int borstOmtrek, int heupOmtrek, int taille) {
        this.borstOmtrek = borstOmtrek;
        this.heupOmtrek = heupOmtrek;
        this.taille = taille;
    }

    public String toString() {
        return String.format("Maten: %d %d %d\n", borstOmtrek, heupOmtrek, taille);
    }
}
