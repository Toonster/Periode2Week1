import java.util.ArrayList;
import java.util.List;

public class Mandje {
    private List<Aankoop> mandje;

    public Mandje() {
        mandje = new ArrayList<>();
    }

    public void add(Aankoop aankoop) {
        mandje.add(aankoop);
    }

    public void toon() {
        for (Aankoop aankoop : mandje) {
            System.out.println(aankoop.toString());
        }
    }

    public void printFactuur() {
        for (Aankoop aankoop : mandje) {
            aankoop.toon();
        }
    }

    public void printTotaalExclusief() {
        double totaalExclusief = 0;
        for (Aankoop aankoop : mandje) {
            totaalExclusief += aankoop.totaalExclusief();
        }
        System.out.println("Totaal zonder BTW: €" + totaalExclusief);
    }

    public void printBtwTotaal() {
        double btwTotaal = 0;
        for (Aankoop aankoop : mandje) {
            btwTotaal += aankoop.totaalBtw();
        }
        System.out.println("Totaal BTW: €" + btwTotaal);
    }

    public void printTotaalInclusief() {
        double totaalInclusief = 0;
        for (Aankoop aankoop : mandje) {
            totaalInclusief += aankoop.totaalInclusief();
        }
        System.out.println("Totaal inclusief BTW: €" + totaalInclusief);
    }

    public void printTotaalTaksen() {
        double totaalTaksen = 0;
        for (Aankoop aankoop : mandje) {
            totaalTaksen += aankoop.getInvoerTaks();
        }
        System.out.println("Totaal taksen: €" + totaalTaksen);
    }

}
