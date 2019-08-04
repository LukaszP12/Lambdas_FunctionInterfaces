package javabrains.InterfaceDemo;

public class Dog implements Pet {
    @Override
    public void test() {
        System.out.println("Interface Method Implemented");
    }

    public static void main(String[] args) {
        Pet p = new Dog();
        p.test();
    }

}
