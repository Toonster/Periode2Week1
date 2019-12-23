public class TaxfreeArtikel  extends Artikel{
    public TaxfreeArtikel(int artikelnummer, String omschrijving, double prijs) {
        super(artikelnummer, omschrijving, prijs, 0);
    }

    public double getTotalePrijs() {
        return super.getPrijs();
    }

    @Override
    public String toString() {
        return String.format("%s\n", super.toString());
    }


}
