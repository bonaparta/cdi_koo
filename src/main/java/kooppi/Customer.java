package kooppi;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@RequestScoped
public class Customer {
	private String firstName;
	private String lastName;

	@Inject
	private InjectBeanI address;
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public InjectBeanI getAddress() {
		return address;
	}

	public void setAddress(InjectBeanI address) {
		this.address = address;
	}
}
