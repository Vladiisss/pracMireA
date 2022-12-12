package PR16;

public final class Drink implements Item {

    private int price = -1;
    private String name, description;

    public Drink(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public Drink(int price, String name, String description) {
        this.price = price;
        this.name = name;
        this.description = description;
    }

    @Override
    public int getPrice() {
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

}
