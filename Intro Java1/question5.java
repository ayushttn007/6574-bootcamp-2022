package java1_exercise26sep;


import java.util.Scanner;
class Employee{
    String FirstName = "" ;
    String LastName =  "";
    int age;
    String Designation =  "";

    public  Employee(String FirstName,String LastName,int age, String Designation){
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.age = age;
        this.Designation = Designation;
    }

    void setFirstName(String fname){
        this.FirstName = fname;
    }

    void setLastName(String lname){
        this.LastName = lname;
    }

    void setAge(int age){
        this.age = age;
    }

    void setDesignation(String des){
        this.Designation = des;
    }
    @Override
    public  String toString(){
        return "My FirstName is " + this.FirstName + " and Last Name is " + this.LastName + " I am " + this.age + " year old" + " and I Worked as a " + this.Designation + " in TO THE NEW";
    }
}
public  class exercise_26sep {


    public static void main(String[] args){
      Employee emp = new Employee("Ayush", "Sharma", 23, "Software Engineer");
      // setfirstname
        emp.setFirstName("siddhartha");
        //Set LastName
        emp.setLastName("Sharma");
        // set age
        emp.setAge(22);
        // Set designation
        emp.setDesignation("Graphic Designer");

      System.out.println(emp.toString());
    }


}
