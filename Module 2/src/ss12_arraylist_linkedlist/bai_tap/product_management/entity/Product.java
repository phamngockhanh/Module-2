package ss12_arraylist_linkedlist.bai_tap.product_management.entity;

public class Product {
    private int id;
    private String name;
    private double price;

    public Product() {
    }

    public Product(String name, int id, double price) {
        this.name = name;
        this.id = id;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price
                + ", ";
    }
}
