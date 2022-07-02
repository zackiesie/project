import java.util.ArrayList;
import java.util.List;

class CustomerInformation{//customer information class
    //declare attributes for this class as madam states
    private int custId; //1,2,3 so on
    private String custIc; //ex:0323-09-3234
    private int counterPaid; //counter1,2,3
    private List<ItemInformation> purchasedItemsList; // arraylist named
    
    private static int id = 1;
    
    //CustomerInformation method with paramater()
    public CustomerInformation(int custId, String ic ,int counterPaid) {
        this.custId = custId;
        this.custIc = ic;
        this.counterPaid = counterPaid;
        purchasedItemsList = new ArrayList<ItemInformation>();
        
        if(CustomerInformation.id <= custId){ // if statement cusID
            CustomerInformation.id = custId+1;
        }
    }

    public CustomerInformation(int custId, String ic) {
        this.custId = custId;
        this.custIc = ic;
        purchasedItemsList = new ArrayList<ItemInformation>();
        
        if(CustomerInformation.id <= custId){
            CustomerInformation.id = custId+1;
        }
    }

    public CustomerInformation(String ic) {
        this.custId = id++;
        this.custIc = ic;
        purchasedItemsList = new ArrayList<ItemInformation>();
    }
    
    /**
     *  accessor method and mutator method declare
     */
    
    public double getTotal(){
        double total = 0;

        for (ItemInformation ii : purchasedItemsList){ 
            total+=ii.getPrice();
        }

        return total;
    }
    
    //accessor 
    public String getAllItems(){
        StringBuilder sb = new StringBuilder();
        int x = 0;
        for (ItemInformation ii : purchasedItemsList){
            if(x!=0 && x!= purchasedItemsList.size()){
                sb.append(", ");
            }
            sb.append(ii.getItemName());
            x++;
        }
        return sb.toString();
    }
    
    //addItem
    public void addItem(ItemInformation ii){
        purchasedItemsList.add(ii);
    }
    
    //accessor
    public int getCustId() {
        return custId;
    }
    
    //accessor
    public String getCustIc(){
        return custIc;
    }
    
    //mutator
    public void setCustId(int custId) {
        this.custId = custId;
    }
    
    //accessor
    public int getCounterPaid() {
        return counterPaid;
    }
    
    //mutator
    public void setCounterPaid(int counterPaid) {
        this.counterPaid = counterPaid;
    }
    
    //accesor
    public int getTotalItems() {
        return purchasedItemsList.size();
    }
    
    //accesor
    public List<ItemInformation> getPurchasedItemList(){
        return purchasedItemsList;
    }
    
    //toString method 
    @Override
    public String toString() {
        return "CustId: "+custId+" Total Items: "+purchasedItemsList.size()+" Total Bill: " + getTotal() + 
                " Items:" + getAllItems();
    }
};