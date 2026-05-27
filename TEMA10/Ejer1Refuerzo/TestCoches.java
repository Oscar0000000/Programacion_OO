import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestCoches {

    public static void main(String[] args) {
        // Se crea la factoría y el gestor de entidades apuntando al archivo de base de datos de ObjectDB
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("db/coches.odb");
        EntityManager em = emf.createEntityManager();

        // Metemos varios coches
        Coche coche1 = new Coche("Rojo");
        Coche coche2 = new Coche("Azul");
        Coche coche3 = new Coche("Negro");

        try {
            // Iniciamos una transacción
            em.getTransaction().begin();

            //  Insertamos los objetos coche en la base de datos
            em.persist(coche1);
            em.persist(coche2);
            em.persist(coche3);

            // Consolidamos los cambios en la base de datos
            em.getTransaction().commit();
            System.out.println("¡Los coches se han guardado exitosamente en ObjectDB!");

        } catch (Exception e) {
            // En caso de error, se revierte cualquier cambio pendiente
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            e.printStackTrace();
        } finally {
          
            em.close();
            emf.close();
        }
    }
}
