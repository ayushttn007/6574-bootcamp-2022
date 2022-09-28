import java.util.ArrayList;
import java.util.Iterator;

public class Main {

    static void listSum(ArrayList<Float> list){
        float result = 0;
        float val = 0.5F;
        // To add 5 float numbers
        for(int i = 0; i < 5; i++){
            val+=10;
            list.add(val);
        }

        // iterator to iterate over arraylIst
        Iterator<Float> listitr = list.iterator();

        while(listitr.hasNext()){
            result += listitr.next();
        }
        System.out.println("SUm of Number in List: " + result);
    }

    public static void main(String[] args) {

        ArrayList<Float> list = new ArrayList<Float>();
          listSum(list);

    }
}