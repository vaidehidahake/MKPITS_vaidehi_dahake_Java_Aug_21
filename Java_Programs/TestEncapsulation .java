class Account6
{
    //private data members
    private long acc_no;
    private String name,email;
    private float amount;
    //public getter and setter methods
    public long getAcc_no()
    {
        return acc_no;
    }
    public void setAcc_no(long acc_no)
    {
        this.acc_no = acc_no;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public String getEmail()
    {
        return email;
    }
    public void setEmail(String email)
    {
        this.email = email;
    }
    public float getAmount()
    {
        return amount;
    }
    public void setAmount(float amount)
    {
        this.amount = amount;
    }

    }



   public class Test5
   {
    public static void main(String[] args)
    {
        //creating instance of Account class
        Account6 acc=new Account6();
        //setting values through setter methods
        acc.setAcc_no(46577848489L);
        acc.setName("ramesh kumar");
        acc.setEmail("ramesh@gmail.com");
        acc.setAmount(600000f);
        //getting values through getter methods
        System.out.println(acc.getAcc_no());
        System.out.println( acc.getName());
        System.out.println(acc.getEmail());
        System.out.println(acc.getAmount());
    }
    }


