import java.util.stream.IntStream;

public class QuestionFive {

    public static void main(String[] args) {
        IntStream
                .rangeClosed(10,20)
                .filter(x->x>15)
                .findFirst().ifPresentOrElse(
                        (x)-> System.out.println("Number is: "+x),
                        ()->System.out.println("Number does not exists")
                );

        IntStream
                .rangeClosed(10,15)
                .filter(e->e>20)
                .findFirst().orElseThrow();

    }
}