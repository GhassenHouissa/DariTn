package tn.dari.spring.entity;

public class Admin extends User {

	public static final long serialVersionUID = 1L;

	private String logadmin;
	private String psswd;

	public String getLogadmin() {
		return logadmin;
	}

	public void setLogadmin(String logadmin) {
		this.logadmin = logadmin;
	}

	public String getPsswd() {
		return psswd;
	}

	public void setPsswd(String psswd) {
		this.psswd = psswd;
	}

}
