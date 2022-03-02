package skuksovsky.Lab10.Collections.OnlineShop;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ShopBasket implements Basket {
    private Map<String, Integer> products = new HashMap<>();

    @Override
    public String toString() {
        String result = "Вы выбрали: \n";
        for (Map.Entry <String, Integer> product: products.entrySet()) {
            result += "товар: " + product.getKey() + "; количество: " + product.getValue() + "\n";
        }
        return result;
    }

    @Override
    public void addProduct(String product, int quantity) {
        if (quantity > 0) {
            products.put(product, quantity);
        } else {
            throw new ArithmeticException("Неправильное количество");
        }

    }

    @Override
    public void removeProduct(String product) {
        products.remove(product);
    }

    @Override
    public void updateProductQuantity(String product, int quantity) {
        if (quantity > 0) {
            products.replace(product, quantity);
        } else {
            throw new ArithmeticException("Неправильное количество");
        }
    }

    @Override
    public void clear() {
        products.clear();
    }

    @Override
    public List<String> getProducts() {
        List<String> productList = new ArrayList<>();
        for (Map.Entry<String, Integer> product: products.entrySet()) {
            productList.add(product.getKey());
        }
        return productList;
    }

    @Override
    public int getProductQuantity(String product) {
        int quantity = products.get(product);
        return quantity;
    }
}
