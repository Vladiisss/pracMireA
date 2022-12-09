package PR8;

public class UnfairWaitList<E> extends WaitList<E> {

    public UnfairWaitList() {
    }

    public void remove(E element) {
        deque.remove(element);
    }

    public void moveToBack(E element) {
        deque.remove(element);
        deque.add(element);
    }
}
