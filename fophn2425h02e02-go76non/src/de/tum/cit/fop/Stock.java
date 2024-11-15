package de.tum.cit.fop;

public class Stock {
    private StockIngredient[] stockIngredients = {};

    public StockIngredient[] getStockIngredients() {
        return this.stockIngredients;
    }

    // TODO: Rename this method to addToStockIngredients
    public void addToStockIngredients(StockIngredient ingredient) {
        this.stockIngredients = ArrayHelpers.addElementToArray(this.stockIngredients, ingredient);
    }

    public void setStockIngredients(StockIngredient[] stockIngredients) {
        this.stockIngredients = stockIngredients;
    }

    public StockIngredient findStockIngredient(String name) {
        // TODO: Return x if the name is equal
        for (StockIngredient ingredient : this.stockIngredients) {
            if (ingredient.getName().equals(name)) {
                return ingredient;
            }
        }
        return null;
    }

    public int add(String ingredient) {
        StockIngredient stockIngredient = this.findStockIngredient(ingredient);

        if (stockIngredient != null) {
            // TODO: Uncomment the following once you have implemented StockIngredient
			stockIngredient.setQuantity(stockIngredient.getQuantity() + 1);
			return stockIngredient.getQuantity();
        }

        return -1;
    }

    public int take(String ingredient) {
        StockIngredient stockIngredient = this.findStockIngredient(ingredient);

        if (stockIngredient != null) {
            var ingredientsQuantity = stockIngredient.getQuantity(); // TODO: Replace 0 with the current quantity of the found stock ingredient
            if (ingredientsQuantity < 1) {
                return -1;
            }

            // TODO: Uncomment the following once you have implemented StockIngredient
			stockIngredient.setQuantity(ingredientsQuantity - 1);
			return stockIngredient.getQuantity();
        }

        return -1;
    }
}
