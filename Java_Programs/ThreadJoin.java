class Sr1 extends Thread
{
    public void run()
    {
        for(int i=0;i<=20;i++) {
            System.out.println("B-" + getName()+"=:"+i);
        }
    }

}

public class ThreadJoin {
    public static void main(String arg[])
    {
        Sr1 s1=new  Sr1();
        Sr1 s2=new  Sr1();
       // Sr1 s3=new  Sr1();
        Sr1 s4=new Sr1();

        s1.start();
        s2.start();
        //s3.start();
        s4.start();
        System.out.println(s2.getName()+""+s2.isAlive());
        try
        {
            s2.join();
            System.out.println(s2.getName()+""+s2.isAlive());

        }catch (Exception e)
        {
            System.out.println(e);
        }


    }
}
