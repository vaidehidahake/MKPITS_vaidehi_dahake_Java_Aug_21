class Thr1 extends Thread
{
    public void run()
    {
        for(int i=0;i<=10;i++)
        {
            System.out.println("Thread"+i);
        }

    }
}
class Thr2 extends Thread
{
    public void run()
    {

        for (int i=0;i<=20;i++)
        {
            System.out.println("Thread" + i);
        }
    }
}
public class NormPri {
    public static void main(String arg[])
    {
        Thr1 ob=new Thr1();
        Thr2 ob1=new Thr2();
        ob.start();
        ob1.start();
        System.out.println("Default thread priority of Thread 1: " + ob.getPriority());
        System.out.println("Default thread priority of Thread 2: " + ob1.getPriority());
        ob.setPriority(ob.NORM_PRIORITY);
        ob1.setPriority(ob1.NORM_PRIORITY);
        System.out.println("\nThe NORM_PRIORITY of Thread 1 is: " + ob.getPriority());
        System.out.println("The NORM_PRIORITY  of Thread 2 is: " + ob1.getPriority());




    }
}
