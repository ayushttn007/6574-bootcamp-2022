import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.*;

// Question 4: WAP to show usage of Callable and demonstrate how it is different from Runnable.

class ThreadClassRunnable implements Runnable
{
    @Override
    public void run() {
        System.out.println("Thread is running");
    }
}
class ThreadClassCallable implements Callable<String>
{
    @Override
    public String call() throws Exception {
        Thread.sleep(500);
        return Thread.currentThread().getName();
    }
}
public class Main {
    public static void main(String[] args) {

        ExecutorService executor= Executors.newFixedThreadPool(5);

        Callable<String> callable=new ThreadClassCallable();

        List<Future<String>> list=new ArrayList<Future<String>>();
        for(int i=0;i<10;i++)
        {

            Future<String> store=executor.submit(callable);
            list.add(store);
        }

        for(Future<String> i:list)
        {
            try {

                System.out.println(new Date()+"::"+i.get());
            }catch (InterruptedException |ExecutionException e)
            {
                e.printStackTrace();
            }

            executor.shutdown();
        }
        ThreadClassRunnable threadRunnable=new ThreadClassRunnable();
        Thread thread=new Thread(threadRunnable);
        thread.setName("Thread One");
        thread.start();
    }
}