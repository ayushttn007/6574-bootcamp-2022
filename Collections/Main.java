import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {

    public static void main(String[] args) {


        Employee e1 = new Employee("Ayush Sharma", 23, "Software Engineer", 50000);
        Employee e2 = new Employee("Jyoti ", 22, "Graphic Desinger", 20000);
        Employee e3 = new Employee("Shubham", 25, "Quality Engineer", 75000);
        Employee e4 = new Employee("Siddhartha", 21, "Receptionist", 40000);
        Employee e5 = new Employee("pushkar", 30, "Senior Software Engineer", 60000);
        Employee e6 = new Employee("Rahul", 22, "Software Engineer", 80000);


        HashMap<Employee, Long> empMap = new HashMap<>();
        empMap.put(e1, e1.Salary);
        empMap.put(e2, e2.Salary);
        empMap.put(e3, e3.Salary);
        empMap.put(e4, e4.Salary);
        empMap.put(e5, e5.Salary);
        empMap.put(e6, e6.Salary);

        Iterator iterator = empMap.entrySet().iterator();

        while (iterator.hasNext()) {

            Map.Entry mapElement
                    = (Map.Entry) iterator.next();


            System.out.println(mapElement.getKey() + " : "
                    + mapElement.getValue());

        }
    }
}