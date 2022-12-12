package PR16;

import java.util.Arrays;
import java.util.Objects;

public class Order {

    private static final int DEFAULT_CAPACITY = 10;

    private int capacity;
    private int size;
    private Item[] items;


    public Order() {
        items = new Item[DEFAULT_CAPACITY];
        capacity = DEFAULT_CAPACITY;
    }

    // Проверяет, достаточно ли вместимости массива
    private boolean checkOverflow(int size) {
        return size >= capacity;
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

    public void add(Item element) {
        if (checkOverflow(size + 1)) increaseArray();

        items[size] = element;
        size++;
    }

    public Item get(int index) {
        return items[index];
    }

    public void remove(String itemName) {
        boolean flag = false;
        Item[] newItems = new Item[capacity];

        for (int i = 0; i < size; i++) {
            if (Objects.equals(items[i].getName(), itemName)) {
                flag = true;
                size--;
            }

            if (flag) {
                if (size != i + 1) newItems[i] = items[i + 1];
            } else {
                newItems[i] = items[i];
            }
        }
        items = newItems;
    }

    @Override
    public String toString() {
        return "Order{" +
                "capacity=" + capacity +
                ", size=" + size +
                ", items=" + Arrays.toString(items) +
                '}';
    }

    public static void main(String[] args) {
        Order ord = new Order();
        ord.add(new Dish("Chiken", "Cow"));
        ord.add(new Dish("Chiken2", "Cow2"));
        ord.add(new Dish("Chiken3", "Cow3"));
        System.out.println(ord);

        ord.remove("Chiken3");
        System.out.println(ord);
    }
}
