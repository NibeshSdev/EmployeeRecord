/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author nibesh
 */
@Stateless
public class NewSessionBean implements NewSessionBeanLocal {
    
    @PersistenceContext(unitName = "EMPLOYEEPERSISTENCE")
    private EntityManager em;
    
    @Override
    public void persistValue() {
        
        Test test = new Test();
        test.setAddress("kathmandu");
        test.setName("F1soft international");
        test.setPost("developer");
        
        em.persist(test);
        
    }
}
