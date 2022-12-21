/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import Services.Covidd;


@WebService(serviceName = "CovidService")
public class CovidService {

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("CovidIIIPU");

    @WebMethod(operationName = "filebyid")
    public Covidd filebyid(@WebParam(name = "id") int id) {
        EntityManager em = emf.createEntityManager();
        Covidd ys = em.find(Covidd.class, id);
        return ys;
    }

    private void persist(Object object) {
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(object);
            em.getTransaction().commit();
        } catch (Exception e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", e);
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
    }

    
}
