//create a class customer having custid,custname,custaddress,mobno,email.
class Custom
{
 int custId;
 String custName;
 String custAddress;
 long mobNo;
 String email;

 void insertRecord(int r, String n, String a, long m, String e)
 {
  custId=r;
  custName=n;
  custAddress=a;
  mobNo=m;
  email=e;
 }

 void displayInformation()
 {
 System.out.println(custId+" "+custName+" "+custAddress+" "+mobNo+" "+email);

 }

}


 class CustoTest
 {
  public static void main(String[] args)
  {
 Custom c1=new Custom();
 Custom c2=new Custom();
 Custom c3=new Custom();



  c1.insertRecord(123,"rashi","nagpur",3435553552l,"sds1@gmail.com");
  c2.insertRecord(134,"raj","indore",565654479l,"fhf2@gmail.com");
  c3.insertRecord(146,"ram","pune",346468688l,"sdfhf3@gmail.com");
  c1.displayInformation();
  c2.displayInformation();
  c3.displayInformation();
 }

 }