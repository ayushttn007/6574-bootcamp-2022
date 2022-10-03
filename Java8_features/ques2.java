@FunctionalInterface
interface display {
    int displayIntegers(int numberOne, int numberTwo);
}

public class ques2 {
    int add(int elementOne, int elementTwo) {
        return elementOne + elementTwo;
    }
     int multiply(int elementOne, int elementTwo) {
        return elementOne * elementTwo;
    }
    int subtract(int elementOne, int elementTwo) {
        return elementOne - elementTwo;
    }

    public static void main(String[] args) {
        display demoquesadd = new ques2()::add;
        System.out.println("Adding: " + demoquesadd.displayIntegers(20, 1));
        display demoquesMul = new ques2()::multiply;
        System.out.println("Multiplying: " + demoquesMul.displayIntegers(60, 55));
        display demoquesSub = new ques2()::subtract;
        System.out.println("Subtract: " + demoquesSub.displayIntegers(99, 9));

    }
}