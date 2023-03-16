class CovariantClass {
    CovariantClass display() {
        System.out.println("Hello from the Base class.");
        return this;
    }
    
}

class DerivedClass extends CovariantClass {
    DerivedClass display() {
        System.out.println("Hello from the Derived Class.");
        return this;
    }
    public static void main(String[] args) {
        DerivedClass obj = new DerivedClass();
        obj.display();
    }
}

