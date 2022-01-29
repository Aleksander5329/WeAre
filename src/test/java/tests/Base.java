package tests;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import listeners.*;
import navigate.Nav;
import Pages.*;
import io.github.bonigarcia.wdm.WebDriverManager;

@Listeners(listeners.Listener.class)

public class Base {

	ExtentHtmlReporter htmlReporter;
	public static WebDriver driver;
	public static Properties prop = new Properties();
	public static FileReader fr;
	@SuppressWarnings("deprecation")
//	@Parameters("browser")
	@BeforeTest
	public void openBrowser() throws InterruptedException, IOException { // String browser !!!!!!!!!
//		String browser

		if (driver == null) {
			FileReader fr = new FileReader("C:\\Users\\SnuSnu\\Desktop\\WeAre\\src\\test\\resources\\resources\\config.properties");
			prop.load(fr);
		}
		if (prop.getProperty("browser").equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.get(prop.getProperty("base.url"));
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		} else if (prop.getProperty("browser").equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.get(prop.getProperty("base.url"));
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		}

	}

	@AfterTest
	public void tearDown() {
		driver.close();
//		driver.quit();

	}

}
