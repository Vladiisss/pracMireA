package PR11;

public abstract class AbstractMyQueue<E> implements MyQueue<E> {
    protected int iHead;
    protected int size;
    protected int capacity;
    protected static final int DEFAULT_CAPACITY = 10;
}
