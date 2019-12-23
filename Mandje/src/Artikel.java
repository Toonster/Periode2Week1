public class Artikel {
    private int artikelnummer;
    private String omschrijving;
    private double prijs;
    private int btwTarief;

    public Artikel(int artikelnummer, String omschrijving, double prijs, int btwTarief) {
        this.artikelnummer = artikelnummer;
        this.omschrijving = omschrijving;
        this.prijs = prijs;
        this.btwTarief = btwTarief;
    }

    public int getArtikelnummer() {
        return artikelnummer;
    }

    public String getOmschrijving() {
        return omschrijving;
    }

    public double getPrijs() {
        return prijs;
    }

    public int getBtwTarief() {
        return btwTarief;
    }

    public double getTotalePrijs() {
        return prijs * (1 + ((double)btwTarief / 100));
    }

    @Override
    public String toString() {
        return String.format("%d %s %.2f %d%%", artikelnummer, omschrijving, prijs, btwTarief);
    }

    public double getInvoerTaks() {
        return 0.0;
    }
}
