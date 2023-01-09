package pl.javastart.task;

public class SpecialOffer {
    Product product;
    String offerDescription;
    String offerTime;
    double discountPercent;

    public SpecialOffer(Product product, String offerDescription, String offerTime, double discountPercent) {
        this.product = product;
        this.offerDescription = offerDescription;
        this.offerTime = offerTime;
        this.discountPercent = discountPercent;
    }

    void specialOffer() {
        product.price = product.price - discountPercent *  product.price;
        System.out.println(offerDescription + "\n" + offerTime + "\n"
                + "Nazwa produktu: " + product.name
                + ", Opis produktu: " + product.description
                + ", Cena promocyjna: " + product.price + "zł");
    }
}
