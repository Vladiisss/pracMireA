package PR10;

public class Main {

    public static void main(String[] args) {
        ConcreteFactory factory = new ConcreteFactory();
        Complex comp = factory.createComplex();
        Complex comp2 = factory.createComplex(12, 24);
        System.out.println(comp);
        System.out.println(comp2);
    }
}
