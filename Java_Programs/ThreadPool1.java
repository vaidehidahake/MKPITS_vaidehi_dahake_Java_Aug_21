import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class TH5 extends Thread
{
    public void serviceRequest()
    {
        try {
            Thread.sleep(1000);
        }catch (Exception e)
        {
            System.out.println(e);
        }
    }
    public void run() {
        serviceRequest();
        System.out.println(getName() + "thread start working");
        System.out.println(getName() + "thread work done");


    }
}

public class ThreadPool1 {
    public static void main(String arg[]) {
        TH5 t1 = new TH5();
        TH5 t2 = new TH5();
        TH5 t3 = new TH5();

        //t1.setDaemon(true);
        t1.start();

        t2.start();
        t3.start();
        ExecutorService ex1 = Executors.newFixedThreadPool(3);
        ex1.execute(t1);
        ex1.execute(t2);
        ex1.execute(t3);
        ex1.shutdown();
        while (!ex1.isTerminated()) {
        }
        System.out.println("All Threads work is finished");
    }

}