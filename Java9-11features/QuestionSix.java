import java.util.Arrays;
import java.util.Optional;

public class QuestionSix {

    public static void main(String[] args) {

        Optional<Integer> optionalInteger = Arrays.asList(11,12,13,14,15,16,17,18,19,20)
                .stream()
                .filter(e->e<21)
                //.filter(e->e<11)
                .findFirst()
                .or(()-> Optional.of(-1));
        System.out.println(optionalInteger.get());
    }
}
/* if e->e<21  then 11 output
   if e-> e<11 then -1  */