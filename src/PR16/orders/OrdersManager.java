package PR16.orders;

import PR16.items.Item;

import java.util.HashMap;

public class OrdersManager {

    private HashMap<String, Order> orders = new HashMap<>();

    // -перегрузка метода добавления заказа. В качестве параметров принимает строку – адрес и ссылку на заказ.
    public void addOrder(String address, Order order) {
        orders.put(address, order);
    }

    //−перегрузка метода получения заказа. В качестве параметра принимает строку – адрес.
    public Order getOrder(String address) {
        return orders.get(address);
    }

    //−перегрузка метода удаления заказа. В качестве параметра принимает строку – адрес заказа.
    public void removeOrder(String address) {
        orders.remove(address);
    }

    //−перегрузка метода добавления позиции к заказу. В качестве параметра принимает адрес и Item.
    public void addOrder(String address, Item item) {
        Order order = new RestaurantOrder();
        order.add(item);
        orders.put(address, order);
    }

    //−возвращающий массив имеющихся на данный момент интернет-заказов.
    //−возвращающий суммарную сумму имеющихся на данный момент интернет-заказов.
    //−возвращающий общее среди всех интернет-заказов количество заказанных порций заданного блюда по его имени. Принимает имя блюда в качестве параметра. Методы должны работать с интерфейсными ссылками Order и Item.

}
