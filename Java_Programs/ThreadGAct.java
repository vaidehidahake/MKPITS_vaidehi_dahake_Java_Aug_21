class ThreadGro implements Runnable
{
    public void run()
    {
        System.out.println("Hello"+Thread.currentThread().getName());
    }
}
public class ThreadGAct {
    public static void main(String arg[]) {
        ThreadGroup tg = new ThreadGroup("javagrp");
        System.out.println(tg);
        ThreadGro t1=new ThreadGro();
        Thread tr1=new Thread(tg,t1,"one");
        Thread tr2=new Thread(tg,t1,"two");
        Thread tr3=new Thread(tg,t1,"three");
        tr1.start();
        tr2.start();
        tr3.start();
        System.out.println(tr1);
        System.out.println(tr2);
        System.out.println(tr3);
        System.out.println("number of active threads:"+tg.activeCount());//number of active threads.

    }
}
