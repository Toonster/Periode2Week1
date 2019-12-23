public class ImportArtikel extends Artikel {
    private double invoerTaks;

    public ImportArtikel(int artikelnummer, String omschrijving, double prijs, int btwTarief, double invoerTaks) {
        super(artikelnummer, omschrijving, prijs, btwTarief);
        this.invoerTaks = invoerTaks;
    }

    @Override
    public double getInvoerTaks() {
        return invoerTaks;
    }

    @Override
    public String toString() {
        return String.format("%s %.2f\n", super.toString(), invoerTaks);
    }
}
