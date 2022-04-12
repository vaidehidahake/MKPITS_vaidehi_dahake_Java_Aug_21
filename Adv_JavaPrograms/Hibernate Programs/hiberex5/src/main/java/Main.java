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

        Employees obj=new Employees();
        obj.setEmpname("Vaidehi");
        obj.setEmail("vaidehi0101@gmail.com");
        obj.setAobj(a1);

        Address a2=new Address();
        a2.setPincode(440032);//sec data
        a2.setCity("Jaipur");
        a2.setState("Rajasthan");
        Employees obj1=new Employees();
        obj1.setEmpname("simran");
        obj1.setEmail("sim123@gmail.com");
        obj1.setAobj(a2);

        Address a3=new Address();
        a3.setPincode(440013);//sec data
        a3.setCity("Howrah Bridge");
        a3.setState("Bengal");
        Employees obj2=new Employees();
        obj2.setEmpname("sonalica");
        obj2.setEmail("sona@gmail.com");
        obj2.setAobj(a3);

        Address a4=new Address();
        a4.setPincode(440010);//sec data
        a4.setCity("Nashik");
        a4.setState("Mah");
        Employees obj3=new Employees();
        obj3.setEmpname("tejal");
        obj3.setEmail("tej@gmail.com");
        obj3.setAobj(a4);





        System.out.println("Saving Employee data in database");
        entityManager.persist(obj);
        entityManager.persist(obj1);
        entityManager.persist(obj2);
        entityManager.persist(obj3);


        entityManager.getTransaction().commit();
        //close entityManager
        entityManager.close();
        entityManagerFactory.close();


    }
}
