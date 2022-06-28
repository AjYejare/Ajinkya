package POJO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser {
    public static WebDriver openBrowser() {
	   // System.setProperty("webdriver.chrome.driver","D:\\\\Selenium\\\\New Version\\\\New\\\\chromedriver_win32 (1)\\\\chromedriver.exe");
    	WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://kite.zerodha.com/");
	    driver.manage().window().maximize();
	    return driver;
	}	

    
}
