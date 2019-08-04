package javabrains.unit1;

public class mainHello {

    public static void main(String[] args) {
        mainHello mainHelloObj = new mainHello();
        helloClass helloClassObj = new helloClass();
        mainHelloObj.sayHello(helloClassObj);

    }

    public void sayHello(Hello hello){
        hello.hello();
    }

}
