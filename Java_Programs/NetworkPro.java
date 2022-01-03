import java.net.UnknownHostException;
import java.net.InetAddress;

public class NetworkPro {

    public static void main(String arg[])throws UnknownHostException
    {
        InetAddress ob=InetAddress.getLocalHost();
        System.out.println(ob);
        System.out.println(ob.getHostAddress());
        System.out.println(ob.getByName("www.google.com"));
        System.out.println(ob.getLoopbackAddress());

    }
}
