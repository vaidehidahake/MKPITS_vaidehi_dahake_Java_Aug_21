import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Collection;

public class main {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("default");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        System.out.println("Starting Transaction");
        entityManager.getTransaction().begin();
      Vehi vob1=new Vehi();
      vob1.setVname("Tata Punch");
      Vehi vob2=new Vehi();
      vob2.setVname("Ritz");


      Usr uob1=new Usr();
      uob1.setUname("vaidehi");
      uob1.getVob().add(vob1);
      uob1.getVob().add(vob2);

//      in vehicle user is added.
//      many vehicle to one user mapping.
      vob1.setU1(uob1);
      vob2.setU1(uob1);

        entityManager.persist(uob1);
        entityManager.persist(vob1);
        entityManager.persist(vob2);


        entityManager.getTransaction().commit();

//        close the entity manager
        entityManager.close();
        entityManagerFactory.close();


    }
    }

