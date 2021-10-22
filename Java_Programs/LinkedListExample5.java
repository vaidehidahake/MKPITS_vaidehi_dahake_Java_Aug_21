//LinkedList Example: Book.
import java.util.*;
    class Book
    {
    int id;
    String name,author,publisher;
    int quantity;
    public Book(int id, String name, String author, String publisher, int quantity)
    {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }
    }

     class LinkedListExample5
    {
    public static void main(String[] args)
    {
        List<Book> list=new LinkedList<Book>();

        Book b1=new Book(123,"Let us C","Yashwant Kanetkar","BPB",8);
        Book b2=new Book(156,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);
        Book b3=new Book(165,"Operating System","Galvin","Wiley",6);

        list.add(b1);
        list.add(b2);
        list.add(b3);

        for(Book b:list)
        {
        System.out.println("id:"+b.id);
        System.out.println("name:"+b.name);
        System.out.println("author:"+b.author);
         System.out.println("publisher:"+b.publisher);
          System.out.println("quantity:"+b.quantity);
        }
    }
    }
