class ThreadClass extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println(Thread.currentThread() + " is working");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }


        }
    }
}
// Create thread using Runnable Interface
class ThreadClassRunnable implements Runnable {
    @Override
    public void run() {
        for(int i=0;i<3;i++){
            System.out.println(Thread.currentThread()+" is Working");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }



    }
}
public class Main {
    public static void main(String[] args) {
        ThreadClass threadOne =new ThreadClass();
        ThreadClass threadTwo =new ThreadClass();

        threadOne.start();

        try {
            threadOne.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        threadTwo.start();

        // Using Runnable Interface
        ThreadClassRunnable threadRunnable = new ThreadClassRunnable();
        Thread threadOne = new Thread(threadRunnable);
        Thread threadTwo = new Thread(threadRunnable);
        Thread threadThree = new Thread(threadRunnable);
        threadOne.start();

        try {
            threadOne.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        threadTwo.start();
        try {
            threadTwo.join();

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        threadThree.start();
    }
}