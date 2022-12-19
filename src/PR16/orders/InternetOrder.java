package PR16.orders;

import PR16.items.Item;

import java.util.Collection;
import java.util.LinkedList;
import java.util.Objects;

public class InternetOrder implements Order {

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
        while (order.removeLastOccurrence(name)){

        }
    }

    @Override
    public void add(Item item) {
        order.add(item);
    }

    @Override
    public boolean removeByName(String itemName) {
        return order.removeLastOccurrence(itemName);
    }

    @Override
    public int removeAllByName(String itemName) {
        int count = 0;
        while (order.removeLastOccurrence(itemName)){
            count++;
        }
        return count;
    }

    @Override
    public int getSize() {
        return order.size();
    }

    @Override
    public Item[] getArrayItems() {
        return (Item[]) order.toArray();
    }

    @Override
    public int getTotalCost() {
        int totalCost = 0;
        for (int i = 0; i < order.size(); i++) {
            totalCost += order.get(i).getPrice();
        }
        return totalCost;
    }

    @Override
    public int getCountItemsByItemName(String itemName) {
        int count = 0;
        for (int i = 0; i < order.size(); i++) {
            if (Objects.equals(order.get(i).getName(), itemName)) count++;
        }
        return count;
    }
}
