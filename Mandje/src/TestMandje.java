public class TestMandje {
    public static void main(String[] args) {
        Artikel[] artikels = {
                new Artikel(100, "Badhanddoek", 12.5, 25),
                new Artikel(200, "The Naked Chef", 19.90, 6),
                new Artikel(201, "Vrouwen komen van Venus, Mannen van Mars", 21.90, 6),
                new ImportArtikel(400, "Chinees Vuurwerk", 45.50, 25, 15),
                new TaxfreeArtikel(600, "Chanel N°5", 119.95)
        };
        Mandje mandje = new Mandje();
        mandje.add(new Aankoop(artikels[0], 2));
        mandje.add(new Aankoop(artikels[1], 1));
        mandje.add(new Aankoop(artikels[2], 1));
        mandje.add(new Aankoop(artikels[3
                ], 5));
        mandje.add(new Aankoop(artikels[4], 2));
        mandje.toon();
        mandje.printFactuur();
        mandje.printTotaalTaksen();
    }
}
