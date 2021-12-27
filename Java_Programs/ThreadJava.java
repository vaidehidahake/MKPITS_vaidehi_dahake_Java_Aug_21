 class Th1 extends Thread
{
    public void run()
    {
        for(int i=0;i<=10;i++)
    {
        System.out.println("Thread"+i);
    }

    }
}
class Th2 extends Thread
{
    public void run()
    {

        for (int i=0;i<=20;i++)
        {
            System.out.println("Thread" + i);
        }
    }
}



 class ThreadJava
{
    public static void main(String arg[])
    {
        Th1 ob=new Th1();
        Th2 ob1=new Th2();
        ob.start();
        ob1.start();



    }
}
