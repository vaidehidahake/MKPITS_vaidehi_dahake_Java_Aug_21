class SetPr extends Thread
{
    public void run()
    {
        System.out.println("Hello Java");
    }


}

public class SetPriority {
    public static void main(String arg[])
    {
        SetPr s1=new SetPr();
        SetPr s2=new SetPr();
        s1.start();
        s1.setPriority(8);
        s2.setPriority(4);
        System.out.println("Priority of thread s1:"+s1.getPriority());
        System.out.println("Priority of thread s2:"+s2.getPriority());


    }
}
