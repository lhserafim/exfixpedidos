package entities;

import java.util.ArrayList;
import java.util.List;

public class OrderItem {
    private int quantity;
    private Double price;
    private Product product;

    public OrderItem() {
    }

    public OrderItem(int quantity, Double price, Product products) {
        this.quantity = quantity;
        this.price = price;
        this.product = products;
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

    public Product getProduct() {
        return product;
    }

    public Double subTotal() {
        return quantity * price;
    }

    public String toString() {
        return product.getName()
                + ", $"
                + String.format("%.2f", price)
                + ", Quantity: "
                + quantity +
                ", Subtotal: $"
                + String.format("%.2f", subTotal());
    }

}
