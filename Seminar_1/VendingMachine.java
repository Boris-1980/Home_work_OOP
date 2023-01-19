package Seminar_1;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class VendingMachine {

    private List<Product> products = new ArrayList<>();

    public VendingMachine(List<Product> products) {
        this.products = products;
    }

    public List<Product> getProducts() {
        return products;
    }

    public VendingMachine() {

    }

    public VendingMachine(Product product) {
        this(new ArrayList<>(Arrays.asList(product)));
    } /// вызывает конструктор со списком

    public void addProduct(Product product) {
        products.add(product);
    }

    // метод поиска
    public Product find(String name) {
        for (Product product : products) {
            if (product.getName().contains(name)) {
                return product;
            }
        }
        return null;
    }
}
