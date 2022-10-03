
@FunctionalInterface
interface incrementOne {
    int add(int number);
}

public class IncrementNumber {
    public static void main(String[] args) {
        incrementOne incrementOne = number -> number + 1;

        System.out.println("Number is incremented by one: " + incrementOne.add(99));
    }

}
