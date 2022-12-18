package PR11;


import java.util.Arrays;
import java.util.NoSuchElementException;

public class ArrayQueueModule<E> extends AbstractMyQueue<E> {

    private int size = super.size;
    private Object[] arr;

    {
        iHead = -1;
        size = 0;
    }

    public ArrayQueueModule() {
        arr = new Object[DEFAULT_CAPACITY];
        capacity = DEFAULT_CAPACITY;
    }

    public ArrayQueueModule(int capacity) {
        arr = new Object[capacity];
        this.capacity = capacity;
    }

    public int getSize() {
        return size;
    }

    public void clear() {
        size = 0;
        iHead = 0;
    }

    public boolean isEmpty() {
        return (size == 0);
    }

    public ArrayQueueModule<E> getInstance() {
        return this;
    }
    private boolean checkOverflow(int size) {
        return size > capacity;
    }

    @Override
    public E element() {
        if (isEmpty()) throw new NoSuchElementException();
        return (E) arr[iHead];
    }

    @Override
    public boolean offer(E e) {
        if (checkOverflow(size + 1)) return false;

        System.arraycopy(arr, 0, arr, 1, size);
        arr[0] = e;
        size++;
        iHead++;
        return true;
    }

    @Override
    public E peek() {
        if (isEmpty()) return null;
        return (E) arr[iHead];
    }

    @Override
    public E remove() {
        if (isEmpty()) throw new NoSuchElementException();
        size--;
        return (E) arr[iHead--];
    }

    @Override
    public E poll() {
        if (isEmpty()) return null;
        size--;
        return (E) arr[iHead--];

    }

    @Override
    public String toString() {
        return "ArrayQueueModule{" +
                "arr=" + Arrays.toString(Arrays.copyOfRange(arr, 0, iHead + 1)) +
                ", iHead=" + iHead +
                ", size=" + size +
                ", capacity=" + capacity +
                '}';
    }
}
