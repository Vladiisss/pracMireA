package PR11;

public class ArrayQueueFactory {

    private ArrayQueueFactory() {}

    public static ArrayQueueModule<Integer> getInstance(Integer e) {
        return new ArrayQueueModule<Integer>();
    }

    public static ArrayQueueModule<Double> getInstance(Double e) {
        return new ArrayQueueModule<Double>();
    }

    public static ArrayQueueModule<String> getInstance(String e) {
        return new ArrayQueueModule<String>();
    }
}
