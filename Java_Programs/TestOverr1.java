//Consider a scenario where Bank is a class that provides functionality to get the rate of interest. 
//However, the rate of interest varies according to banks.
//For example, SBI, ICICI and AXIS banks could provide 8%, 7%, and 9% rate of interest.
class Bank
{
  int getRateOfInterest()
  {
    return 0;
  }
}

class Sbi extends Bank
{
  int getRateOfInterest()
  {
    return 8;
  }
}

class Icici extends Bank
{
  int getRateOfInterest()
  {
    return 7;
  }
}

class Axis extends Bank
{
  int getRateOfInterest()
  {
    return 9;
  }
}

class TestOverr1
{
  public static void main(String args[])
  {
     Sbi s=new Sbi();
     Icici i=new Icici();
     Axis  a=new Axis();
 System.out.println("rate of interest of Sbi:"+s.getRateOfInterest());
 System.out.println("rate of interest of Icici:"+i.getRateOfInterest());
 System.out.println("rate of interest of Axis:"+a.getRateOfInterest());
 

   }
}   