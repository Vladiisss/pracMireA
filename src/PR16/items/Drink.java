package PR16.items;

public final class Drink implements Item {

    private final double price;
    private final String name;
    private final String description;

    public Drink(String name, String description) {
        this.price = 0;
        this.name = name;
        this.description = description;
    }

    public Drink(double price, String name, String description) {
        this.price = price;
        this.name = name;
        this.description = description;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return name + " - " + price + " rub. Описание: " + description;
    }
}
