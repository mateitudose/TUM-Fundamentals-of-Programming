package de.tum.cit.fop;
public class StockIngredient {
    private final String name;
    private int price;
    private int quantity;

    public StockIngredient(String name, int price, int quantity) {
        this.name = (name == null || name.isEmpty()) ? "" : name;
        this.price = price < 0 ? 0 : price;
        this.quantity = quantity < 0 ? 0 : quantity;
    }

    public String getName() {
        return name;
    }

//    public void setName(String name) {
//        this.name = (name == null || name.isEmpty()) ? this.name : name;
//    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price < 0 ? this.price : price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity < 0 ? this.quantity : quantity;
    }
}
