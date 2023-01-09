package pl.javastart.task;

public class Product {
    String name;
    String description;
    double price;
    Category category;

    @SuppressWarnings("checkstyle:EmptyLineSeparator")
    public Product(String name, String description, double price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public Product(String name, String description, double price, Category category) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.category = category;
    }

    void showInfo() {
        if (category != null) {
            System.out.println("Kategoria: " + category.name + " , " + category.description + " | "
                    + "Nazwa produktu: " + name
                    + ", Opis produktu: " + description
                    + ", Cena: " + price + "zł");
        } else {
            System.out.println("Nazwa produktu: " + name
                    + ", Opis produktu: " + description
                    + ", Cena: " + price + "zł");
        }
    }
}
