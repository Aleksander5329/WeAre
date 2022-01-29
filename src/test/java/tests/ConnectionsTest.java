package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.*;
import navigate.*;


public class ConnectionsTest extends Base {
	
	Action act = new Action();
	
	@Test(priority = 1)
	public void openProfilePage() throws InterruptedException  {
		Nav n = new Nav(driver);
//		n.SignIn();
	}
	@SuppressWarnings("static-access")
	@Test(priority = 2)
	public void addFriend() throws InterruptedException {
		HomePage hp = new HomePage(driver);
		Nav n = new Nav(driver);
		n.SignIn();
		SignInPage sp = new SignInPage(driver);
		hp.searchBar("John Doe");
		hp.clickSearchBtn();
		WebElement doe = driver.findElement(By.xpath("//a[normalize-space()='See Profile']"));
		act.clickOn(doe);
		n.clickConnectBtn();
		String actual = driver.findElement(By.xpath("//div[normalize-space()='Good job! You have send friend request!']")).getText();
		String expected = "Good job! You have send friend request!";
		Assert.assertEquals(actual, expected);
		System.out.println(actual);
		hp.clicklogOutBtn();
		sp.setUserName1();
		sp.setPassword();
		sp.clickLogInBtn();
		n.OpenProfilePage();
		n.clickFriendRequestBtn();
		n.clickApproveFriendBtn();
		hp.clicklogOutBtn();
		
	}
	@Test(priority = 3)
	public void removeFriend() throws InterruptedException {
		HomePage hp = new HomePage(driver);
		Nav n = new Nav(driver);
		n.SignIn();
		
		hp.searchBar("John Doe");
		hp.clickSearchBtn();
		driver.findElement(By.xpath("//h2[contains(text(),'Doe')]")).click();
		n.clickRemoveFriendBtn();
		hp.clickHomeBtb();
		n.clicklogOutBtn();
	}

}
