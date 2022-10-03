import java.util.Comparator;

public class Employee2 {

    String name;
    double age;
    double salary;


    public Employee2(String name, double age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    }

class Sal_Compartor implements Comparator<Employee2> {
    @Override
    public int compare(Employee2 e1, Employee2 e2) {
        return -(int) (e1.salary - e2.salary);
    }
}
