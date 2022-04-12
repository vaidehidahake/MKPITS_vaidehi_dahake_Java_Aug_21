import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("default");
        EntityManager entityManager=entityManagerFactory.createEntityManager();
        System.out.println("Starting transactions");
        entityManager.getTransaction().begin();

        Vehicle vobj=new Vehicle();
        vobj.setVname("Vehicle");

        TwoWheeler tob1=new TwoWheeler();
        tob1.setVname("Pleasure");
        tob1.setStrhandle("it has a handle");

        tob1.setVname("Activa");

        FourWheeler fob1=new FourWheeler();
        fob1.setVname("Alto");
        fob1.setStrwheel("it has Stering wheel");

        fob1.setVname("Mercedes");

        entityManager.persist(tob1);
        entityManager.persist(fob1);



        entityManager.getTransaction().commit();
        entityManager.close();
        entityManagerFactory.close();

    }
}

