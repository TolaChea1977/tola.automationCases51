package testingClass_51Cases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Utilities.BaseClass;
import tola.automationTesting.pages.MyAccountLoginPage;

public class myAccountLoginTests {
	
	MyAccountLoginPage my = new MyAccountLoginPage();
	
	@BeforeMethod
	public void setUp() throws InterruptedException {
		BaseClass.getDriver();
		Thread.sleep(2000);
		my.myAccountMenu.click();
		
//		BaseClass.getDriver().navigate().back();
//		BaseClass.getDriver().navigate().forward();
		
	}
	
	@Test (enabled = true)
	public void loginWithUserNameAndPassword() {
		
		
		
	}
	
	/*1) Open the browser
	2) Enter the URL “http://practice.automationtesting.in/”
	3) Click on My Account Menu
	4) Enter registered username in username textbox
	5) Enter password in password textbox
	6) Click on login button
	7) User must successfully login to the web page
	 * */

}
