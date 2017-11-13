package ua.com.owu.dao;

import lombok.Setter;
import ua.com.owu.entity.User;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

@Setter
public class UserDAO {

     private EntityManagerFactory entityManagerFactory;


   public void save(User user){
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(user);
        entityManager.getTransaction().commit();
        entityManager.close();
        entityManagerFactory.close();


    }


   /* List<User> findall(){

        return "";
    }*/

}
