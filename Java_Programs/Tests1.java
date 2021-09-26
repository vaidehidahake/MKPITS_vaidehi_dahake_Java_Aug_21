    public class Student9
    {
    //private data member
    private String college;
    //getter method for college
    public void setCollege(String college)
    {
    this.college=college;
    }
    }

   public class Tests1
    {
		public static void main(String args[])
		{
			Student9 s=new Student9();
			System.out.println(s.getCollege());//c.t.e
			System.out.println(s.college);//c.t.e
    	}
    }
