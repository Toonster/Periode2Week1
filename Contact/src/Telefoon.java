public class Telefoon {
    private String soort;
    private String nummer;

    public Telefoon(String soort, String nummer) {
        this.soort = soort;
        this.nummer = nummer;
    }

    public String getSoort() {
        return soort;
    }

    public String getNummer() {
        return nummer;
    }

    public boolean isGeldigNummer() {
        if (nummer.charAt(0) != '0') {
            return false;
        } else if(soort.contentEquals("vast") && nummer.length() == 9) {
            return true;
        } else if (soort.contentEquals("mobiel") && nummer.length() == 10) {
            return true;
        } else {
            return false;
        }
    }
}
