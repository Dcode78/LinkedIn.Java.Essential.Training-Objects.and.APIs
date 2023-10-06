package inheritance.bakery;

public class Cake {
    private String flaour;
    private double price;

    public String getFlavor(){
        return this.flaour;
    }

    public void setFlavor(String flaour) {
        this.flaour = flaour;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    Cake(){
        this.flaour = "vanilla";
        this.price = 9.99;
    }
}
