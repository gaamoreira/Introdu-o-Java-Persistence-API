/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplo.jpa.dao;

import exemplo.jpa.modelo.Local;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class LocalDAO {
    public EntityManager getEM(){
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("eventoPU");
        return factory.createEntityManager();
    }
    
    public Local salvar (Local local){
        EntityManager em = getEM();
        try {
        em.getTransaction().begin();
        em.persist(local); //executa o insert
        em.getTransaction().commit();
    } catch(Exception e){
        em.getTransaction().rollback();
    } finally{
        em.close();
    }
        
        return local;
    }
}
