package POM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ZerodhaPinPage {
	
	@FindBy(xpath = "//input[@id='pin']")private WebElement pin;
	@FindBy(xpath = "//button[@type='submit']")private WebElement submit;
	@FindBy(xpath = "//a[text()='Forgot 2FA?']")private WebElement forgot;
    @FindBy(xpath = "//a[text()=\"Don't have an account? Signup now!\"]")private WebElement signup;
    
    public ZerodhaPinPage(WebDriver driver) {
    	PageFactory.initElements(driver, this);
    }
    
    public void enterPin(String pinNumber,WebDriver driver) {
    	WebDriverWait wait = new WebDriverWait(driver,Duration.ofMillis(2000));//Explicit wait
    	wait.until(ExpectedConditions.visibilityOf(pin));//will recheck the element in 500ms
    	pin.sendKeys(pinNumber);
    }
    
    public void clickOnContinue() {
    	submit.click();
    }
    public void clickOnForgot() {
    	forgot.click();
    }
    public void clickOnSignUp() {
    	signup.click();
    }
}
