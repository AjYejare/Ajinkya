package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZerodhaForgotPasswordPage {
	
	@FindBy(xpath = "(//label[@class='su-radio-label'])[1]")private WebElement rememberid;
	@FindBy(xpath = "//label[@for='radio-32']")private WebElement forgotid;
	@FindBy(xpath = "//label[@placeholder='User ID']")private WebElement userid;
	@FindBy(xpath = "//input[@placeholder='PAN']")private WebElement pannumber;
	@FindBy(xpath = "//label[@for='radio-36']")private WebElement emailbutton;
	@FindBy(xpath = "//label[@for='radio-37']")private WebElement smsbutton;
	@FindBy(xpath = "//input[@placeholder='E-mail (as on account)']")private WebElement emailid;
	@FindBy(xpath = "//input[@placeholder='E-mail (as on account)']")private WebElement mobnumber;
	@FindBy(xpath = "//a[@class='text-xsmall text-light reset-account-button']")private WebElement backtologin;
	
	
	public ZerodhaForgotPasswordPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clikOnRememberId() {
		rememberid.click();
	}
	
	public void clickOnForgotId() {
		forgotid.click();
	}
	
	public void enterUserID(String user) {
		userid.sendKeys(user);
	}
	
	public void enterPAN(String pan) {
		pannumber.sendKeys(pan);
	}
	
	public void clickOnEmailButton() {
		emailbutton.click();
	}
	
	public void clickOnSmsButton() {
		smsbutton.click();
	}
	
	public void enterEmail(String email) {
		emailid.sendKeys(email);
	}
	
	public void enterMobNumber(String mobnum) {
		mobnumber.sendKeys(mobnum);
	}
	
	public void backToLogin() {
		backtologin.click();
	}

}
