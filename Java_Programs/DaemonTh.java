class TH4 extends Thread
{
   public void run() {
       for(int i=0;i<=10;i++){

       if (isDaemon()) {
           System.out.println(getName() + "thread is Daemon thread");
       } else {
           System.out.println(getName() + "thread is not Daemon thread");
       }
   }
   }
}

public class DaemonTh {
    public static void main(String arg[])
    {
        TH4 t1=new TH4();
        TH4 t2=new TH4();
        TH4 t3=new TH4();

        t1.setDaemon(true);
        t1.start();

        t2.start();
        t3.start();

    }
}
