package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        Category drinks = new Category("Napoje bezalkoholowe",
                "Doskonałe do ugaszenia pragnienia");
        Category sweets = new Category("Słodycze",
                "Dla każdego łakomczucha");

        Product product1 = new Product("Czekolada", "Mleczna Milka", 3.58, sweets);
        Product product2 = new Product("Baton", "Krzyś Orzechowy ", 2.25, sweets);
        Product product3 = new Product("Woda", "Muszynianka Niegazowana", 3.10, drinks);
        Product product4 = new Product("Jabłko", "Janagold", 1);

        product1.showInfo();
        product2.showInfo();
        product3.showInfo();
        product4.showInfo();

        System.out.println("------------------------------");

        SpecialOffer specialOffer = new SpecialOffer(product1, "Tylko dzisiaj 20% obniżki!!!",
                "w godzinach od 13 do 17 ", 0.2);
        specialOffer.specialOffer();

    }
}
