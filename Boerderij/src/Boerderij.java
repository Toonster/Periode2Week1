public class Boerderij {
    private Dier[] dieren;
    private static int teller = 0;

    public Boerderij() {
        dieren = new Dier[5];
    }

    public void voegDierToe(Dier dier) {
        if (teller < 5) {
            dieren[teller] = dier;
            teller++;
        } else {
            System.out.println("De stal zit vol!");
        }
    }

    public void toonDieren() {
        for (Dier dier : dieren) {
            System.out.println(dier);
        }
    }

    public void toonGeluiden() {
        for (Dier dier : dieren) {
            System.out.printf("%s maakt geluid \"%s\" \n", dier.getNaam(), dier.getGeluid());
        }
    }

    public void toonVoeding() {
        for (Dier dier : dieren) {
            System.out.printf("%s eet %s\n", dier.getNaam(), dier.getVoeding());
        }
    }

    public boolean zoekDierOpNaam(String naam) {
        for (Dier dier : dieren) {
            if (dier.getNaam().contentEquals(naam)) {
                return true;
            }
        }
        return false;
    }

}
