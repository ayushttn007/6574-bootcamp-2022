
import java.util.stream.IntStream;

public class QuestionThree {
    public static void main(String[] args) {
        System.out.println("Without rangeClosed");
        IntStream.range(90,100).forEach(System.out::println);
        System.out.println("With rangeClosed");
        IntStream.rangeClosed(90,100).forEach(System.out::println);

    }
}
/*Without rangeClosed
90
91
92
93
94
95
96
97
98
99
With rangeClosed
90
91
92
93
94
95
96
97
98
99
100
*/