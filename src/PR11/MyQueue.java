package PR11;

public class MyQueue<E> implements Queue<E> {
    @Override
    public boolean add(E e) {
        return false;
    }

    @Override
    public E element() {
        return null;
    }

    @Override
    public boolean offer(E e) {
        return false;
    }

    @Override
    public E peek() {
        return null;
    }

    @Override
    public E poll() {
        return null;
    }

    @Override
    public E remove() {
        return null;
    }
}
