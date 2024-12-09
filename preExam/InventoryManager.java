import java.util.ArrayList;

public class InventoryManager {

    private ArrayList<Product> myInventory = new ArrayList<Product>();

    public void addProduct(Product product) {
        myInventory.add(product);
    }

    public void displayInventory() {
        for (Product product : myInventory) {
            System.out.println(product);
        }
    }

    public void removeProduct(Product product) {
        myInventory.remove(product);
    }

    public void removeProduct(String ProductName) {
        int index = -1;
        int size = myInventory.size();

        for (int i = 0; i < size; i++) {
            if (myInventory.get(i).getProductName().equalsIgnoreCase(ProductName)) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            System.out.println(ProductName + "is not in the inventory");
        } else {
            myInventory.remove(index);
        }

    }

}
