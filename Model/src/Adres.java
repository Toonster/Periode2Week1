public class Adres {
    private String gemeente;
    private int postNummer;
    private String straat;

    public Adres() {
        gemeente = "";
        straat = "";
    }

    public Adres(String gemeente, int postNummer, String straat) {
        this.gemeente = gemeente;
        this.postNummer = postNummer;
        this.straat = straat;
    }

    public void setAdres(String gemeente, int postNummer, String straat) {
        this.gemeente = gemeente;
        this.postNummer = postNummer;
        this.straat = straat;
    }

    public String toString() {
        if (straat.isEmpty()) {
            return "Adres onbekend";
        } else {
            return String.format("Adres: %s %d %s\n", straat, postNummer, gemeente);
        }
    }
}
