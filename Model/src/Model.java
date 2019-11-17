public class Model {
    private Adres adres;
    private Maten maten;
    private String naam;

    public Model(String naam) {
        this.naam = naam;
        adres = new Adres();
        maten = new Maten();
    }

    public Model(String naam, int borstOmtrek, int heupOmtrek, int taille) {
        this.naam = naam;
        maten = new Maten(borstOmtrek, heupOmtrek, taille);
        adres = new Adres();
    }

    public String getNaam() {
        return naam;
    }

    public void setAdres(String gemeente, int postNummer, String straat) {
        adres.setAdres(gemeente, postNummer, straat);
    }

    public String toString() {
        System.out.println("Naam: " + naam);
        return adres.toString() + maten.toString();

    }
}
