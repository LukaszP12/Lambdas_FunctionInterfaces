package javabrains.Generics;

public class Guest {
    Glass g = new Glass();
    Juice juice = new Juice();
    g.liquid = juice;

    // retrieve
    Juice j = (Juice) j.liquid; // it gives us an object reference, so we need to cast it

}
