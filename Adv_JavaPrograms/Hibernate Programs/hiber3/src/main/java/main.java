import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class main {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("default");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        System.out.println("Starting Transaction");
        entityManager.getTransaction().begin();
        Vehi1 vob1=new Vehi1();
        vob1.setVname("Tata Punch");




        Usr1 uob1=new Usr1();
        uob1.setUname("vaidehi");
        uob1.setVob(vob1);


//      in vehicle user is added.
//      one vehicle to one user mapping.
       vob1.setU2(uob1);
//        vob2.setU1(uob1);

        entityManager.persist(uob1);
        entityManager.persist(vob1);
//        entityManager.persist(vob2);


        entityManager.getTransaction().commit();

//        close the entity manager
        entityManager.close();
        entityManagerFactory.close();


    }
}
