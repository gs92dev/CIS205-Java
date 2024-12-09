public class MainClass {

    public static void main(String[] args) {
        InventoryManager myInventory = new InventoryManager();
        myInventory.addProduct(new Product("Apple", 0.99, 12));
        myInventory.addProduct(new Product("Orange", 1.99, 7));
        myInventory.addProduct(new Product("PS5", 500.99, 3));
        myInventory.addProduct(new Product("Banana", 0.5, 5));

        myInventory.displayInventory();

        myInventory.removeProduct("apple");

        System.out.println("\nAfter removing Apple\n");
        myInventory.displayInventory();
    }

}
