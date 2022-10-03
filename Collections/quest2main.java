import java.util.*;

public class Main {

    public static void main(String[] args) {


        List<Employee2> employeeList = new ArrayList<>();
        employeeList.add(new Employee2("Ayush Sharma", 23, 150000));
        employeeList.add(new Employee2("Jyoti ", 22, 20000));
        employeeList.add(new Employee2("Siddhartha", 21, 40000));
        employeeList.add(new Employee2("pushkar", 30,  60000));
        Collections.sort(employeeList, new Sal_Compartor());

        for (Employee2 e : employeeList) {
            System.out.println(e.name + " is " + e.age + "year old  and salary is " + e.salary);
        }

     /* HashMap<Employee, Long> empMap = new HashMap<>();
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
        */


    }
}