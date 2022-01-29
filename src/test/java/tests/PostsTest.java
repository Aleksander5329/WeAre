package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.HomePage;
import navigate.*;

public class PostsTest extends Base {
	
	@Test(priority = 1)
	public void openProfilePage() throws InterruptedException  {
		Nav n = new Nav(driver);
//		n.SignIn();
		System.out.println("Home page is opened");
	}

	
	@Test(priority = 2)
	public void viewPost() throws InterruptedException {
		HomePage hp = new HomePage(driver);
		Nav n = new Nav(driver);
		n.SignIn();
		hp.clicklatestPostBtn();
		n.clickExplorePostBtn();
		n.clickShowCommentsBtn();
		hp.clickHomeBtb();
		n.clicklogOutBtn();
	}
	@Test(priority = 3)
	public void addPost() throws InterruptedException  {
		HomePage hp = new HomePage(driver);
		Nav n = new Nav(driver);
		n.SignIn();
		hp.clickAddPostBtn();
		n.setNewPost("Message");
		n.clickNewPostPublic();
		n.clickSavePostBtn();
		System.out.println("New post saved");
		hp.clickHomeBtb();
		n.clicklogOutBtn();
	}
	@Test(priority = 4)
	public void editPost() throws InterruptedException  {
		HomePage hp = new HomePage(driver);
		Nav n = new Nav(driver);
		n.SignIn();
		hp.clicklatestPostBtn();
		n.clickExplorePostBtn();
		String actual = n.EditPostBtnVisable();
		String expected = "Edit post";
		Assert.assertEquals(actual, expected);
		String actual1 = n.DeletePostBtnVisable();
		String expected1 = "Delete post";
		Assert.assertEquals(actual1, expected1);
		System.out.println("Delte post button is visible");
		n.clickEditPostBtn();
		n.setNewPost("This is a newly edited post");
		n.clickNewPostPrivate();
		WebElement chooseFile = driver.findElement(By.id("imagefile"));
		chooseFile.sendKeys("C:\\Users\\SnuSnu\\Desktop\\WeAre\\src\\test\\resources\\resources\\sampleImage.jpg");
		System.out.println("Uploaded Image");
		Thread.sleep(100);
		n.clickSavePostBtn();
		Thread.sleep(100);
		System.out.println("Saving new post");
		hp.clickHomeBtb();
		n.clicklogOutBtn();
	}
	@Test(priority = 5)
	public void deletePost() throws InterruptedException  {
		HomePage hp = new HomePage(driver);
		Nav n = new Nav(driver);
		n.SignIn();
		hp.clicklatestPostBtn();
		n.clickExplorePostBtn();
		n.clickDeletePostBtn();
		n.clickDeletePostConformation();
		n.clickDeletePostSubmit();
		System.out.println("Post deleted");
		hp.clickHomeBtb();
		n.clicklogOutBtn();
		
	}
}
