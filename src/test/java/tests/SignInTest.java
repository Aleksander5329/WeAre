package tests;


import org.testng.annotations.Test;

import navigate.Nav;

public class SignInTest extends Base {
	
	
	

	@Test(priority = 1)
	public  void openRegPage() throws InterruptedException {
		Nav n = new Nav(driver);
		n.OpenRegistrationPage();

	}

	@Test(priority = 2)
	public void SignIn() throws InterruptedException {
		
		Nav n = new Nav(driver);
		n.SignIn();
	
	}

}
