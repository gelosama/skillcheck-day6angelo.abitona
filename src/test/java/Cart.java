import java.util.ArrayList;
import java.util.List;

public class Cart  {

    private int Items;

    class cart {
        private List<Item> myItem = new ArrayList<>();
        private List<Item> getItems(){
            return myItem;
        }
        public void addItems(Item item){
            boolean add = true;
            for (Item i: myItem){
                if (i.getIndex() == item.getIndex()){
                    i.setQty(i.getQty() + 1);
                    add = false;
                }
            }if (add){
                item.setQty(item.getQty() + 1);
                myItem.add(item);
            }
        }

    }


}
