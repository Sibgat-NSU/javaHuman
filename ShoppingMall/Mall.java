package ShoppingMall;

import java.util.ArrayList;
import java.util.List;

public class Mall {
    private String mallName;
    private List<Products> products;
    private Products product;

    Mall(String mallName) {
        this.mallName = mallName;
        products = new ArrayList<Products>();
    }

    Mall(Products product) {
        this.products.add(product);
    }

    Mall(String mallName, Products product) {
        this.mallName = mallName;
        this.products.add(product);
    }

    public void addProduct(Products p) {
        products.add(p);
    }

    public String getMallName() {
        return mallName;
    }

    public List<Products> getProducts() {
        return products;
    }
}
