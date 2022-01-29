package tests;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Pages.*;
import navigate.Nav;

public class EditProfileTest extends Base {

	@Test(priority = 1)
	public void openprofilePage() throws InterruptedException {
		Nav n = new Nav(driver);
		n.SignIn();
		n.OpenProfilePage();
		n.clicklogOutBtn();
		
	}
	

	@Test(priority = 3)
	public void editProfile() throws InterruptedException {
		Nav n = new Nav(driver);
		n.SignIn();
		n.OpenProfilePage();
		EditPofilePage ep = new EditPofilePage(driver);
        ep.setName("John");
        ep.setLastName("Doe");
        ep.setBirthDay("01011990");
        ep.dropDownGenderSelect();
        ep.setPersonalInfo("Sample text");
        ep.setCity();
        ep.clickUpdtBtn1();
        n.clicklogOutBtn();
	}
	@Test(priority = 4)
	public void threeLetterFirstName() throws InterruptedException {
		Nav n = new Nav(driver);
		n.SignIn();
		n.OpenProfilePage();
		EditPofilePage ep = new EditPofilePage(driver);
        ep.setName("Joh");
        ep.setLastName("Doe");
        ep.setBirthDay("01011990");
        ep.dropDownGenderSelect();
        ep.setPersonalInfo("Sample text");
        ep.setCity();
        ep.clickUpdtBtn1();
        n.clicklogOutBtn();
	}
	@Test(priority = 5)
	public void threeLetterLasttName() throws InterruptedException {
		Nav n = new Nav(driver);
		n.SignIn();
		n.OpenProfilePage();
		EditPofilePage ep = new EditPofilePage(driver);
        ep.setName("John");
        ep.setLastName("Doe");
        ep.setBirthDay("01011990");
        ep.dropDownGenderSelect();
        ep.setPersonalInfo("Sample text");
        ep.setCity();
        ep.clickUpdtBtn1();
        n.clicklogOutBtn();
	}
	@Test(priority = 6)
	public void birthDayFuture() throws InterruptedException {
		
		Nav n = new Nav(driver);
		n.SignIn();
		n.OpenProfilePage();
		
		EditPofilePage ep = new EditPofilePage(driver);
        ep.setName("John");
        ep.setLastName("Doe");
        ep.setBirthDay("01012030");
        ep.dropDownGenderSelect();
        ep.setPersonalInfo("Sample text");
        ep.setCity();
        ep.clickUpdtBtn1();
        n.clicklogOutBtn();
	}
	@Test(priority = 15)
	public void nonLeapYear() throws InterruptedException {
		
		Nav n = new Nav(driver);
		n.SignIn();
		n.OpenProfilePage();
		
		EditPofilePage ep = new EditPofilePage(driver);
        ep.setName("John");
        ep.setLastName("Doe");
        ep.setBirthDay("29022001");
        ep.dropDownGenderSelect();
        ep.setPersonalInfo("Sample text");
        ep.setCity();
        ep.clickUpdtBtn1();
        n.clicklogOutBtn();
	}
	@Test(priority = 7)
	public void longFirstName() throws InterruptedException {
		
		Nav n = new Nav(driver);
		n.SignIn();
		n.OpenProfilePage();
		
		EditPofilePage ep = new EditPofilePage(driver);
        ep.setName("qqqqqqq");
        ep.setLastName("Doe");
        ep.setBirthDay("01011990");
        ep.dropDownGenderSelect();
        ep.setPersonalInfo("Sample text");
        ep.setCity();
        ep.clickUpdtBtn1();
        n.clicklogOutBtn();
	}
	@Test(priority = 9)
	public void changeProfession() throws InterruptedException {
		
		Nav n = new Nav(driver);
		n.SignIn();
		n.OpenProfilePage();
		
		EditPofilePage ep = new EditPofilePage(driver);
		ep.clickWorkplace("Accountant");
		ep.updateAvailabilityBtn();
		n.clicklogOutBtn();
		
	}
	@Test(priority = 10)
	public void uploadPhoto() throws InterruptedException {
		
		Nav n = new Nav(driver);
		n.SignIn();
		n.OpenProfilePage();
		
		WebElement chooseFile = driver.findElement(By.id("imagefile"));
		chooseFile.sendKeys("C:\\Users\\SnuSnu\\Desktop\\WeAre\\src\\test\\resources\\resources\\sampleImage.jpg");
		EditPofilePage ep = new EditPofilePage(driver);
		Thread.sleep(100);
		ep.clickUpdatePictureBtb();
		n.clicklogOutBtn();
	}
	
	@Test(priority = 11)
	public void invalidAveilability() throws InterruptedException  {
		
		Nav n = new Nav(driver);
		n.SignIn();
		n.OpenProfilePage();
		
		EditPofilePage ep = new EditPofilePage(driver);
		ep.setAvailability("169");
		ep.updateAvailabilityBtn();
		n.clicklogOutBtn();
	}
	@Test(priority = 12)
	public void uploadPrivatePhoto() throws InterruptedException {
		
		Nav n = new Nav(driver);
		n.SignIn();
		n.OpenProfilePage();
		
		EditPofilePage ep = new EditPofilePage(driver);
		
		WebElement chooseFile = driver.findElement(By.id("imagefile"));
		chooseFile.sendKeys("C:\\Users\\SnuSnu\\Desktop\\WeAre\\src\\test\\resources\\resources\\sampleImage.jpg");
		ep.clickPrivate();
		n.clicklogOutBtn();
	}
	
	@Test(priority = 13)
	public void updateServices() throws InterruptedException {
		
		Nav n = new Nav(driver);
		n.SignIn();
		n.OpenProfilePage();
		
		EditPofilePage ep = new EditPofilePage(driver);
		ep.setService("QA");
		ep.setAvailability("20");
		ep.updateAvailabilityBtn();
		n.clicklogOutBtn();
	}
	@Test(priority = 14)
	public void uploadImgMoreThanOneMb() throws InterruptedException {
		
		Nav n = new Nav(driver);
		n.SignIn();
		n.OpenProfilePage();
		
		EditPofilePage ep = new EditPofilePage(driver);
		
		WebElement chooseFile = driver.findElement(By.id("imagefile"));
		chooseFile.sendKeys("C:\\Users\\SnuSnu\\Desktop\\WeAre\\src\\test\\resources\\resources\\msg-1-fc-40.jpg");
		ep.clickPrivate();
		n.clicklogOutBtn();
	}
}
