package innerclass;


// Outer class
public class ShoppingCart {
    private String customerName;
    private Item[] items;
    private int itemCount;
    private static final int MAX_ITEMS = 2;

    public ShoppingCart(String customerName){
        this.customerName = customerName;
        this.items = new Item[MAX_ITEMS];
        this.itemCount = 0;
    }

    // Item is an Inner Class
    public class Item{
        private String itemName;
        private double itemPrice;
        private int itemQuantity;


        public Item(String itemName, double itemPrice, int itemQuantity){
            this.itemName = itemName;
            this.itemPrice = itemPrice;
            this.itemQuantity = itemQuantity;

        }

        public double getTotalPrice(){
            return itemPrice * itemQuantity;
        }

        public String toString(){
            return itemName + " - GHC" + itemPrice + " x " + itemQuantity;
        }
    }

    public void addItem(String itemName, double itemPrice, int itemQuantity){
        if(itemCount < MAX_ITEMS) {
            items[itemCount++] = new Item(itemName, itemPrice, itemQuantity);
            System.out.println(itemName + " added to cart successfully");
        } else {
            System.out.println("Shopping cart is full. Cannot add another item");
        }
    }

    public void displayItems(){
        System.out.println("Items in your cart your are:");
        for(Item item: items){
            if(item != null)
                System.out.println(item);
        }
    }

    public double calculateTotal(){
        double total = 0.0;
        for(int i = 0; i < itemCount; i++){
            total += items[i].getTotalPrice();
        };

        return total;
    }
}
