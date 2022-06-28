package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZerodhaSignupPage {
	
	@FindBy(xpath = "(//a[text()='Signup'])[1]")private WebElement signup;
	@FindBy(xpath = "//input[@id='user_mobile']")private WebElement mobnumber;
	@FindBy(xpath = "//button[@type='submit']")private WebElement submit;
	@FindBy(xpath = "//a[text()='Want to open an NRI account?']")private WebElement nriaccount;
	
	public ZerodhaSignupPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnSignUp() {
		signup.click();
	}
	
	public void enterMobNumber(String mobnum) {
		mobnumber.sendKeys(mobnum);
	}
	
	public void clickOnSubmit() {
		submit.click();
	}
	
	public void clickOncCreateNRIaccount() {
		nriaccount.click();
	}

}
