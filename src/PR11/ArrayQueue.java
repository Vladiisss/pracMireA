package PR11;


public class ArrayQueue<E> {

    private ArrayQueueModule<E> queue;

    public ArrayQueue() {
        this.queue = new ArrayQueueModule<E>().getInstance();
    }

    public void enqueue(E e) {
        queue.offer(e);
    }

    public E element() {
        return queue.element();
    }

    public E dequeue() {
        return queue.poll();
    }

    public int size() {
        return queue.getSize();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public void clear() {
        queue.clear();
    }
}

