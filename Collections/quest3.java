import java.util.*;

class specialStack
{
    Stack<Integer> s;
    Integer min;

    specialStack() { s = new Stack<Integer>();
    }

    void getMin() {

        if (s.isEmpty())
            System.out.println("stack is empty");

        else
            System.out.println("Minimum Element  "  + min);
    }

    void peek() { if (s.isEmpty()) {
        System.out.println("stack is empty "); return;
    }

        Integer t = s.peek();

        System.out.print("Top Most Element is: ");

        if (t < min)
            System.out.println(min); else
            System.out.println(t);
    }

    void pop() { if (s.isEmpty()) {
        System.out.println("Stack is empty");
        return;
    }

        System.out.print("Top Most Element Removed: ");
        Integer t = s.pop();


        if (t < min) {
            System.out.println(min); min = 2 * min - t;
        }

        else
            System.out.println(t);
    }

    void push(Integer x) { if (s.isEmpty()) { min = x;
        s.push(x);
        System.out.println("Number Inserted: " + x); return;
    }


        if (x < min) {
            s.push(2 * x - min); min = x;
        }

        else
            s.push(x);

        System.out.println("Element Inserted: " + x);
    }
};

// Write this in  main method class in sperate file
/*public class Main {
    public static void main(String[] args) { specialStack s = new specialStack();
    s.push(8);
    s.push(10);
    s.getMin();
    s.push(3);
    s.push(5);
    s.getMin();
    s.pop();
    s.getMin();
    s.pop();
    s.peek();
}
}*/
