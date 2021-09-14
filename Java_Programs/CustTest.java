//create a class customer having custid,custname,custaddress,mobno,email.
class Customers
{
 int custId;
 String custName;
 String custAddress;
 long mobNo;
 String email;
 }


 class CustTest
 {
  public static void main(String[] args)
  {
 Customers c1=new Customers();
  c1.custId=111;
  c1.custName="esha";
  c1.custAddress="sita sankul";
  c1.mobNo=3444436891l;
  c1.email="abc@gmail.com";
  System.out.println("custId="+c1.custId);
  System.out.println("custName="+c1.custName);
  System.out.println("custAddress="+c1.custAddress);
  System.out.println("mobNo="+c1.mobNo);
  System.out.println("email="+c1.email);

  Customers c2=new Customers();
    c2.custId=123;
    c2.custName="harshal";
    c2.custAddress="siya sankul";
    c2.mobNo=4763663637l;
    c2.email="abc1@gmail.com";
    System.out.println("custId="+c2.custId);
    System.out.println("custName="+c2.custName);
    System.out.println("custAddress="+c2.custAddress);
    System.out.println("mobNo="+c2.mobNo);
  System.out.println("email="+c2.email);

 }

 }