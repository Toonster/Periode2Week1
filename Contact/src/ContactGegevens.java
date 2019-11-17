public class ContactGegevens {
    private String eMail;
    private Telefoon telefoon;
    private Telefoon gsm;

    public ContactGegevens(String eMail, String vastNummer, String gsmNummer) {
        this.eMail = eMail;
        this.telefoon = new Telefoon("vast", vastNummer);
        this.gsm = new Telefoon("mobiel", gsmNummer);
    }

    public String geteMail() {
        return eMail;
    }

    public String getTelefoon() {
        return telefoon.getNummer();
    }

    public String getGsm() {
        return gsm.getNummer();
    }

    public String toString() {
        return String.format("E-mail: %s\nTel: %s\nGSM: %s\n", eMail, telefoon.getNummer(), gsm.getNummer());
    }
}
