class QuestionThird {
     Integer counter = 0;

     void incrementCounter() {
        this.counter++;
    }
}
    public class Main {
        public static void main(String[] args) throws InterruptedException {
            QuestionThird SynchronizedMethod = new QuestionThird();
            Object lock = new Object();
            Thread threadOne = new Thread(() -> {
                for (int i = 0; i < 100; i++) {
                    synchronized (lock) {
                        SynchronizedMethod.incrementCounter();
                    }
                }
            }, "IncrementThread");
            Thread threadTwo = new Thread(() -> {
                for (int i = 0; i < 100; i++) {
                    synchronized (lock) {
                        SynchronizedMethod.incrementCounter();
                    }
                }
            }, "IncrementThread");
            threadOne.start();
            threadTwo.start();
            threadOne.join();
            threadTwo.join();
            Thread.sleep(1000);
            System.out.println(SynchronizedMethod.counter);
        }
    }
