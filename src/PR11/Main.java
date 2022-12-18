package PR11;

public class Main {

    public static void main(String[] args) {
        ArrayQueueModule<Integer> queue = new ArrayQueueModule<>(5);


        for (int i = 5; i <= 10; i++) {
            System.out.println(queue.offer(i));
        }
        System.out.println(queue);
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue);
        System.out.println(queue.remove());
        System.out.println(queue);

        System.out.println("/////////////////////");

        ArrayQueueADT<Integer> queueADT = new ArrayQueueADT<>();
        System.out.println(queueADT.isEmpty(queue));
        System.out.println(queueADT.size(queue));
        System.out.println(queueADT.dequeue(queue));
        System.out.println(queue);
        queueADT.enqueue(queue, 45);
        System.out.println(queue);

        ArrayQueue<Integer> queue2 = new ArrayQueue<>();

        System.out.println(queue2.isEmpty());
        System.out.println(queue2.size());
        System.out.println(queue2.dequeue());
        System.out.println(queue2);
        queue2.enqueue(45);
        System.out.println(queue2);

    }
}
