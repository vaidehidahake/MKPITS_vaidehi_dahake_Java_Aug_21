import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class main {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("default");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        System.out.println("Starting Transaction");
        entityManager.getTransaction().begin();
        Vehi2 vob1=new Vehi2();
        vob1.setVnam("Wagonar");
        Vehi2 vob2=new Vehi2();
        vob2.setVnam("Maruti 800");
        Vehi2 vob3=new Vehi2();
        vob3.setVnam("Mercedes");
        Vehi2 vob4=new Vehi2();
        vob4.setVnam("Swift");





        Usr2 uob1=new Usr2();
        uob1.setUnam("vaidehi");
        Usr2 uob2=new Usr2();
        uob2.setUnam("simran");
        Usr2 uob3=new Usr2();
        uob3.setUnam("sonalica");
        Usr2 uob4=new Usr2();
        uob4.setUnam("indrayani");




//      in vehicle user is added.
//      one vehicle to one user mapping.
//        vob1.setU2(uob1);
//        vob2.setU1(uob1);

        entityManager.persist(uob1);
        entityManager.persist(uob2);
        entityManager.persist(uob3);
        entityManager.persist(uob4);
        entityManager.persist(vob1);
        entityManager.persist(vob2);
        entityManager.persist(vob3);
        entityManager.persist(vob4);


        entityManager.getTransaction().commit();

//        close the entity manager
        entityManager.close();
        entityManagerFactory.close();


    }
}
