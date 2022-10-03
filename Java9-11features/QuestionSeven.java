import java.util.List;
import java.util.Map;
import java.util.Set;

public class QuestionSeven {
    public static void main(String[] args) {
        System.out.print("list:");
        System.out.println(List.of(11,22,33,44,55,66,88,99,110));
        System.out.print("set:");
        System.out.println(Set.of(11,22,33,44,55,66,88,99,110));
        System.out.print("map:");
        System.out.println(Map.of(10,20,30,40,50,60));
    }
}
/*list:[11, 22, 33, 44, 55, 66, 88, 99, 110]
set:[33, 88, 55, 110, 22, 44, 99, 11, 66]
map:{30=40, 50=60, 10=20}
*/