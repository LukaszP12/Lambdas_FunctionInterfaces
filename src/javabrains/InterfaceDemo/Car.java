package javabrains.InterfaceDemo;

public class Car implements Vehicle {

    private String brand;
    private double Speed;

    public Car(String brand) {
    }

    @Override
    public double getSpeed() {
        return Speed;
    }

    @Override
    public String getBrand() {
        return brand;
    }

    @Override
    public String speedUp() {
        return "The car is speeding up";
    }

    @Override
    public String slowDown() {
        return "The car is speeding up";
    }

}