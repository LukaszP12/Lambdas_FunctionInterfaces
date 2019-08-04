package javabrains.InterfaceDemo;

// The reasons why default methods were introduced in the Java 8 release in pretty obvious
/*In a typical design based on abstractions, where an interface has one or multiple implementations,
if one or more methods are added to the interface, all the implementations will be forced to implement them too.
Otherwise, the design will just break down.
 */
/*
Default interface methods are an efficient way to deal with this issue.
They allow us to add new methods to an interface that are automatically available in the implementations.
Thus, there’s no need to modify the implementing classes.
 */


public interface Vehicle {

    String getBrand();

    double getSpeed();

    String speedUp();

    String slowDown();

    default String turnAlarmOn() {return "Turning the vehicle alarm on.";}

    default String turnAlarmOff() {return "Turning the vehicle alarm off. ";}

    default double getSpeedInKMH(double speed){
        return speed;
    }

}