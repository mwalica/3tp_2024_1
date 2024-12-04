package app;

public class Vehicle {
    private String name;
    private int numberOfWheels;

    public Vehicle(String name, int numberOfWheels) {
        this.name = name;
        this.numberOfWheels = numberOfWheels;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }
}
