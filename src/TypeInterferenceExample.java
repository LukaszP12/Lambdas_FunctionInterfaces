public class TypeInterferenceExample {

    public static void main(String[] args) {
        StringLengthLambda myLambda = (String s) -> s.length();
        System.out.println(myLambda.getLength("Hello Lambda"));

        printLambda(s -> s.length());
    }

    interface StringLengthLambda{
        int getLength(String s);
    }

    // Lambda expressions make the syntax a little bit shorter
    // The compiler has information about the action

    public static void printLambda(StringLengthLambda l){
        System.out.println(l.getLength("Hello Lambda"));
    }



}
