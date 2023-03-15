class CovariantClass {
    Object display() {
        System.out.println("Hello from the Base class.");
    }
}

class DerivedClass extends CovariantClass {
    String display() {
        System.out.println("Hello from the Derived Class.");
    }
    public static void main(String[] args) {
        DerivedClass obj = new DerivedClass();
        obj.display("Hello");
    }
}

