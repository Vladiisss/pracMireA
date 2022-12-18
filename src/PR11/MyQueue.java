package PR11;

public interface MyQueue<E> {

    /**
     * Возвращает, но не удаляет, элемент из начала очереди.
     * <p>Если очередь пуста, генерирует исключение NoSuchElementException
     */
    E element();

    /**
     * Добавляет элемент obj в конец очереди.
     * <p>Если элемент удачно добавлен, возвращает true, иначе - false
     */
    boolean offer(E e);

    /**
     * Возвращает без удаления элемент из начала очереди.
     * <p>Если очередь пуста, возвращает значение null
     */
    E peek();

    /**
     * Возвращает с удалением элемент из начала очереди.
     * <p>Если очередь пуста, возвращает значение null
     */
    E poll();

    /**
     * Возвращает с удалением элемент из начала очереди.
     * <p>Если очередь пуста, генерирует исключение NoSuchElementException
     */
    E remove();
}
