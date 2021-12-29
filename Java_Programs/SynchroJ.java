class Rj
{
   synchronized void dis(String s)
    {
        System.out.println(" [ "+s);
        try
        {
            Thread.sleep(2000);
        }catch (Exception e)
        {

        }
        System.out.println(" ] ");
    }
}
class Ti1 implements Runnable
{
    Thread t;
    String st;
    Rj rc;

    Ti1(Rj r,String sr)
    {
        rc=r;
        st=sr;
        t=new Thread(this);
        t.start();

    }

    @Override
    public void run() {

        rc.dis(st);




    }


}
public class SynchroJ {
    public static void main(String arg[])
    {
        Rj oc=new Rj();


        Ti1 ob1=new Ti1(oc,"sri");
        Ti1 ob2=new Ti1(oc,"rama");
        Ti1 ob3=new Ti1(oc,"yana");
    }
}
