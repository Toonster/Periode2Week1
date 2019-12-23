public class Aankoop {
    private Artikel artikel;
    private int aantal;

    public Aankoop(Artikel artikel, int aantal) {
        this.artikel = artikel;
        this.aantal = aantal;
    }

    public Artikel getArtikel() {
        return artikel;
    }

    public int getAantal() {
        return aantal;
    }

    @Override
    public String toString() {
        return String.format("%s\naantal: %d\n", super.toString(), aantal);
    }

    public double totaalExclusief() {
        return this.artikel.getPrijs() * aantal;
    }

    public double totaalBtw() {
        return totaalExclusief() * this.artikel.getBtwTarief();
    }

    public double totaalInclusief() {
        return (this.artikel.getTotalePrijs() + this.artikel.getInvoerTaks()) * aantal;
    }

    public void toon() {
        System.out.printf("%-25s aantal:  %d  prijs: € %.2f\nbtw: € %.2f  totaal: € %.2f\n",artikel.getOmschrijving(),
                aantal, totaalExclusief(), totaalBtw(), totaalInclusief());
    }

    public double getInvoerTaks() {
        return this.artikel.getInvoerTaks();
    }
}
