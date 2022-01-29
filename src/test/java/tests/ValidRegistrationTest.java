package tests;
import data.DataSet;
import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Pages.HomePage;
import Pages.RegisterPage;

public class ValidRegistrationTest extends Base {
	
	@Test(priority = 1)
	public void openRegPage() throws InterruptedException{
		HomePage home = new HomePage(driver);
		home.clickRegisterBtn();
	}
	
	@Test(priority = 2)
	public void assertPageNavigated() {
		
		RegisterPage rg = new RegisterPage(driver);
		
    	String header = rg.header();
    	String expectedHeader = "Join our community";
    	assertEquals(header, expectedHeader);
	}
	@Test(dataProvider = "dataSetOne", dataProviderClass = DataSet.class, priority = 3)
	public void validRegistrtion(String username, String email, String pass, String confirmPass) {
		RegisterPage rg = new RegisterPage(driver);
		rg.setName(username);
		rg.setEmail(email);
		rg.setPass(pass);
		rg.setConfirmPass(confirmPass);
		rg.dropDown();
		rg.dropDownOption();
		rg.clickRegBtn();
		
		String actualHeader =driver.findElement(By.xpath("//h1[normalize-space()='Welcome to our community.']")).getText();
    	String expectedHeader = "Welcome to our community.";
    	assertEquals(actualHeader, expectedHeader);
	}
}
