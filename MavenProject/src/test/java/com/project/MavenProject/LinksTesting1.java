package com.project.MavenProject;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LinksTesting1 extends BaseTest 
{

	
	@BeforeMethod
	@Parameters("browser")
	public void setup(String browserType) throws Exception
	{
		loadData();
		launch(browserType);
		navigateUrl("linktexturl");
	}
	
	
	@Test
	public void linktesting1()
	
	 {
		String expval="Google Images";
		
		driver.findElement(By.linkText("Images")).click();	
		Reporter.log("Clicked on Image Link");
		String actval=driver.getTitle();
		
		Assert.assertEquals(actval, expval);
		
	 }
	
	@AfterMethod
	public void tearDown()
	{
		closeBrowser();
	}

}
