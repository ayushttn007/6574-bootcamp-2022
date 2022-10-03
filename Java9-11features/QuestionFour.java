import java.util.stream.IntStream;

public class QuestionFour {

    public static void main(String[] args) {
        System.out.println("Using Iterate:");
        IntStream
                .iterate(0,i->i<=9,i->i+1)
                .forEach(System.out::println);

    }
}
/*
Using Iterate:
0
1
2
3
4
5
6
7
8
9*/