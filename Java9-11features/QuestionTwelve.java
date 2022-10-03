sealed class ClassA permits ClassB , ClassC {
    int ClassValue()
    {
        return 0;
    }
}

final class ClassB extends ClassA{
    public int ClassValue()
    {
        return 4;
    }
}
sealed class ClassC extends ClassA permits ClassD{
    public int ClassValue()
    {
        return 2;
    }
}

non-sealed class ClassD extends ClassC{
    public int ClassValue()
    {
        return 1;
    }
}


public class QuestionTwelve {

    public static void main(String[] args) {
        ClassD Dclass =new ClassD();
        ClassC Cclass=new ClassC();
        ClassB Bclass =new ClassB();
        System.out.println("Class B Value: "+Bclass.ClassValue());
        System.out.println("Class C Value: "+Cclass.ClassValue());
        System.out.println("Class D Value: "+Dclass.ClassValue());
    }

}
/*Class B Value: 4
Class C Value: 2
Class D Value: 1*/