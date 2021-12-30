


class Thread4 implements Runnable
{
     public void run()
     {
          System.out.println("Hello"+Thread.currentThread().getName());
     }
}

public class ThreadGActG {
     public static void main(String arg[]) {
          ThreadGroup tg = new ThreadGroup("javagrp");
          System.out.println(tg);
          Thread4 t1 = new Thread4();
          Thread tr1 = new Thread(tg, t1, "one");
          Thread tr2 = new Thread(tg, t1, "two");
          Thread tr3 = new Thread(tg, t1, "three");
          tr1.start();
          tr2.start();
          tr3.start();
          System.out.println(tr1);
          System.out.println(tr2);
          System.out.println(tr3);
          System.out.println("number of active ThreadsGroups:" + tg.activeGroupCount());//number of active threadgroups.
     }
}
