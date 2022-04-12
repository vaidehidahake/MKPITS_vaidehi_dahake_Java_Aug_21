import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) {


    EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("default");
    EntityManager entityManager = entityManagerFactory.createEntityManager();
        System.out.println("Starting transactions");
        entityManager.getTransaction().begin();

    Student s1 = new Student();
        s1.setName("Simran");
        s1.setAddress("Punjab");
        s1.setCourse("MBA");

    Student s2 = new Student();
        s2.setName("Vaidehi");
        s2.setAddress("Maharashtra");
        s2.setCourse("Electronics Engg.");

    Student s3 = new Student();
        s3.setName("Sonalica");
        s3.setAddress("Kolkata");
        s3.setCourse("LLB");

    Student s4 = new Student();
        s4.setName("Indrayani");
        s4.setAddress("Mah");
        s4.setCourse("UPSC");

         entityManager.persist(s1);//persistence obj is saved and then it is attached with session.
        entityManager.persist(s2);
        entityManager.persist(s3);
        s3.setAddress("Nashik");//persistence obj is trackable,we have to update data after object is saved,it will update data.
        entityManager.persist(s4);

        entityManager.getTransaction().commit();
        entityManager.close();
        //s3.setAddress("Nashik");it will detached ,because it is declared outside the session close.

        entityManagerFactory.close();
}
}
