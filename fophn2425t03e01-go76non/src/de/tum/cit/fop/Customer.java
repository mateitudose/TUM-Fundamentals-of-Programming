package de.tum.cit.fop;

public class Customer {
    private String name;
    private String carriedItem;

    public Customer(String name, String carriedItem) {
        this.name = name;
        this.carriedItem = carriedItem;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCarriedItem() {
        return carriedItem;
    }

    public void setCarriedItem(String carriedItem) {
        this.carriedItem = carriedItem;
    }

    public void successfullyEnteredHall(Wardrobe wardrobe) {
        wardrobe.addItemToStack(carriedItem);
        System.out.println("YAY! " + name + " entered the hall");
    }

    public void failedToEnterHall() {
        System.out.println(name + ", don't cry bro :(");
    }
}
