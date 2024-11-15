package de.tum.cit.fop;

import java.util.LinkedList;
import java.util.Queue;

public class BurgerShop {
    private Queue<Burger> orders;
    private Stock stock;

    public BurgerShop() {
        this.orders = new LinkedList<>();
        this.stock = new Stock();
    }

    public Queue<Burger> getOrders() {
        return orders;
    }

    public void setOrders(Queue<Burger> orders) {
        this.orders = orders;
    }

    public Stock getStock() {
        return stock;
    }

    public void setStock(Stock stock) {
        this.stock = stock;
    }

    public int calculateTotalPrice(Burger burger) {
        int totalPrice = 0;
        for (String ingredient : burger.getIngredients()) {
            totalPrice += this.stock.findStockIngredient(ingredient).getPrice();
        }
        return totalPrice;
    }

    public void acceptSupplyDelivery(String name, int price, int quantity) {
        StockIngredient stockIngredient = this.stock.findStockIngredient(name);
        if (stockIngredient == null) {
            stockIngredient = new StockIngredient(name, price, quantity);
            this.stock.addToStockIngredients(stockIngredient);
        } else {
            stockIngredient.setPrice(price);
            stockIngredient.setQuantity(stockIngredient.getQuantity() + quantity);
        }
    }

    public void orderBurger(Burger burger) {
        this.orders.add(burger);
        checkOrderReady();
    }

    public void checkOrderReady() {
        while (!orders.isEmpty()) {
            Burger burger = orders.peek();
            boolean canServe = true;

            for (String ingredient : burger.getIngredients()) {
                StockIngredient stockIngredient = stock.findStockIngredient(ingredient);
                if (stockIngredient == null || stockIngredient.getQuantity() < 1) {
                    canServe = false;
                    break;
                }
            }

            if (!canServe) {
                return;
            }

            for (String ingredient : burger.getIngredients()) {
                stock.take(ingredient);
            }

            orders.poll();
            System.out.println("The order is ready: " + burger.getName());
        }
    }
}
