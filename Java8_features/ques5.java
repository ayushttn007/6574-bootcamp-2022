interface InterfaceOne {
    default void interfaceOne() {
        System.out.println("Interface one");
    }
}

interface InterfaceTwo {
    default void interfaceTwo() {
        System.out.println("Interface two ");
    }
}

public class Multipleinheritance implements InterfaceOne, InterfaceTwo {
    public void display() {
        InterfaceOne.super.interfaceOne();
        InterfaceTwo.super.interfaceTwo();
    }

    public static void main(String[] args) {
        Multipleinheritance demo = new Multipleinheritance();
        demo.display();
    }
}