//create a class customer having custid,custname,custaddress,mobno,email.
class Customer
{
 int custId;
 String custName;
 String custAddress;
 long mobNo;
 String email;

 public static void main(String[] args)
 {
Customer c1=new Customer();
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

 }

 }
