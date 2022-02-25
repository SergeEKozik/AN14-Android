package eveshtard.Lab10.Shop;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Basket implements IBasket {
    private Map<String, Integer> basketProducts = new HashMap<>();

    public Basket() {
    }

    @Override
    public void addProduct(String product, int quantity) {
        basketProducts.put(product, quantity);
    }

    @Override
    public void removeProduct(String product) {
        basketProducts.remove(product);
    }

    @Override
    public void updateProductQuantity(String product, int quantity) {
        int tempQuant;
        if (basketProducts.containsKey(product)) {
            tempQuant = getProductQuantity(product) + quantity;
        } else {
            tempQuant = getProductQuantity(product);
        }
        basketProducts.put(product, tempQuant);
    }

    @Override
    public void clear() {
        basketProducts.clear();
    }

    @Override
    public List<String> getProducts() {
        return new ArrayList<>(basketProducts.keySet());
    }

    @Override
    public int getProductQuantity(String product) {
        return basketProducts.get(product);
    }
}
