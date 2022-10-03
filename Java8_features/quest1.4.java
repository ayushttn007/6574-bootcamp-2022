
@FunctionalInterface
interface StringUppercase {
    String stringToUpperCase(String Str);
}

public class Stringuppercase {
    public static void main(String[] args) {
        StringUppercase strUppercase = Str -> Str.toUpperCase();

        System.out.println("ayush sharma in upper case: " + strUppercase.stringToUpperCase("ayush sharma"));
    }
}
