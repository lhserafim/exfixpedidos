package entities;

public class OrderItem {
    private int quantity;
    private Double price;

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

}
