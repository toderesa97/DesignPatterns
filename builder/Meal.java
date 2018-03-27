package builder;

import java.util.ArrayList;
import java.util.List;

public class Meal {
    private List<Item> items;
    
    public Meal () {
        items = new ArrayList<>();
    }
    
    public void addItem(Item item) {
        items.add(item);
    }
    
    public float cost() {
        return items.stream().map((item) -> item.price())
                    .reduce((accumulator, _item) -> accumulator + _item).get();
    }
    
    public void showItems() {
        items.forEach((item) -> {
            System.out.println(String.format("Item->%s ; Packing->%s ; Price->%f"
                    , item.name(), item.packing().pack(), item.price()));
        });
    }
    
    public void addItem(List<Item> list) {
        items.addAll(list);
    }
}
