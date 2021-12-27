class Act extends Thread
{
    public void run() {
        for(int i=0;i<4;i++)
        {
            System.out.println("Thread" + "" + i + "" + getName());
        }
    }
}
class Acti extends Thread
{
    public void run()
    {
        System.out.println("Number of Threads Active"+""+getName()+""+activeCount());//count no.of threads active.
    }
}
public class ThreadAct {
    public static void main(String arg[])
    {
        Act a1=new Act();
        Acti a2=new Acti();
        a1.start();
        a2.start();

    }



}
