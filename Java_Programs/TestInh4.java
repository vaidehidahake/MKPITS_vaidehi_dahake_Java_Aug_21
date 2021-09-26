//assignment-create a person class and then create a child class customer having fields custno,gstno.
class Person
{
   String name;
   String address;

void insertPersondata(String name,String address)
{
   this.name=name;
   this.address=address;
}

void displayPersondata()
{
 System.out.println("name ="+name);
 System.out.println("address ="+address);
}
}
class Customer extends Person
{
   int custno;
   int gstno;

   void insertCustomerdata(int custno,int gstno)
   {
      this.custno=custno;
      this.gstno=gstno;
   }

   void displayCustomerdata()
   {
    System.out.println("custno="+custno);
    System.out.println("gstno ="+gstno);
   }
}

class TestInh4
{
public static void main(String args[])
{
   Customer c1=new Customer();
     c1.insertPersondata("ram","nagpur");
     c1.insertCustomerdata(121,465);
     c1.displayPersondata();
    c1.displayCustomerdata();
 }
 }






