package beans;

import java.sql.Connection;
import java.sql.DriverManager;

import org.springframework.beans.factory.annotation.Required;

public class Test {
	private String loginUser;
	private String driver;
	private String url;
	private String user;
	private String pass;
	public String getLoginUser() {
		return loginUser;
	}
	
	public void setLoginUser(String loginUser) {
		this.loginUser = loginUser;
	}
	public String getDriver() {
		return driver;
	}
	@Required
	public void setDriver(String driver) {
		this.driver = driver;
	}
	public String getUrl() {
		return url;
	}
	@Required
	public void setUrl(String url) {
		this.url = url;
	}
	public String getUser() {
		return user;
	}
	@Required
	public void setUser(String user) {
		this.user = user;
	}
	public String getPass() {
		return pass;
	}
	@Required
	public void setPass(String pass) {
		this.pass = pass;
	}
	public void printConnection() throws Exception {
		Class.forName(driver);
		Connection con=DriverManager.getConnection(url, user, pass);
		
		System.out.println("Welcome ,"+getLoginUser());
		System.out.println(con);
	}
	
}
