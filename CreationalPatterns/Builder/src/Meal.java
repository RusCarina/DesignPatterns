import java.util.ArrayList;
import java.util.List;
public class Meal {
    private List<Item> items = new ArrayList<Item>();
    public void addItem(Item item){
        items.add(item);
    }
    public void showItems(){

        for (Item item : items) {
            System.out.print("Item : " + item.name());
            System.out.print(", Packing : " + item.packing().pack());
        }
    }
}
