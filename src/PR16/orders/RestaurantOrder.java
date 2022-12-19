package PR16.orders;

import PR16.items.Dish;
import PR16.items.Item;

import java.util.Arrays;
import java.util.Objects;

public class RestaurantOrder implements Order {

    private static final int DEFAULT_CAPACITY = 10;

    private int capacity;
    private int size;
    private Item[] items;


    public RestaurantOrder() {
        items = new Item[DEFAULT_CAPACITY];
        capacity = DEFAULT_CAPACITY;
    }

    public RestaurantOrder(int capacity) {
        items = new Item[capacity];
        this.capacity = capacity;
    }

    // Проверяет, достаточно ли вместимости массива
    private boolean checkOverflow(int size) {
        return size > capacity;
    }

    // Увеличивает емкость массива в 1.5 раза
    private void increaseArray() {
        capacity = (int) (capacity * 1.5f);
        Item[] newItems = new Item[capacity];

        for (int i = 0; i < size; i++) {
            newItems[i] = items[i];
        }
        items = newItems;
    }

    private Item get(int index) {
        return items[index];
    }

    private void remove(int index) {

        Item[] newItems = new Item[capacity];

        if (index == size - 1) {
            size--;
            items[index] = null;
            return;
        }

        for (int i = 0; i < index; i++) {
            newItems[i] = items[i];
        }
        for (int i = index; i < size - 1; i++) {
            newItems[i] = items[i + 1];
        }

        items = newItems;
        size--;
    }

    @Override
    public void add(Item element) {
        if (checkOverflow(size + 1)) increaseArray();

        items[size] = element;
        size++;
    }

    @Override
    public boolean removeByName(String itemName) {
        for (int i = 0; i < size; i++) {
            if (Objects.equals(items[i].getName(), itemName)) {
                remove(i);
                return true;
            }
        }
        return false;
    }

    @Override
    public int removeAllByName(String itemName) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (Objects.equals(items[i].getName(), itemName)) {
                remove(i);
                count++;
            }
        }
        return count;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public Item[] getArrayItems() {
        return items;
    }

    @Override
    public int getTotalCost() {
        int totalCost = 0;
        for (int i = 0; i < size; i++) {
            totalCost += items[i].getPrice();
        }

        return totalCost;
    }

    @Override
    public int getCountItemsByItemName(String itemName) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (Objects.equals(items[i].getName(), itemName)) count++;
        }
        return count;
    }

    @Override
    public String toString() {
        /*
        String tmp = "";
        for (int i = 0; i < size; i++) {
            String += items[i] + '\n;
         */

        return "Order{" +
                "capacity=" + capacity +
                ", size=" + size +
                ", items=" + Arrays.toString(Arrays.copyOfRange(items, 0, size)) +
                '}';
    }

    public static void main(String[] args) {
        RestaurantOrder ord = new RestaurantOrder();
        ord.add(new Dish("Chiken", "Cow"));
        ord.add(new Dish("Chiken2", "Cow2"));
        ord.add(new Dish("Chiken3", "Cow3"));
        ord.add(new Dish("Chiken2", "Cow2"));
        ord.add(new Dish("Chiken3", "Cow3"));

        System.out.println(ord);

        ord.removeAllByName("Chiken3");

        System.out.println(ord);
    }
}
