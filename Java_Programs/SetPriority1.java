class SetPri extends Thread
{
    public void run()
    {
        System.out.println("Hello Java"+""+getName());
    }


}

public class SetPriority1 {
    public static void main(String arg[])
    {
        SetPri s1=new  SetPri();
        SetPri s2=new SetPri();
        s1.start();
        s1.setPriority(8);
        s2.setPriority(4);
        System.out.println(s1);
        System.out.println(s2);


    }
}
