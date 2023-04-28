public class StaticClass {

    static void myMethod() {
        System.out.println("I'm printing from the myMethod.");
    }
    public static void main(String[] args) {
        System.out.println("Printing from the main method.");
        myMethod();
    }

    //This will execute automatically when the class is loaded
    //this is known as a static block
    static {
        System.out.println("Printing from the static block");
    }
}