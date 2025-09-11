package Java_class_and_object.Level_1;

public class Items {
    String[] itemCode;
    String[] itemName;
    double[] price;

    Items(String[] itemName, String[] itemCode, double[] price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    public void displayItems(int i) {
        System.out.println("itemCode : " + itemCode[i]);
        System.out.println("itemPrice : " + price[i]);
        System.out.println("itemName : " + itemName[i]);
        System.out.println("----------------------------");
    }

    public void calculateTotalCost(int i, int quantity) {
        double total = price[i] * quantity;
        System.out.println("Item: " + itemName[i]);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: " + total);
        System.out.println("----------------------------");
    }

    public static void main(String[] args) {
        String[] itemName = {"Water bottle", "Rice", "Blackboard"};
        String[] itemCode = {"01AA", "01BB", "02AA"};
        double[] price = {500, 700, 400};

        Items item1 = new Items(itemName, itemCode, price);

        for (int i = 0; i < price.length; i++) {
            item1.displayItems(i);
        }

        System.out.println("---- Total Cost Calculation ----");
        item1.calculateTotalCost(0, 2); // 2 Water bottles
        item1.calculateTotalCost(1, 5); // 5 Rice
        item1.calculateTotalCost(2, 3); // 3 Blackboards
    }
}