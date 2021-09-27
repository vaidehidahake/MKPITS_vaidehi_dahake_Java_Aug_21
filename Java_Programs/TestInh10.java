
import  java.util.*;
class person
{
	int id;
    String name;
    String address;
     void getdata(int id,String name,String address)
    {
		this.id=id;
        this.name=name;
        this.address=address;
    }
     void  displaydata()
    {
        System.out.println("id="+ id +"name = " +name + "  address= "+ address);
    }
}
//creating a derieved class student
class student extends  person
{
    int rno;
    int marks;
    public void getdata(int rno,int marks,int id,String name,String address)
    {
        getdata(id,name,address); // calling base class method with 2 par.
        this.rno=rno;
        this.marks=marks;
    }
     void displaydata()
    {
        super.displaydata();
        System.out.println("rno = " +rno + "  marks = "+ marks);
    }
}

 class TestInh10
{
    public static void main(String[] args)
{
        Scanner scan=new Scanner(System.in);
        System.out.println("enter  student details");
    int rno=scan.nextInt();
    int id=scan.nextInt();
    String name=scan.next();
    String address=scan.next();
    int marks=scan.nextInt();

        student s=new student(); // creating child class object
        s.getdata(rno,marks,id,name,address);
        s.displaydata();


    }
}
