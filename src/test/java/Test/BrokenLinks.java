package Test;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import POJO.Browser;

public class BrokenLinks {
	
	public static void main(String[] args) {
		
        String url;
		String homePage="https://www.zlti.com";
		WebDriver driver = Browser.openBrowser(homePage);
		
		List<WebElement> li = driver.findElements(By.tagName("a"));
		
		Iterator<WebElement> it = li.iterator();
		
		while (it.hasNext()) {
			url= it.next().getAttribute("href");
			
			if(url==null) {
				System.out.println("url is invalid");
				continue;}
				
				if(url.isEmpty()) {
					System.out.println("url is empty");
					continue;
				}
				
				try {
					URL u = new URL(url);
					
					HttpURLConnection huc = (HttpURLConnection)u.openConnection();
					
					huc.setRequestMethod("HEAD");
					huc.connect();
					
					int responsecode = huc.getResponseCode();
					System.out.println(responsecode);
					
					if(responsecode>=400) {
						System.out.println(url+ "link is broken");
							
						}
					else {
						System.out.println(url+ "link is working");
						}
				}
					catch(Exception e) {
            }
		}
	}
}


