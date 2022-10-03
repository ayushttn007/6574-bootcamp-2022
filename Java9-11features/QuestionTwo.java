import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class QuestionTwo {

    public static void main(String[] args) {


        System.out.println("TakeWhile");
        System.out.println(IntStream
                .rangeClosed(1,15)
                .takeWhile(x->x<=5)
                .boxed()
                .collect(Collectors.toList()));

        System.out.println("DropWhile");
        System.out.println(IntStream
                .rangeClosed(1,15)
                .dropWhile(x->x<=5)
                .boxed()
                .collect(Collectors.toList()));


    }
}
/*TakeWhile
[1, 2, 3, 4, 5]
DropWhile
[6, 7, 8, 9, 10, 11, 12, 13, 14, 15]
*/