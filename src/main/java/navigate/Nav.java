package navigate;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import tests.Base;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class Nav extends Base {
	
	Action act = new Action();

	
	@FindBy(xpath = "//input[@value='New Friend Requsts']") 
	WebElement friendRequestBtn;
	
	@FindBy(xpath = "//input[@value='Approve Request']") 
	WebElement approveFriendBtn;
	
	@FindBy(xpath = "//input[@value='disconnect']") 
	WebElement removeFriendBtn;
	
	@FindBy(xpath = "//input[@value='connect']") 
	WebElement connectBtn;
	
	@FindBy(xpath = "//a[contains(text(),'Explore this')]") 
	WebElement clickExplorePostBtn;
	
	@FindBy(xpath = "//button[normalize-space()='Show Comments']") 
	WebElement clickShowCommentsBtn;
	
	@FindBy(id = "message") 
	WebElement setNewPost;
	
	@FindBy(xpath = "//option[@value='true']") 
	WebElement setNewPostPublic;
	
	@FindBy(xpath = "//option[@value='false']") 
	WebElement setNewPostPrivate;
	
	@FindBy(xpath = "//input[@value='Save post']") 
	WebElement clickSavePostBtn;
	
	@FindBy(xpath = "//a[normalize-space()='Edit post']") 
	WebElement clickEditPostBtn;
	
	@FindBy(xpath = "//a[normalize-space()='Edit post']") 
	WebElement EditPostBtnVisable;
	
	@FindBy(xpath = "//a[normalize-space()='Delete post']") 
	WebElement DeletePostBtnVisable;
	
	@FindBy(xpath = "//a[normalize-space()='Delete post']") 
	WebElement clickDeletePostBtn;
	
	@FindBy(xpath = "//option[@value='true']	") 
	WebElement clickDeletePostConformation;
	
	@FindBy(xpath = "//input[@value='Submit']") 
	WebElement clickDeletePostSubmit;
	
	public void waitElement(WebElement element) {
			WebDriverWait wait = new WebDriverWait(driver,5);
			wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	public void clickDeletePostSubmit() {
		waitElement(clickDeletePostSubmit);
		clickDeletePostSubmit.click();
	}
	
	public void clickDeletePostConformation() {
		waitElement(clickDeletePostConformation);
		clickDeletePostConformation.click();
	}
	
	public void clickDeletePostBtn() {
		waitElement(clickDeletePostBtn);
		clickDeletePostBtn.click();
	}
	
	public String DeletePostBtnVisable() {
		waitElement(DeletePostBtnVisable);
		return DeletePostBtnVisable.getText();
	}
	
	public String EditPostBtnVisable() {
		waitElement(EditPostBtnVisable);
		return EditPostBtnVisable.getText();
	}
	
	public void clickEditPostBtn() {
		waitElement(clickEditPostBtn);
		clickEditPostBtn.click();
	}
	
	public void clickSavePostBtn() {
		waitElement(clickSavePostBtn);
		clickSavePostBtn.click();
	}
	
	public void clickNewPostPrivate() {
		waitElement(setNewPostPrivate);
		setNewPostPrivate.click();
	}
	
	public void clickNewPostPublic() {
		waitElement(setNewPostPublic);
		setNewPostPublic.click();
	}
	
	public void setNewPost(String k) {
		waitElement(setNewPost);
		setNewPost.sendKeys(k);
	}
	
	@SuppressWarnings("static-access")
	public void clickShowCommentsBtn() {
		waitElement(clickShowCommentsBtn);
		act.clickOn(clickShowCommentsBtn);
	}
	
	@SuppressWarnings("static-access")
	public void clickExplorePostBtn() {
		waitElement(clickExplorePostBtn);
		act.clickOn(clickExplorePostBtn);
	}
	@SuppressWarnings("static-access")
	public void clickConnectBtn() {
		waitElement(connectBtn);
		act.clickOn(connectBtn);
	}
	
	@SuppressWarnings("static-access")
	public void clickRemoveFriendBtn() {
		waitElement(removeFriendBtn);
		act.clickOn(removeFriendBtn);
	}
	
	public void clickApproveFriendBtn() {
		waitElement(approveFriendBtn);
		approveFriendBtn.click();
	}
	
	@SuppressWarnings("static-access")
	public void clickFriendRequestBtn() {
		waitElement(friendRequestBtn);
		act.clickOn(friendRequestBtn);
//		friendRequestBtn.click();
	}
	@FindBy(xpath = "//a[contains(text(),'LOGOUT')]") 
	WebElement logOutBtn;
	
	@SuppressWarnings("static-access")
	public void clicklogOutBtn() {
		waitElement(logOutBtn);
		act.clickOn(logOutBtn);
	}
	
	public Nav(WebDriver d){
		
		PageFactory.initElements(d, this);
	}
	
	
	@FindBy(id = "username")
	WebElement userName;

	@FindBy(id = "password")
	WebElement password;

	@FindBy(xpath = "//input[@value='Login']")
	WebElement Login;
	@FindBy(xpath = "//a[contains(text(),'SIGN')]") 
	WebElement SignInBtn;
	
	
	@SuppressWarnings("static-access")
	public void SignIn() throws InterruptedException  {
		
		waitElement(SignInBtn);
		act.clickOn(SignInBtn);
		
		waitElement(userName);
		userName.sendKeys("UniqueUser");
		waitElement(password);
		password.sendKeys("123456");
		
		waitElement(Login);
		act.clickOn(Login);
}
	
	
	@FindBy(xpath = "//a[contains(text(),'Personal')]") 
	WebElement pProfileBtn;
	@FindBy(xpath = "//a[contains(text(),'edit')]") 
	WebElement clickEditBtn;
	@FindBy(xpath = "//h4[normalize-space()='Personal Profile']") 
	WebElement assertPageNavigated;
	public void assertPageNavigated() {
		waitElement(assertPageNavigated);
		assertPageNavigated.isDisplayed();
	}
	

	@SuppressWarnings("static-access")
	public void OpenProfilePage() throws InterruptedException {
		act.clickOn(pProfileBtn);
		act.clickOn(clickEditBtn);
		assertPageNavigated();
	}
	
	@FindBy(xpath = "//div[@id='ftco-nav']//a[normalize-space()='REGISTER']") 
	WebElement RegBtn;
	@FindBy(xpath = "//body/nav[@id='ftco-navbar']/div[1]/div[1]/ul[1]/li[1]/a[1]")
	WebElement clickRegisterBtn;
	@SuppressWarnings("static-access")
	
	public void clickRegisterBtn() {
		waitElement(clickRegisterBtn);
		act.clickOn(clickRegisterBtn);
	}
	
	@SuppressWarnings("static-access")
	public void OpenRegistrationPage() {
		act.clickOn(clickRegisterBtn);
		driver.findElement(By.xpath("//h1[contains(text(),'Join our community')]")).isDisplayed();
	}
	
}
