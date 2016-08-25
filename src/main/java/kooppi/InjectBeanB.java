package kooppi;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Alternative;
import javax.inject.Named;

@Named
@RequestScoped
@Alternative
public class InjectBeanB implements InjectBeanI {
	private String line1;
	private String line2;

	@Override
	public String getLine1() {
//		return line1;
		return "Bayonet";
	}

	public void setLine1(String line1) {
		this.line1 = line1;
	}

	public String getLine2() {
		return line2;
	}

	public void setLine2(String line2) {
		this.line2 = line2;
	}
}
