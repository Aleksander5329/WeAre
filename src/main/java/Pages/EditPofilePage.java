package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import tests.Base;


public class EditPofilePage extends Base{

	
	
	public void waitElement(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOf(element));
}

	
	@FindBy(xpath = "//h4[normalize-space()='Personal Profile']") 
	WebElement PersonalInfoBtn;

	@FindBy(id = "nameE") 
	WebElement nameE;
	
	@FindBy(id = "lastnameE") 
	WebElement lastnameE;
	
	@FindBy(id = "birthDayE") 
	WebElement birthDayE;
	
	@FindBy(id = "selectE") 
	WebElement dropDownGender;
	
	@FindBy(xpath = "//option[@value='MALE']") 
	WebElement dropDownGenderSelect;
	
	@FindBy(id = "publicinfoE") 
	WebElement publicinfoE;
	
	@FindBy(id = "selectC") 
	WebElement city;
	
	@FindBy(xpath = "//option[contains(text(),'Plovdiv')]") 
	WebElement setCity;
	
	@FindBy(xpath = "//button[contains(text(),'Update My')]") 
	WebElement updateProfBtn;
	
	@FindBy(id = "category.id") 
	WebElement workplace;
	
	@FindBy(xpath = "//form[@role='form']//div//div//div//button[@name='submit'][normalize-space()='Update']") 
	WebElement setWorkplace;
	
	@FindBy(id = "skill1") 
	WebElement setService;
	
	@FindBy(id = "startTime") 
	WebElement setAvailability;
	
	@FindBy(xpath = "//form[@id='profile-resource']//div//div//button[@name='submit'][normalize-space()='Update']") 
	WebElement updateAvailabilityBtn;
	
	@FindBy(xpath = "//option[@value='true']") 
	WebElement clickPrivate;
	
	@FindBy(xpath = "//div[@id='settings']//div//div//div//div//form[@role='form']//div//div//button[@name='submit'][normalize-space()='Update']") 
	WebElement clickUpdatePictureBtb;
	
	@FindBy(xpath = "//a[contains(text(),'edit')]") 
	WebElement clickEditBtn;
	
	@FindBy(xpath = "//h4[normalize-space()='Personal Profile']") 
	WebElement assertPageNavigated;
	
	public void assertPageNavigated() {
		waitElement(assertPageNavigated);
		assertPageNavigated.isDisplayed();
	}
	
	public void clickEditBtn() {
		waitElement(clickEditBtn);
		clickEditBtn.click();
	}
	public String PersonalInfoBtn() {
		return PersonalInfoBtn.getText();
	}
	
	public void clickUpdatePictureBtb() {
		waitElement(clickUpdatePictureBtb);
		clickUpdatePictureBtb.click();
	}
	
	public void setName(String k) {
		nameE.clear();
		waitElement(nameE);		
		nameE.sendKeys(k);
	}
	public void setLastName(String k) {
		
		waitElement(lastnameE);
		lastnameE.clear();
		lastnameE.sendKeys(k);
	}
	public void setBirthDay(String k) {
		waitElement(birthDayE);
		birthDayE.sendKeys(k);
	}
	public void dropDownGender() {
		waitElement(dropDownGender);
		dropDownGender.click();
	}
	public void dropDownGenderSelect() {
		waitElement(dropDownGenderSelect);
		dropDownGenderSelect.click();
	}
	public void setPersonalInfo(String k) {
		waitElement(publicinfoE);
		publicinfoE.clear();
		publicinfoE.sendKeys(k);
	}
	public void clickCity() {
		waitElement(city);
		city.click();
	}
	public void setCity() {
		waitElement(setCity);
		setCity.click();
	}
	public void clickUpdtBtn1() {
		waitElement(updateProfBtn);
		updateProfBtn.click();
	}
	public void clickWorkplace(String k) {
		waitElement(workplace);
		workplace.sendKeys(k);
	}
	public void setService(String k) {
		waitElement(setService);
		setService.sendKeys(k);
	}
	
	public void setAvailability(String k) {
		waitElement(setAvailability);
		setAvailability.clear();
		setAvailability.sendKeys(k);
	}
	public void updateAvailabilityBtn() {
		waitElement(updateAvailabilityBtn);
		updateAvailabilityBtn.click();
	}
	
	public void clickPrivate() {
		waitElement(clickPrivate);
		clickPrivate.click();
	}
	public EditPofilePage(WebDriver d) {
		
		PageFactory.initElements(d, this);
	}
	
}
