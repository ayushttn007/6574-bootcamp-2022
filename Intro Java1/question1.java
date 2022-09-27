package java1_exercise26sep;


import java.util.Scanner;
class Employee{
    static String FirstName;
    static String LastName;
    static int age;

    static {

        FirstName = "Ayush";
        LastName = "Sharma";
        age = 23;
    }

    static void getMyInfo() {
        System.out.println("Hi, My name is " + FirstName + " " + LastName + ". and I  am " + age + " years old.");
    }

}
public  class exercise_26sep {


    public static void main(String[] args){
        new Employee();
        Employee.getMyInfo();
    }


}
