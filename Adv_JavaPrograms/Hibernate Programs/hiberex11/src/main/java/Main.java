import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

import static com.oracle.jrockit.jfr.Transition.From;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("default");
        EntityManager entityManager=entityManagerFactory.createEntityManager();
        System.out.println("Starting transactions");
        entityManager.getTransaction().begin();

//        Student s1=new Student();
//        s1.setId(1);
//        s1.setName("Simran");
//        s1.setAddress("Punjab");
//        s1.setCourse("MBA");
//
//        Student s2=new Student();
//        s2.setId(2);
//        s2.setName("Vaidehi");
//        s2.setAddress("Maharashtra");
//        s2.setCourse("Electronics Engg.");
//
//        Student s3=new Student();
//        s3.setId(3);
//        s3.setName("Sonalica");
//        s3.setAddress("Kolkata");
//        s3.setCourse("LLB");
//
//        Student s4=new Student();
//        s4.setId(4);
//        s4.setName("Indrayani");
//        s4.setAddress("Mah");
//        s4.setCourse("UPSC");
//
//        entityManager.persist(s1);
//        entityManager.persist(s2);
//        entityManager.persist(s3);
//        entityManager.persist(s4);

//        //to view list of record
//        Query query = (Query) entityManager.createQuery("from Student");//from classname
//        List lobj = query.list();
//        System.out.println(lobj.size());//it will show the list of object present in  database table

        //to view all record
//        List <Student> lobj= query.list();
//        for (Student s1:lobj) {
//            System.out.println(s1.getName()+" "+s1.getCourse()); //it will print the list of object data present in database
//        }

        //        Student s1=(Student) query.uniqueResult();

        //to view specific record

//        Query query1=(Query) entityManager.createQuery("from Student where id=3") ;
//         List<Student> list=query1.list();
//        List lobj1 = query1.list();
//        System.out.println(lobj1.size());


        //OR
//
//       Query query1=(Query) entityManager.createQuery("from Student where id= :Id") ;
//        query1.setInteger("Id" ,3);

//        List lobj1 = query1.list(); //to show the l
//        System.out.println(lobj1.size());

        //to update data
//        Query query2 = (Query) entityManager.createQuery("update Student set course= :Course where id= :Id");
//        query2.setParameter("Course","Hadoop");
//        query2.setInteger("Id",5);
//        int result=query2.executeUpdate();
//        System.out.println(result);//it will print how many data are updated in table

        //to delete data
//        Query query3 = (Query) entityManager.createQuery("delete from Student where id= :Id");
//        query3.setInteger("Id" ,6);
//        int result=query3.executeUpdate();




        entityManager.getTransaction().commit();
        entityManager.close();
        entityManagerFactory.close();

    }
}
