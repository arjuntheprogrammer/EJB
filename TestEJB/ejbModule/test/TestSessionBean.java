package test;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Session Bean implementation class TestSessionBean
 */
@Stateless
public class TestSessionBean implements TestSessionBeanRemote {

    @PersistenceContext(name = "TestEJB") private EntityManager emgr;
    
	/**
     * Default constructor. 
     */
    public TestSessionBean() {
    
    }

	@Override
	public boolean userNameExists(String username) {
		boolean exists=false;
		Test userExists=emgr.find(Test.class, username);
		
		if(userExists!=null){
			exists=true;
			
		}
		
	
		return exists;
		
	}

}
