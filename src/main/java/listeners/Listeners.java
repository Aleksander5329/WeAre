package listeners;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class Listeners extends TestListenerAdapter {

	
	public void onTestStart(ITestResult tr) {
		System.out.println("Test passed");
	}
	public void onTestFail(ITestResult tr) {
		System.out.println("Test failed");
	}
	public void onTestSkip(ITestResult tr) {
		System.out.println("Test skiped");
	}
}
