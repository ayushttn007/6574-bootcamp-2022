class Resource1 implements AutoCloseable{
    public Resource1() {
        System.out.println("Resource1 created");
    }

    public void display() {
        System.out.println("Resource1 displayed");
    }

    @Override
    public void close() throws Exception {
        System.out.println("Resource1 close method invoked");
    }
}


class Resource2 implements AutoCloseable{
    public Resource2() {
        System.out.println("Resource2 created");
    }

    public void display() {
        System.out.println("Resource2 displayed");
    }

    @Override
    public void close() throws Exception {
        System.out.println("Resource2 close method invoked");
    }
}
public class QuestionEight {

    public static void main(String[] args) throws Exception {
        Resource1 resource1 = new Resource1();
        Resource2 resource2 = new Resource2();
        try(resource1;resource2){
            resource1.display();
            resource2.display();
        }catch (Exception ex){

        }
    }
}