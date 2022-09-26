package PR1;

public class TestDog {

    public static void main(String[] args) {

        Dog obj = new Dog('M', "Black", "Charly");
        System.out.println(obj.toString());
        obj.setAge(7);
        obj.setWeight(20);
        System.out.println(obj.toString());
    }
}
