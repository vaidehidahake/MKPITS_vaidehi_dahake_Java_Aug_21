class Thri1 extends Thread
{
    public void run()
    {

        for(int i=0;i<=10;i++)
        {
           if(getName().equals("Thread-5"))
            {
                System.out.println("hello");
            }

            System.out.println("Thread"+getName());

        }

    }
}

public class Thread3 {
    public static void main(String arg[]) {
        Thri1 t1 = new Thri1();
        Thri1 t2 = new Thri1();
        Thri1 t3 = new Thri1();
        Thri1 t4 = new Thri1();
        Thri1 t5 = new Thri1();
        Thri1 t6 = new Thri1();
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
    }

    }
