package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import navigate.Action;
import tests.Base;

public class RegisterPage extends Base {
	
	
	@FindBy(id = "name") 
	WebElement name;
	
	@FindBy(id = "email") 
	WebElement email;
	
	@FindBy(id = "password") 
	WebElement pass;
	
	@FindBy(id = "confirm") 
	WebElement confirmPass;
	
	@FindBy(css = "input[value='Register']") 
	WebElement regBtn;
	
	@FindBy(name = "category.id") 
	WebElement dropDown;
	
	@FindBy(xpath = "//option[contains(text(),'Baker')]") 
	WebElement dropDownOption;
	
	@FindBy(xpath = "//h1[@class='mb-3 bread']") 
	WebElement header;
	
	Action act = new Action();
	public void waitElement(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver,5);
		wait.until(ExpectedConditions.visibilityOf(element));
}
	
	public void clearFields() {
		waitElement(name);
		name.clear();
		waitElement(email);
		email.clear();
		waitElement(pass);
		pass.clear();
		waitElement(confirmPass);
		confirmPass.clear();
	}
	
	public void setName(String k) {
		waitElement(name);
		name.sendKeys(k);
	}
	public void setEmail(String k) {
		waitElement(email);
		email.sendKeys(k);
	}
	public void setPass(String k) {
		waitElement(pass);
		pass.sendKeys(k);
	}
	public void setConfirmPass(String k) {
		waitElement(confirmPass);
		confirmPass.sendKeys(k);
	}
	@SuppressWarnings("static-access")
	public void clickRegBtn() {
		act.clickOn(regBtn);
	}
	@SuppressWarnings("static-access")
	public void dropDown() {
		act.clickOn(dropDown);
	}
	@SuppressWarnings("static-access")
	public void dropDownOption() {
		act.clickOn(dropDownOption);
	}
	public String header() {
		return header.getText();
	}
	public void regURL() {
		driver.get("http://localhost:8081/register");
	}
	
	public RegisterPage(WebDriver d){
		PageFactory.initElements(d, this);
	}
}
