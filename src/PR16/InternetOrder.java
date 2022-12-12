package PR16;

import java.util.Collection;
import java.util.LinkedList;

public class InternetOrder {

    private LinkedList<Item> order;

    public InternetOrder() {
        order = new LinkedList<>();
    }

    // В чем разница между этим и просто Item
    public InternetOrder(Collection<? extends Item> c) {
        order = new LinkedList<>(c);
    }

    public void addItem(Item item) {
        order.add(item);
    }
    // ???
    public void deleteItem(String name) {
        order.removeLastOccurrence(name);
    }

    public void deleteAllItem(String name) {

    }



}
