package navigate;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import tests.Base;

public class Action extends Base {
	
		public void sendKeys(WebDriver driver1, WebElement element, String value){
		new WebDriverWait(driver1, 10).until(ExpectedConditions.visibilityOf(element));
		element.sendKeys(value);
		}
		
		public static void clickOn(WebElement element){
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", element);
		}
}
