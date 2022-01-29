package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.HomePage;
import navigate.Nav;

public class SearchTest extends Base {

	@Test
	public void openProfilePage() throws InterruptedException  {
		Nav n = new Nav(driver);
//		n.SignIn();
		System.out.println("Home page is opened");
	}

	@Test(priority = 1)
	public void searchUser() throws InterruptedException {
		Nav n = new Nav(driver);
		n.SignIn();
		HomePage hp = new HomePage(driver);	
		hp.searchBar("Jane Doe");
		hp.clickSearchBtn();
		System.out.println("Searching user");
		n.clicklogOutBtn();
	}

	@Test(priority = 2)
	public void searchUserByPartialName() throws InterruptedException {
		HomePage hp = new HomePage(driver);	
		Nav n = new Nav(driver);
		n.SignIn();
		hp.searchBar("Doe");
		hp.clickSearchBtn();
		hp.errorMsg();
		hp.clickHomeBtb();
		System.out.println("Searching user by partial name");
		n.clicklogOutBtn();
		
	}

	@Test(priority = 3)
	public void searchByProfesion() throws InterruptedException {
		HomePage hp = new HomePage(driver);	
		Nav n = new Nav(driver);
		n.SignIn();
		hp.searchByProfesion("Accountant");
		hp.clickSearchBtn();
		String actual = driver.findElement(By.linkText("Jane Doe")).getText();
		String expected = "Jane Doe";
		
		Assert.assertEquals(actual, expected);
		System.out.println("Searching user by proffession");
		hp.clickHomeBtb();
		n.clicklogOutBtn();
	}
	
	@Test(priority = 4)
	public void searchAllUsers() throws InterruptedException {
		Nav n = new Nav(driver);
		n.SignIn();
		HomePage hp = new HomePage(driver);	
		hp.clickSearchBtn();
		String actual = driver.findElement(By.linkText("Jane Doe")).getText();
		String expected = "Jane Doe";

		Assert.assertEquals(actual, expected);
		System.out.println("Searching user without any info");
		hp.clickHomeBtb();
		n.clicklogOutBtn();
	}
	@Test(priority = 5) 
	public void searchNonExistingUser() throws InterruptedException {
		Nav n = new Nav(driver);
		n.SignIn();
		HomePage hp = new HomePage(driver);
		hp.searchBar("Ivan");
		hp.clickSearchBtn();
		hp.errorMsg();
		hp.clickHomeBtb();
		n.clicklogOutBtn();
	}
	@Test(priority = 6)
	public void nonExistingProfesion() throws InterruptedException {
		Nav n = new Nav(driver);
		n.SignIn();
		HomePage hp = new HomePage(driver);
		
		hp.searchByProfesion("Commet destroyer");
		hp.clickSearchBtn();
		hp.errorMsg();
		hp.clickHomeBtb();
		n.clicklogOutBtn();
		
	}

}
