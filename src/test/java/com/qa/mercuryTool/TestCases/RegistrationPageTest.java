package com.qa.mercuryTool.TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.qa.mercuryTool.base.TestBase;
import com.qa.mercuryTool.pages.HomePage;
import com.qa.mercuryTool.pages.RegistrationPage;

public class RegistrationPageTest extends TestBase {
	HomePage homePage;
	RegistrationPage registrationPage;

	public RegistrationPageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		homePage = new HomePage();
		registrationPage = new RegistrationPage();
	}

	@Test
	public void registrationPageTest() {
		registrationPage = homePage.goToRegistrationPage();
		boolean response = registrationPage.validateRegistrationPage();
		Assert.assertEquals(response, true);
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}

}
