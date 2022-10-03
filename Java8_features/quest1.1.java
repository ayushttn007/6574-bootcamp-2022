@FunctionalInterface
interface greaterNumber {
    boolean isNumberGreater(int firstNumber, int secondNumber);
}

public class FirstGreater {
    public static void main(String[] args) {
        greaterNumber greaterNumber = (firstNumber, secondNumber) -> {
            if (firstNumber > secondNumber)
                return true;
            else return false;
        };

        System.out.println("Is First Number greater? :" + greaterNumber.isNumberGreater(10, 45));
        System.out.println("Is First Number greater? : " + greaterNumber.isNumberGreater(95, 75));
        System.out.println("Is First Number greater? :" + greaterNumber.isNumberGreater(-10, 45));
        System.out.println("Is First Number greater? :" + greaterNumber.isNumberGreater(195, 75));
    }

}
