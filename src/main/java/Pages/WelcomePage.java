package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import navigate.Action;
import tests.Base;

public class WelcomePage extends Base {

	public WebDriver driver;

	@FindBy(xpath = "//div[@id='ftco-nav']//a[normalize-space()='REGISTER']")
	WebElement RegBtn;

	@FindBy(xpath = "//a[contains(text(),'SIGN')]")
	WebElement SignInBtn;

	@FindBy(xpath = "//a[normalize-space()='Home']")
	WebElement HomeBtn;

	@FindBy(xpath = "//a[normalize-space()='Latest Posts']")
	WebElement LatestPostsBtn;

	@FindBy(xpath = "//a[normalize-space()='About us']")
	WebElement AboutUsBtn;

	Action act = new Action();

	public void waitElement(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	@SuppressWarnings("static-access")
	public void clickRegBtb() {
		waitElement(RegBtn);
		act.clickOn(RegBtn);
	}

	@SuppressWarnings("static-access")
	public void clickSignInBtn() {
		waitElement(SignInBtn);
		act.clickOn(SignInBtn);
	}

	@SuppressWarnings("static-access")
	public void clickHomeBtn() {
		waitElement(HomeBtn);
		act.clickOn(HomeBtn);
	}

	@SuppressWarnings("static-access")
	public void clickLatestPostsBtn() {
		waitElement(LatestPostsBtn);
		act.clickOn(LatestPostsBtn);
		LatestPostsBtn.click();
	}

	@SuppressWarnings("static-access")
	public void AboutUsBtn() {
		waitElement(AboutUsBtn);
		act.clickOn(AboutUsBtn);
	}

	public WelcomePage(WebDriver d) {
		PageFactory.initElements(d, this);
	}
}
