import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Date;

public class main {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("default");
        EntityManager entityManager=entityManagerFactory.createEntityManager();
        System.out.println("Starting Transaction");

        entityManager.getTransaction().begin();
        Employ obj=new Employ();
        obj.setEid(6);
        obj.setEname("Riya");
        obj.setAddr("Nagpur");
        obj.setEmpdesc("Clerk");
        obj.setDoj(new Date());
        obj.setEmpdes("Hello Hibernate");

        obj.setEname("Vaidehi");
        obj.setAddr("Pune");
        obj.setEmpdesc("HR");
        obj.setDoj(new Date());
        obj.setEmpdes("Hello");

        System.out.println("Saving Employee data in database");
       // entityManager.persist(obj);
        // retrieve data from database
//        Employ emp = entityManager.find(Employ.class, 2);
//        System.out.println(emp.getEname()+" "+emp.getEmpdes()+" "+emp.getEmpdesc()+" "+emp.getAddr()+" "+emp.getDoj());
        entityManager.getTransaction().commit();

        //entityManager.remove(obj); //it will remove object
        //close entityManager
        entityManager.close();
        entityManagerFactory.close();


    }
}
