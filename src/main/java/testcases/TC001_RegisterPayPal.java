package testcases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.HomePage;
import wdMethods.ProjectMethods;

public class TC001_RegisterPayPal extends ProjectMethods {
	@BeforeTest
	public void setData() {
		testCaseName="TC001_RegisterPayPal";
		testDescription="Register a new account in PayPal";
		testNodes="PayPal";
		category="Smoke";
		authors="Bharath";
		browserName="chrome";
		dataSheetName="TC001";
	}
	@Test(dataProvider="fetchData")
	public void registerPayPal(String country,String mailID,String password) {
		new HomePage()
		.clickSignUp()
		.verifyAndClickShoppers()
		.clickNext()
		.selectCountry(country)
		.enterMailID(mailID)
		.enterPassword(password)
		.enterConfirmPassword(password)
		.clickContinue();
	}
}
