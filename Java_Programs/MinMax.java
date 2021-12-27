class Th7 extends Thread
{
    public void run()
    {
        for(int i=0;i<=10;i++)
        {
            System.out.println("Thread"+i);
        }

    }
}
class Th8 extends Thread
{
    public void run()
    {

        for (int i=0;i<=20;i++)
        {
            System.out.println("Thread" + i);
        }
    }
}
public class MinMax {
    public static void main(String arg[])
    {
        Th7 ob=new Th7();
        Th8 ob1=new Th8();
       System.out.println("Default thread priority of Thread 1: " + ob.getPriority());
       System.out.println("Default thread priority of Thread 2: " + ob1.getPriority());
      ob.setPriority(ob.MAX_PRIORITY);
        ob1.setPriority(ob1.MIN_PRIORITY);
        System.out.println("\nThe maximum thread priority of Thread 1 is: " + ob.getPriority());
        System.out.println("The minimum thread priority of Thread 2 is: " + ob1.getPriority());
        ob.start();
        ob1.start();




    }
}
