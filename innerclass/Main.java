package innerclass;

public class Main {
    public static void main(String[] args){
        ShoppingCart cart = new ShoppingCart("Eliezer");

        cart.addItem("Laptop", 12000.00, 2);

        cart.displayItems();
        System.out.println("Total cost: GHC" + cart.calculateTotal());
    }
}
