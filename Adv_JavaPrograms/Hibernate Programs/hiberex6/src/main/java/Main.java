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

        Address a2=new Address();
        a2.setPincode(440032);//sec data
        a2.setCity("Jaipur");
        a2.setState("Rajasthan");

        Emp1 obj=new Emp1();
        obj.setEmpname("Vaidehi");
        obj.setEmail("vaidehi0101@gmail.com");
        obj.setHome_addr(a1);
        obj.setOffice_addr(a2);







        System.out.println("Saving Employee data in database");
        entityManager.persist(obj);



        entityManager.getTransaction().commit();
        //close entityManager
        entityManager.close();
        entityManagerFactory.close();


    }
}
