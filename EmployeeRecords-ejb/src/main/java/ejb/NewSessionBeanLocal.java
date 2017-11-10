/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import javax.ejb.Local;

/**
 *
 * @author nibesh
 */
@Local
public interface NewSessionBeanLocal {

    public void persistValue();
}
