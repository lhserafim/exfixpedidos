package entities;

import java.util.ArrayList;
import java.util.List;

public class OrderItem {
    private int quantity;
    private Double price;
    private List<Product> products = new ArrayList<>();

    public OrderItem() {
    }

    public OrderItem(int quantity, Double price) {
        this.quantity = quantity;
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity() {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public List<Product> getProduct() {
        return products;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public Double subTotal() {
        return quantity * price;
    }

}
