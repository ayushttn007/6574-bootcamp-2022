
@FunctionalInterface
interface StringConcatenate {
    String concatStrings(String stringOne, String stringTwo);
}

public class ConcatenateString {
    public static void main(String[] args) {
        StringConcatenate StringConcatenate = (str1, str2) -> str1.concat(str2);

        System.out.println("concatenate String : " + StringConcatenate.concatStrings("Ayush Sharma", "-6574"));
    }
}
