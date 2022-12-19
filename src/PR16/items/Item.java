package PR16.items;

public interface Item {

    double getPrice();

    String getName();

    String getDescription();

    @Override
    String toString();
}
