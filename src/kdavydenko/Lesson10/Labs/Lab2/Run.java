package kdavydenko.Lesson10.Labs.Lab2;

public class Run {
    public static void main(String[] args) {
        Basket basket = new Basket();

        basket.addProduct("Smartphones", 3);
        basket.addProduct("Computers", 2);
        basket.addProduct("TV", 4);

        basket.updateProductQuantity("TV", 3);
        basket.updateProductQuantity("Laptops", 2);
        System.out.println(basket.getProductQuantity("TV"));
        System.out.println(basket.getProducts());
        basket.clear();
        System.out.println(basket.getProducts());
    }
}
