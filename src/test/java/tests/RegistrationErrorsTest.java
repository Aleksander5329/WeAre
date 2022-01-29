package tests;


import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.RegisterPage;
import data.DataSet;
import navigate.Nav;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;



public class RegistrationErrorsTest extends Base {
	
	
	@BeforeTest(groups = "RegistrationErrorsTest")
	public void openRegPage() throws InterruptedException{
		Nav n = new Nav(driver);
		n.OpenRegistrationPage();
	}
	
	@Test(groups = "RegistrationErrorsTest",dataProvider = "dataSetOne", dataProviderClass = DataSet.class, priority = 3)
	public void userAlreadyExists(String username, String email, String pass, String confirmPass) {
		
		RegisterPage rg = new RegisterPage(driver);
		
		rg.setName(username);
		rg.setEmail(email);
		rg.setPass(pass);
		rg.setConfirmPass(confirmPass);
		rg.dropDown();
		rg.dropDownOption();
		rg.clickRegBtn();
		
		
		String actualMsg = driver.findElement(By.xpath("//i[contains(text(),'User with this username already exist')]")).getText();
		String expectedMsg = "User with this username already exist";
		Assert.assertEquals(actualMsg, expectedMsg);
		rg.clearFields();
	}
	
	@Test(groups = "RegistrationErrorsTest",dataProvider = "dataSetTwo", dataProviderClass = DataSet.class, priority = 4)
	public void notMatchingPass(String username, String email, String pass, String confirmPass) {
		Nav n = new Nav(driver);
//		n.OpenRegistrationPage();
		
		RegisterPage rg = new RegisterPage(driver);
		rg.setName(username);
		rg.setEmail(email);
		rg.setPass(pass);
		rg.setConfirmPass(confirmPass);
		rg.dropDown();
		rg.dropDownOption();
		rg.clickRegBtn();
		
		String actualMsg = driver.findElement(By.xpath("//i[contains(text(),'Your password is not confirmed')]")).getText();
		String expectedMsg = "Your password is not confirmed";
		Assert.assertEquals(actualMsg, expectedMsg);
		rg.clearFields();
	}
	
	
	@Test(groups = "RegistrationErrorsTest", dataProvider = "dataSetThree", dataProviderClass = DataSet.class, priority = 5)
	public void shortPass(String username, String email, String pass, String confirmPass) {
		Nav n = new Nav(driver);
//		n.OpenRegistrationPage();
		
		RegisterPage rg = new RegisterPage(driver);
		rg.setName(username);
		rg.setEmail(email);
		rg.setPass(pass);
		rg.setConfirmPass(confirmPass);
		rg.dropDown();
		rg.dropDownOption();
		rg.clickRegBtn();
		
		String actualMsg = driver.findElement(By.xpath("//i[contains(text(),'password must be minimum 6 characters')]")).getText();
		String expectedMsg = "password must be minimum 6 characters";
		Assert.assertEquals(actualMsg, expectedMsg);
		rg.clearFields();
	}
	
	@Test(groups = "RegistrationErrorsTest", dataProvider = "dataSetOne", dataProviderClass = DataSet.class, priority = 6)
	public void invalidEmail(String username, String email, String pass, String confirmPass) {
		Nav n = new Nav(driver);
//		n.OpenRegistrationPage();
		
		RegisterPage rg = new RegisterPage(driver);
		rg.setName(username);;
		rg.setEmail("sfsdf");
		rg.setPass(confirmPass);
		rg.setConfirmPass(confirmPass);
		rg.clickRegBtn();
		
		String actualMsg = driver.findElement(By.xpath("//i[contains(text(),\"this doesn't look like valid email\")]")).getText();
		String expectedMsg = "this doesn't look like valid email";
		Assert.assertEquals(actualMsg, expectedMsg);
		rg.clearFields();
	}
	@Test(groups = "RegistrationErrorsTest", dataProvider = "dataSetOne", dataProviderClass = DataSet.class, priority = 7)
	public void aler(String username, String email, String pass, String confirmPass) throws InterruptedException {
		Nav n = new Nav(driver);
//		n.OpenRegistrationPage();
		
		RegisterPage rg = new RegisterPage(driver);
		
		rg.setEmail(email);
		rg.setPass(pass);
		rg.setConfirmPass(confirmPass);
		rg.clickRegBtn();
		rg.clearFields();
	}
	
}
