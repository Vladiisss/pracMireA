package PR8;

import java.util.Collection;
import java.util.Deque;
import java.util.concurrent.ConcurrentLinkedDeque;


public class WaitList<E> implements IWaitList<E> {

    protected Deque<E> deque;

    WaitList<Double> df;

    public WaitList() {
        deque = new ConcurrentLinkedDeque<>();
    }

    public WaitList(Collection<E> c) {
        deque = new ConcurrentLinkedDeque<>();
        deque.addAll(c);
    }

    @Override
    public void add(E element) {
        deque.addLast(element);
    }

    @Override
    public E remove() {
        return deque.removeFirst();
    }

    @Override
    public boolean contains(E element) {
        return deque.contains(element);
    }

    @Override
    public boolean containsAll(Collection collection) {
        return deque.containsAll(collection);
    }

    @Override
    public boolean isEmpty() {
        return deque.isEmpty();
    }

    @Override
    public String toString() {
        return "WaitList{" +
                "deque=" + deque +
                '}';
    }
}
