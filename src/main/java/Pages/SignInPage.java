package Pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import navigate.Action;
import tests.Base;

public class SignInPage extends Base{

	
	@FindBy(id = "username")
	WebElement userName;

	@FindBy(id = "password")
	WebElement password;

	@FindBy(css = "input[value='Login']")
	WebElement Login;

	@FindBy(xpath = "//h1[contains(text(),'Login Page')]")
	WebElement header;
	
	Action act = new Action();
	public void waitElement(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver,5);
		wait.until(ExpectedConditions.visibilityOf(element));
}
	
	public void setUserName() {
		waitElement(userName);
		userName.sendKeys("UniqueUser");
	}
	public void setUserName1() {
		waitElement(userName);
		userName.sendKeys("UserOne");
	}

	public void setPassword() {
		waitElement(password);
		password.sendKeys("123456");
	}

	public void clickLogInBtn() {
		waitElement(userName);
		Action.clickOn(Login);
//		Login.click();
	}
	
	public void SignIn() {
		userName.sendKeys("UniqueUser");
		password.sendKeys("123456");
		Login.isDisplayed();
		Login.click();
	}
	

	public SignInPage(WebDriver d) {
		PageFactory.initElements(d, this);
	}

	public void assertPageNavigated() {
		header.isDisplayed();
		System.out.println("You are on Log In Page! ");
	}
}
