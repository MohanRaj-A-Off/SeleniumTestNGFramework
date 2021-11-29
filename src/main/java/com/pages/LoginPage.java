package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.TestBase;

public class LoginPage extends TestBase {
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "txtUsername") WebElement username;
	@FindBy(id = "txtPassword") WebElement password;
	@FindBy(id = "btnLogin") WebElement login;
	
	
	public String validateTitle() {
		return driver.getTitle();
		}
		public DashBoardPages validateLogin(String a, String b) {
		//Capture the username and password
		//Perform the operation
		//Do not return anything
			username.sendKeys(a);
			password.sendKeys(b);
			login.click();
			return new DashBoardPages();
			
		}
}