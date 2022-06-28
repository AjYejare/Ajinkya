package POM;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZerodhaHomePage {
     
	
	@FindBy(xpath = "//input[@type='text']")private WebElement searchbox;
	@FindBy(xpath = "(//span[@class=\"tradingsymbol\"])[1]")private WebElement tatashares;
	@FindBy(xpath = "(//button[@class='button-blue'])[1]")private WebElement buy;
	@FindBy(xpath = "(//label[@class='su-radio-label'])[9]")private WebElement market;
	@FindBy(xpath = "//label[@for='radio-253']")private WebElement limit;
	@FindBy(xpath = "//label[@for='radio-255']")private WebElement stocklimit;
	@FindBy(xpath = "//label[@for='radio-256']")private WebElement stocklimitmarket;
	@FindBy(xpath = "(//label[@class='su-radio-label'])[7]")private WebElement intraday;
	@FindBy(xpath = "//label[@for='radio-171']")private WebElement longterm;
	@FindBy(xpath = "(//input[@type='number'])[1]")private WebElement quantity;
	@FindBy(xpath = "//button[@class='submit']")private WebElement submit;
	
    public ZerodhaHomePage(WebDriver driver) {
    	PageFactory.initElements(driver,this);
        }
    public void clickOnSearchbox() {
    	searchbox.click();
        }
    public void enterComapanyName(String company) {
    	searchbox.sendKeys(company);
        }
    public void mouseAction(WebDriver driver) throws InterruptedException {
    	Actions action = new Actions(driver);
    	Thread.sleep(2000);
    	action.moveToElement(tatashares).perform();
    	Thread.sleep(2000);
    	action.moveToElement(buy);
    	action.click();
    	action.perform();
        }
     public void clickOnIntraday(WebDriver driver) throws InterruptedException{
    	Actions action = new Actions(driver);
    	Thread.sleep(2000);
     	action.moveToElement(intraday).perform();
     	intraday.click();
    	action.perform();
        }
    public void clickOnMarket(WebDriver driver) {
    	Actions action = new Actions(driver);
    	action.moveToElement(market).perform();
    	market.click();
    	action.perform();
        }
    public void enterQuantity(String qty) {
    	quantity.clear();
    	quantity.sendKeys(qty);
        }
    public void enterOnSubmit() {
    	submit.click();
        }
    
    
}
