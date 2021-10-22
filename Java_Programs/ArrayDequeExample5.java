//Java ArrayDeque Example: Book.
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
   class ArrayDequeExample5
    {
    public static void main(String[] args)
    {
        Deque<Book> set=new ArrayDeque<Book>();

        Book b1=new Book(111,"Physics","S.Chand","BPB",8);
        Book b2=new Book(112,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);
        Book b3=new Book(113,"Operating System","Galvin","Wiley",6);

        set.add(b1);
        set.add(b2);
        set.add(b3);

        for(Book b:set)
        {
        System.out.println("id:"+b.id);
        System.out.println("name:"+b.name);
        System.out.println("author:"+b.author);
        System.out.println("publisher:"+b.publisher);
        System.out.println("quantity:"+b.quantity);
        }
    }
    }

