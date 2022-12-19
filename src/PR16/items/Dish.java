package PR16.items;

public final class Dish implements Item {

    private final double price;
    private final String name;
    private final String description;

    public Dish(String name, String description) {
        this.price = 0;
        this.name = name;
        this.description = description;
    }

    public Dish(double price, String name, String description) {
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

