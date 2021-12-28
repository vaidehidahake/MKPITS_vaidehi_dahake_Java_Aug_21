class Del extends Thread
{
    public void run()
    {
        for(int i=0;i<=10;i++) {
            System.out.println("B-" + getName()+"=:"+i);
        }
    }

}

public class DelayJ {
    public static void main(String arg[])
    {
        Del s1=new Del();
        Del s2=new Del();
        Del s3=new Del();
        Del s4=new Del();

        s1.start();
        s2.start();
        s3.start();
        s4.start();
        try
        {
            s1.sleep(2000);

        }catch (Exception e)
        {
            System.out.println(e);
        }


    }
}
