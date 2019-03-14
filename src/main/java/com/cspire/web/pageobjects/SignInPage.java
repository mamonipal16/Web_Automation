package com.cspire.web.pageobjects;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cspire.web.base.TestBase;

public class SignInPage extends TestBase {
//Page Factory
	@FindBy(name="username")
	WebElement UserName;
	@FindBy(name="password")
	WebElement PassWord;
	@FindBy(xpath="//input[@id='input-submit' and @value='Sign In']")
	WebElement SignInButton;
//Constructor
	public SignInPage() throws IOException {
		PageFactory.initElements(driver, this);
	}
//Actions
	/*public HomePage signInAction(String un, String pw) {
		UserName.sendKeys(un);
		PassWord.sendKeys(pw);
		SignInButton.click();
		return new HomePage();
	}*/

}
