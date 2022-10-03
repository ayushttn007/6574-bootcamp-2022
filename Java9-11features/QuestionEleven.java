import java.util.Objects;

record Student(String name, int id, int age)
{
    static int counter=0;
    static void IncrementOfCounter()
    {
        counter++;
    }
    Student{
        Objects.requireNonNull(name);
        Objects.requireNonNull(id);
        Objects.requireNonNull(age);
        IncrementOfCounter();
    }
}
public class QuestionEleven {
    public static void main(String[] args) {
        Student s1=new Student("Ayush",6574,23);
        Student s2=new Student("shubham",2274,25);
        System.out.println(s1);
        System.out.println(s2);
        System.out.print("are StudentOne & StudentTwo identical:");
        System.out.println(s1.equals(s2));
        System.out.print("Total Number of students: ");
        System.out.println(Student.counter);
    }
}
/*Student[name=Ayush, id=6574, age=23]
Student[name=shubham, id=2274, age=25]
are StudentOne & StudentTwo identical:false
Total Number of students: 2*/