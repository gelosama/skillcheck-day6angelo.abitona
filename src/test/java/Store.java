import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Store {
    public void ReadItemStoreFromFile(String filename) throws IOException {
        int w = 1, x = 2 , y = 3 , z = 0, CustomerInput;
        Scanner scanner = new Scanner(System.in);
        System.out.println("_______________________________________________________________");
        System.out.println("Press [1] Add || [2] Remove Item || [3] Checkout || [0] Exit  ");
        System.out.println("_______________________________________________________________");
        System.out.println();
        CustomerInput = scanner.nextInt();
        if (CustomerInput == w) {
            System.out.println("Store Items");
            System.out.println("-----------------------------------------------------------------");
            BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\angelo.abitona\\IdeaProjects\\Shopping Cart\\src\\test\\java\\items.csv"));
            System.out.println("-----------------------------------------------------------------");

            String line = " ";
            ArrayList itemList = new ArrayList();

            while ((line = bufferedReader.readLine()) != null) {
                String[] splitter = line.split(",");
                Item item = new Item(splitter[0], Double.parseDouble(splitter[1]));
                itemList.add(item);
            }

            bufferedReader.close();
            int index = 0;

            for (Iterator var8 = itemList.iterator(); var8.hasNext(); ++index) {
                Item item = (Item) var8.next();
                item.setIndex(index);
            }

            Iterator itr = itemList.iterator();
            while (itr.hasNext()) {
                System.out.print(itr.next());
            }
            System.out.println("[0] - [6] to select items ");
            System.out.println("Select items to add: ");
            try {
                int itemAdded = scanner.nextInt();
                if (itemAdded < 0 || itemAdded > 6) {
                    System.out.print("Invalid Input");
                    int Index = 0;
                   // Iterator iterator = Cart.getItems().iterator();
                  //  while (iterator.hasNext()) {
                  //      System.out.print("[" + index + "]" + " " + iterator.next());
                        index++;
                    }
                //}


            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
