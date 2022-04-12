import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("default");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        System.out.println("Starting transactions");
        entityManager.getTransaction().begin();

        Student1 s1 = new Student1();
        s1.setName("Simran");
        s1.setAddress("Punjab");
        s1.setCourse("MBA");

        Student1 s2 = new Student1();
        s2.setName("Vaidehi");
        s2.setAddress("Maharashtra");
        s2.setCourse("Electronics Engg.");

        Student1 s3 = new Student1();
        s3.setName("Sonalica");
        s3.setAddress("Kolkata");
        s3.setCourse("LLB");

        Student1 s4 = new Student1();
        s4.setName("Indrayani");
        s4.setAddress("Mah");
        s4.setCourse("UPSC");

        s4.setName("rajat");
        s4.setAddress("Indore");
        s4.setCourse("GATE");

        s4.setName("Pranav");
        s4.setAddress("Mohali");
        s4.setCourse("CA");

        //to view list of record
//        Query query = (Query) entityManager.createQuery("from Student1");//from classname
//        query.setFirstResult(2);//we want to display any record list the no. provided in the method.It will display the list on the basis of no. provided ,after that no,the all list will display
//        query.setMaxResults(3);//how many records are display are done by setMaxResults() method
//        List<Student1> lobj=query.list();
//        for (Student1 s5:lobj) {
//            System.out.println(s5.getName()); //it will print the list of object data present in database
//        }
//        System.out.println(lobj.size());

        entityManager.persist(s1);
        entityManager.persist(s2);
        entityManager.persist(s3);
        entityManager.persist(s4);

        entityManager.getTransaction().commit();
        entityManager.close();
        entityManagerFactory.close();
    }
}

