public class Contact {
    private String naam;
    private ContactGegevens gegevens;

    public Contact(String naam, String eMail, String vastNummer, String gsmNummer) {
        this.naam = naam;
        this.gegevens = new ContactGegevens(eMail, vastNummer, gsmNummer);
    }

    public String toString() {
        System.out.println("Naam: " + naam);
        return gegevens.toString();
    }

    public void toonInfo() {
        System.out.println("Naam: " + naam);
        System.out.println("E-mail: " + gegevens.geteMail());
        System.out.println("Tel: " + gegevens.getTelefoon());
        System.out.println("GSM: " + gegevens.getGsm());
    }
}
