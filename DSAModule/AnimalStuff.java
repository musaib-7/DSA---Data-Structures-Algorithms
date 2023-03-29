public interface AnimalStuff {
    
    //by default fields are 'public static final'
    int age = 10;

    //by deafault methods are 'public abstract'
    public abstract void poop();
    public abstract void eat();

    default void display() {
        System.out.println("Printing the default display");
    }
}