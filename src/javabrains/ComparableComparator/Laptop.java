package javabrains.ComparableComparator;

public class Laptop implements Comparable<Laptop> {
    private String brand;
    private int ram;
    private int price;

    public Laptop(String brand, int ram, int price) {
        this.brand = brand;
        this.ram = ram;
        this.price = price;
    }

    @Override
    public int compareTo(Laptop laptop2) {

        // this > lap2 = +
        // this < lap2 = -
        // this == lap2 = 0

        if(this.getRam() > laptop2.getRam())
            return 1;  // if we want the value to be higher (later), we should assign a 1 to it
        else if (this.getRam() < laptop2.getRam())
            return -1; // if we want the value to be lower (sooner), we should assign a -1 to it
        else
            return 0; // if they are equal, we should assign a 0
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "brand='" + brand + '\'' +
                ", ram=" + ram +
                ", price=" + price +
                '}';
    }
}