import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

//main program for GUI
//main class
public class CheckOutSystem {
    private static List<CustomerInformation> customerList;
    private static Queue<CustomerInformation> counters[];
    
    //main method 
    public static void main(String[] args) {
        customerList = new LinkedList<>();
        counters = new Queue[3];

        for(int x=0;x<3;x++){
            counters[x] = new LinkedList<>(); 
        }

        int current_counter = readFile("MOCK_DATA.csv"); 
        /** read file kalau takde file dia akan error tapi program masih function lagi,tinggal add customer
        * 
        *
        */
       
       
        SelfCheckout selfcheckout = new SelfCheckout(customerList,current_counter);
        selfcheckout.setTable1(counters[0]);
        selfcheckout.setTable2(counters[1]);
        selfcheckout.setTable3(counters[2]);
        selfcheckout.setVisible(true);
    }

    public static int readFile(String filename){ //read file method
        String data;
        String[] splited;
        int current_counter = 0;
        
        //java exception (try and catch) kalau ada error
        try {
            File myObj = new File(filename);
            Scanner myReader = new Scanner(myObj);

            while (myReader.hasNextLine()) {
                data = myReader.nextLine();
                splited = data.split(",");

                CustomerInformation ci = new CustomerInformation(Integer.parseInt(splited[0]),splited[1]);

                for(int x=3;x<splited.length;x+=2){
                    ItemInformation ii = new ItemInformation(splited[x], Integer.parseInt(splited[x+1]), splited[2]);
                    ci.addItem(ii);
                }

                customerList.add(ci);

                if (splited.length <= 13){
                    ci.setCounterPaid(current_counter);
                    counters[current_counter].add(ci);
                    current_counter++;
                    current_counter = current_counter%2;
                }else {
                    ci.setCounterPaid(2);
                    counters[2].add(ci);
                }
            }

            myReader.close();
            return current_counter;
        } catch (FileNotFoundException e) { //kalau ada error
            System.out.println("An error occurred.");
        }
        return -1;
    }
    
    //printQueue method 
    public static void printQueue(Queue<CustomerInformation> queue, int qNo){
        System.out.println("Custoers in queue "+qNo+":");
        while (!queue.isEmpty()){
            CustomerInformation ci = queue.remove();
            System.out.println(ci);
        }
        System.out.println("\n\n");
    }
}
