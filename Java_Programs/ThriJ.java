class TJ  implements Runnable
{
    Thread t1,t2;
    TJ()
    {
        t1=new Thread(this);
        t1.start();
        t2=new Thread(this);
        t2.start();

    }
    public void run()
    {
        for(int i=0;i<=10;i++) {
            if (i % 2 == 0) {
                System.out.println("even" +i+":"+ t1.getName());
            }
           else
            {
                System.out.println("odd"+i+":"+t2.getName());
            }
        }
    }


}

public class ThriJ {
    public static void main(String arg[])
    {
        TJ ob1=new  TJ();
        TJ ob2=new  TJ();

    }

}

