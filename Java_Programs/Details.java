class Details
{
  public static void main(String args[])
  {
     int testscore=76;
     char grade;
     if(testscore>=75)
     {
       grade='A';
     }
      else if(testscore>=60)
          {
            grade='B';
     }
       else if(testscore>=50)
          {
            grade='C';
     }
      else if(testscore>=45)
          {
            grade='D';
     }
     else
          {
            grade='F';
     }
     System.out.println("grade="+grade);
    }
}