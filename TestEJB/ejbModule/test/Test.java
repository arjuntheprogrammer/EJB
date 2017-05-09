package test;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the TEST database table.
 * 
 */
@Entity
@Table(name="TEST")
@NamedQuery(name="Test.findAll", query="SELECT t FROM Test t")
public class Test implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="USER_NAME")
	private String userName;

	public Test() {
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

}