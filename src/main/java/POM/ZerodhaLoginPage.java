package POM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class ZerodhaLoginPage {
	
	@FindBy(xpath = "//input[@id='userid']")private WebElement userId;
	@FindBy(xpath = "//input[@id='password']")private WebElement password;
	@FindBy(xpath = "//button[@type='submit']")private WebElement login;
	@FindBy(xpath = "//a[text()=\"Forgot user ID or password?\"]")private WebElement forgot;
	@FindBy(xpath = "//a[text()=\"Don't have an account? Signup now!\"]")private WebElement signUp;
	
	public ZerodhaLoginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public void EnterUserID(String user) {
		userId.sendKeys(user);
	}
	public void EnterPassword(String pass,WebDriver driver) {
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);
		wait.withTimeout(Duration.ofMillis(20000));
		wait.pollingEvery(Duration.ofMillis(2000));
		wait.ignoring(Exception.class);
		wait.until(ExpectedConditions.visibilityOf(password));
		password.sendKeys(pass);
	}
	public void clickOnLoginPage( ) {
		login.click();
	}
	public void clickOnForgotPassword() {
		forgot.click();
	}
	public void clickOnSignUpPage() {
		signUp.click();
	}
	
	}
