package PR8;

public class BoundedWaitList<E> extends WaitList<E> {

    private int capacity;

    public BoundedWaitList(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public void add(E element) {
        if (deque.size() >= capacity)
            System.out.println("Очередь переполнена!");
        else
            deque.addFirst(element);
    }

    @Override
    public String toString() {
        return "BoundedWaitList{" +
                "capacity=" + capacity +
                ", deque=" + deque +
                '}';
    }
}
