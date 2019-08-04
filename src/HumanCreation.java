import java.util.function.BiFunction;

public class HumanCreation {

/*    @FunctionalInterface
    public interface BiFunction<T,U,R>;
    //Represents a function that accepts two arguments and produces a result. */

    public static void main(String args[]){
        BiFunction<Integer,String, Human> humanConstructor = Human::new;
        Human human = humanConstructor.apply(25,"Lukasz");
        System.out.println(human.getAge());
        System.out.println(human.getName());
    }

}
