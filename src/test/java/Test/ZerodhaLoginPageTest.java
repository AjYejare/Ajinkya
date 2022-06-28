package Test;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import POJO.Browser;
import POM.ZerodhaLoginPage;
import Utility.Parametrization;
import Utility.Report;


@Listeners(ListenersTest.class)
public class ZerodhaLoginPageTest extends BaseTest {
	
	ExtentReports reports;
	ExtentTest test;
	
	@BeforeMethod
	public void launchBbrowser() {
		driver = Browser.openBrowser();
	}
	
    @BeforeMethod
    public void extentReports() {
       reports = Report.createReport();	
    }
	
	@Test
	  public void loginWithValidCredentialsTest() throws Exception {
	    ZerodhaLoginPage zerodhaLoginPage = new ZerodhaLoginPage(driver);
	    String userName = Parametrization.ExcelSheet(0,1);
	    String password = Parametrization.ExcelSheet(1,1);
	    System.out.println(userName);
	    System.out.println(password);
	    zerodhaLoginPage.EnterUserID(userName);
	    zerodhaLoginPage.EnterPassword(password,driver);
	    zerodhaLoginPage.clickOnLoginPage();
	  }
	
	@Test
	  public void forgotPasswordLinkTest() {
		test = reports.createTest("forgotPasswordLinkTest");
		ZerodhaLoginPage zerodhaLoginPage = new ZerodhaLoginPage(driver);
		zerodhaLoginPage.clickOnForgotPassword();
	}
	
	@Test
	  public void signupLinkTest() {
		test = reports.createTest("signupLinkTest");
		ZerodhaLoginPage zerodhaLoginPage = new ZerodhaLoginPage(driver);
		zerodhaLoginPage.clickOnSignUpPage();
	}
	
	@AfterMethod
	public void closeBrowser(ITestResult result) {
		
		if(result.getStatus() == ITestResult.FAILURE) {
			test.log(Status.FAIL,result.getName());
		}
		else
			if(result.getStatus() == ITestResult.SUCCESS) {
				test.log(Status.PASS, result.getName());
		}
			else {
				test.log(Status.SKIP,result.getName());
			}
	}
	
	@AfterTest
	public void flushResult() {
		reports.flush();
	}
	
	
	
	
	
}