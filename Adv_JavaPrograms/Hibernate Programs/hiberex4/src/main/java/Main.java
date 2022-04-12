import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("default");
        EntityManager entityManager=entityManagerFactory.createEntityManager();
        System.out.println("Starting Transaction");

        entityManager.getTransaction().begin();

        Address a1=new Address();
        a1.setPincode(440024);
        a1.setCity("Nagpur");
        a1.setState("Maharashtra");

        Employees e1=new Employees();
        e1.setEmpname("Vaidehi");
        e1.setEmail("vaidehi0101@gmail.com");
        e1.setAddr(a1);

        Address a2=new Address();
        a2.setPincode(440032);//sec data
        a2.setCity("Jaipur");
        a2.setState("Rajasthan");
        Employees e2=new Employees();
        e2.setEmpname("simran");
        e2.setEmail("sim123@gmail.com");
        e2.setAddr(a2);

        System.out.println("Saving Employee data in database");
        entityManager.persist(e1);
        entityManager.persist(e2);


        entityManager.getTransaction().commit();
        //close entityManager
        entityManager.close();
        entityManagerFactory.close();


    }
}
