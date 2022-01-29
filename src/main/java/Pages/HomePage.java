package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import navigate.Action;
import tests.Base;

public class HomePage extends Base{
	
	Action act = new Action();
	public void waitElement(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver,5);
		wait.until(ExpectedConditions.visibilityOf(element));
}
		
	
	@FindBy(xpath = "//a[normalize-space()='Home']") 
	WebElement homeBtn;
	
	@FindBy(xpath = "//a[contains(text(),'Personal')]") 
	WebElement pProfileBtn;
	
	@FindBy(xpath = "//a[normalize-space()='Latest Posts']") 
	WebElement latestPostBtn;
	
	@FindBy(xpath = "//a[contains(text(),'Add New')]") 
	WebElement addPostBtn;
	
	@FindBy(xpath = "//a[contains(text(),'LOGOUT')]") 
	WebElement logOutBtn;
	
	@FindBy(id = "searchParam2")
	WebElement searchBar;
	
	@FindBy(xpath = "//button[normalize-space()='Search']")
	WebElement clickSearchBtn;
	
	@FindBy(xpath = "//input[@id='searchParam1']")
	WebElement searchByProfesion;
	
	@FindBy(xpath = "//input[@id='searchParam1']")
	WebElement clickSearchByProfesion;
	
	@FindBy(xpath = "//div[@id='ftco-nav']//a[normalize-space()='REGISTER']")
	WebElement clickRegisterBtn;
	
	@FindBy(xpath = "//h3[contains(text(),'There are no users existing in this search criteri')]")
	WebElement errorMsg;
	
	public void errorMsg() {
		waitElement(errorMsg);
		String actual = errorMsg.getText();
		String expected = "There are no users existing in this search criteria."; 
		Assert.assertEquals(actual, expected);
	}
	
	@SuppressWarnings("static-access")
	public void clickRegisterBtn() {
		waitElement(clickRegisterBtn);
		act.clickOn(clickRegisterBtn);
	}
	
	@SuppressWarnings("static-access")
	public void clickHomeBtb() {
		waitElement(homeBtn);
		act.clickOn(homeBtn);
	}
	@SuppressWarnings("static-access")
	public void clickpProfileBtn() {
		waitElement(pProfileBtn);
		act.clickOn(pProfileBtn);
	}
	@SuppressWarnings("static-access")
	public void clickAddPostBtn() {
		waitElement(addPostBtn);
		act.clickOn(addPostBtn);
	}
	@SuppressWarnings("static-access")
	public void clicklogOutBtn() {
		waitElement(addPostBtn);
		act.clickOn(logOutBtn);
	}
	@SuppressWarnings("static-access")
	public void clicklatestPostBtn() {
		waitElement(latestPostBtn);
		act.clickOn(latestPostBtn);
	}
	
	public void searchBar(String k) {
		waitElement(searchBar);
		searchBar.sendKeys(k);;
	}
	@SuppressWarnings("static-access")
	public void clickSearchBtn() {
		waitElement(clickSearchBtn);
		act.clickOn(clickSearchBtn);
	}
	public void searchByProfesion(String k) {
		waitElement(searchByProfesion);
		searchByProfesion.sendKeys(k);
	}
	@SuppressWarnings("static-access")
	public void clickSearchByProfesion() {
		waitElement(clickSearchByProfesion);
		act.clickOn(clickSearchByProfesion);
	}
	
	public HomePage(WebDriver d){
		PageFactory.initElements(d, this);
	}
	
	
	
	public void OpenProfilePage() throws InterruptedException {
		
		EditPofilePage ep = new EditPofilePage(driver);
		ep.clickEditBtn();
		ep.clickEditBtn();
		ep.assertPageNavigated();
		Thread.sleep(100);
	}
}
