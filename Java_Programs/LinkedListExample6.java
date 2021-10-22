import java.util.*;
import java.io.*;
class Book
{
    int id;
    String name;
    int quantity;
    public Book(int id, String name,  int quantity)
    {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
    }
    }

    class LinkedListExample6
    {
    public static void main(String[] args)
    {
		Scanner scan=new Scanner(System.in);

        List<Book> list=new LinkedList<Book>();
        Book[] b=new Book[3];
        for(int i=0;i<3;i++)
        {
			System.out.println("enter book id ");
			int id=scan.nextInt();
			System.out.println("enter book name ");
			String name=scan.next();
			System.out.println("enter book quantity ");
			int quantity=scan.nextInt();
			b[i]=new Book(id,name,quantity);
			list.add(b[i]);
		}



        for(Book b1:list)
        {
        System.out.println("id:"+b1.id);
        System.out.println("name:"+b1.name);
         System.out.println("quantity:"+b1.quantity);
        }


    }
    }
