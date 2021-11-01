    import java.util.*;
    class Book
    {
       int id;
       String name;
       String author;
       int quantity;
    Book(int id, String name, String author, int quantity)
    {
        this.id = id;
        this.name = name;
        this.author = author;
        this.quantity = quantity;
    }
    }

  class HashSetExample5
    {
    public static void main(String[] args)
    {
        HashSet<Book> set=new HashSet<Book>();
       Book b1=new Book(110,"Physics","S.Chand",2);
       Book b2=new Book(121,"Science","S.Chand",4);
       Book b3=new Book(110,"Biology","S.Chand",5);
        set.add(b1);
        set.add(b2);
        set.add(b3);

        for(Book b:set)
        {
            System.out.println("id is:"+b.id);

            System.out.println("name is:"+b.name);

            System.out.println("author is:"+b.author);

             System.out.println("quantity is:"+b.quantity);
        }
    }
    }
