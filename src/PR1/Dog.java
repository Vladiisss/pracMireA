package PR1;

public class Dog {

    private int age;
    private int weight;
    private char sex;
    private String color;
    private String name;


    public Dog(char sex, String color, String name) {
        this.sex = sex;
        this.color = color;
        this.name = name;
    }

    {
        age = 0;
        weight = 1;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }

    public char getSex() {
        return sex;
    }

    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return age + " " + weight + " " + sex + " " + color + " " + name;
    }

}
