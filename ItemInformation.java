
//itemInformation Class
public class ItemInformation { 
    private int itemId;
    private String itemName;
    private double price;
    private String datePurchased;

    private static int id = 1;
    
    //mutator method 
    public ItemInformation(String itemName, double price, String datePurchased) {
        this.itemId = id++;
        this.itemName = itemName;
        this.price = price;
        this.datePurchased = datePurchased;
    }
    
    //mutator and accessor method for each attributes/variables
    public ItemInformation() {
        this.itemId = id++;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDatePurchased() {
        return datePurchased;
    }

    public void setDatePurchased(String datePurchased) {
        this.datePurchased = datePurchased;
    }
}