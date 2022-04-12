import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class main {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("default");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        System.out.println("Starting Transaction");
        entityManager.getTransaction().begin();
        Employee obj=new Employee();
        obj.setEmpid(2);
        obj.setEmpname("Vaidehi");
        obj.setAddress("Nagpur");

        System.out.println("Saving Employee data in database");
        entityManager.persist(obj);



        entityManager.getTransaction().commit();

//        close the entity manager
        entityManager.close();
        entityManagerFactory.close();


    }
}
