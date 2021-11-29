package com.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.base.TestBase;
import com.pages.DashBoardPages;
import com.pages.LoginPage;

public class LoginPageTest extends TestBase {
	LoginPage lp ;
	DashBoardPages dp;
	
	
	
	@BeforeMethod
	public void setup() {
	initialization();
	lp = new LoginPage();
	
	}
	
	
	
	@Test(enabled = false)
	public void validateTitleTest() {
	String expectedTitle = "OrangeHRM";
	String actualTitle = lp.validateTitle();
	Assert.assertEquals(actualTitle, expectedTitle);
	}
	
	
	@Test(enabled = false)
	public void validateLoginTest() {
	//Read the username and password from property file
	//Call the validatelogin method
		String user = prop.getProperty("username");
		String pass = prop.getProperty("password");
		dp = lp.validateLogin(user, pass);
		if (dp!=null)
			Assert.assertTrue(true);
		else
			Assert.assertTrue(false);
	}
	
	
	@Test
	@Parameters({"uname" ,"pwd"})
	public void validateLoginTestUsingParameter(String uname, String pwd)
	{
		dp = lp.validateLogin(uname, pwd);
		
	}
	
	
	
	
	
	@AfterMethod
	public void closesetup() {
	teardown();
	}
}