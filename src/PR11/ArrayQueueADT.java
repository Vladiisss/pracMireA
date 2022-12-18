package PR11;

public class ArrayQueueADT<E> {

    public void enqueue(ArrayQueueModule<E> queue, E e) {
        queue.offer(e);
    }

    public E element(ArrayQueueModule<E> queue) {
        return queue.element();
    }

    public E dequeue(ArrayQueueModule<E> queue) {
        return queue.poll();
    }

    public int size(ArrayQueueModule<E> queue) {
        return queue.getSize();
    }

    public boolean isEmpty(ArrayQueueModule<E> queue) {
        return queue.isEmpty();
    }

    public void clear(ArrayQueueModule<E> queue) {
        queue.clear();
    }
}
