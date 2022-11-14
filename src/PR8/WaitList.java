package PR8;

import java.net.SocketOptions;
import java.util.Collection;
import java.util.Deque;
import java.util.concurrent.ConcurrentLinkedDeque;

public class WaitList<E> implements IWaitList<E> {

    protected Deque<E> deque = new ConcurrentLinkedDeque<>();


    public WaitList() {}

    public WaitList(Collection<E> c) {
        deque.addAll(c);
    }

    @Override
    public void add(E element) {
        deque.add(element);
    }

    @Override
    public E remove() {
        return deque.remove();
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
