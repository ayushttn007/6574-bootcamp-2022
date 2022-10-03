public class Employee {

    public  String name;
    public  int age;
    public  String Designation;
    long Salary;

    public Employee(String name, int age , String Designation , long salary) {
        this.Designation = Designation;
        this.name = name;
        this.age = age;
        this.Salary = salary;
    }

    @Override
    public  String toString(){
        return "Name-"+ this.name+ " Designation-"  +this.Designation + " " +" Age-"+ this.age;
    }
}
