package Test;

import java.io.IOException;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POJO.Browser;
import POM.ZerodhaHomePage;
import POM.ZerodhaLoginPage;
import POM.ZerodhaPinPage;
import Utility.Parametrization;

public class ZerodhaHomePageTest {
	
	WebDriver driver;
	
	@BeforeMethod
	public void luanchBrowser() {
		driver = Browser.openBrowser();
	}
	
	@Test
	public void loginToZerodhaWithPin() throws IOException, InterruptedException {
		ZerodhaLoginPage zerodhaLoginPage = new ZerodhaLoginPage(driver);
		String userName = Parametrization.ExcelSheet(0, 1);
		String password = Parametrization.ExcelSheet(1, 1);
		zerodhaLoginPage.EnterUserID(userName);
		zerodhaLoginPage.EnterPassword(password,driver);
		zerodhaLoginPage.clickOnLoginPage();
		
		Thread.sleep(2000);
		
		ZerodhaPinPage zerodhaPinPage = new ZerodhaPinPage(driver);
		String pin = Parametrization.ExcelSheet(2, 1);
		System.out.println(pin);
		zerodhaPinPage.enterPin(pin,driver);
		zerodhaPinPage.clickOnContinue();
		
		Thread.sleep(2000);
		ZerodhaHomePage zerodhaHomePage = new ZerodhaHomePage(driver);
		zerodhaHomePage.clickOnSearchbox();
		String company = Parametrization.ExcelSheet(3, 1);
		zerodhaHomePage.enterComapanyName(company);
		
		zerodhaHomePage.mouseAction(driver);
		zerodhaHomePage.clickOnIntraday(driver);
		zerodhaHomePage.clickOnMarket(driver);
		String qty = Parametrization.ExcelSheet(4, 1);
		zerodhaHomePage.enterQuantity(qty);
		zerodhaHomePage.enterOnSubmit();
	
	}

	
	
	

}
