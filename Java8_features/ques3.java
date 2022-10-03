public class ques3 {
    public static void main(String args[]) {
        Runnable thread = () -> {
            System.out.println("Thread Created...");
        };
        Thread threads = new Thread(thread);
        threads.start();
    }
}