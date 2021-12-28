class Sr extends Thread
{
    public void run()
    {
        for(int i=0;i<=20;i++)
        {
            System.out.println("B-" + getName()+"=:"+i);
        }
    }

}
public class SusRes {
    public static void main(String arg[])
    {
        Sr s1=new  Sr();
        Sr s2=new  Sr();
        Sr s3=new  Sr();
        Sr s4=new  Sr();

        s1.start();
        s2.start();
        s3.start();
        s4.start();
        try
        {
            System.out.println("thread is suspending");
            s1.suspend();
            Thread.sleep(2000);
            System.out.println("thread is resuming");
            s1.resume();
        }catch (Exception e)
        {
            System.out.println(e);
        }


    }
}
