package ShoppingMall;

public class Products {
    private String name;
    private float price;
    private int qt;

    Products(String name, float price) {
        this.name = name;
        this.price = price;
        qt = 1;
    }

    Products(String name, float price, int qt) {
        this.name = name;
        this.price = price;
        this.qt = qt;
    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

    public int getQt() {
        return qt;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setQt(int qt) {
        this.qt = qt;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
