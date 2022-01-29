package data;

import org.testng.annotations.DataProvider;

public class DataSet {
	@DataProvider
	public Object[][] dataSetOne() {
		return new Object[][] { { "UniqueUser", "Unique@email.si", "123456", "123456" } };

	}

	@DataProvider
	public Object[][] dataSetTwo() {
		return new Object[][] { { "UserTwo", "test2@email.si", "123", "123456" } };

	}

	@DataProvider
	public Object[][] dataSetThree() {
		return new Object[][] { { "UserTwo", "test2@email.si", "1", "1" } };
	}
	@DataProvider
	public Object[][] setProfileData() {
		return new Object[][] { { "UserTwo", "test2@email.si", "1", "1" } };
	}
}
