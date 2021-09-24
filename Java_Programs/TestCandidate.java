//default constructor
class Candidate
{
  int cno;
  String cname;
  String city;
  
  public Candidate()
  {
     cno=111;
     cname="vishakha";
     city="nagpur";
   }
   
}

class TestCandidate
{
  public static void main(String args[])
  {
     Candidate c1=new Candidate();
     System.out.println("candidate number is : "+c1.cno);
      System.out.println("candidate name is : "+c1.cname);
       System.out.println("candidate city is : "+c1.city);
   }
   
}   
     
  