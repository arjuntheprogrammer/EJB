package test;

import javax.ejb.Remote;

@Remote
public interface TestSessionBeanRemote {
	boolean userNameExists(String username);
}
