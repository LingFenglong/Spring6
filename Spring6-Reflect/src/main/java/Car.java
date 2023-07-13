import java.lang.reflect.Constructor;

public class Car {
    private String name;
    private String Color;

    private Car(String name, String color) {
        this.name = name;
        Color = color;
    }

    public Car() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public static void main(String[] args) {
        for (Constructor<?> constructor : Car.class.getDeclaredConstructors()) {
            System.out.println(constructor);
        }
    }
}