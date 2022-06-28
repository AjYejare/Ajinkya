package Test;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

import Utility.ScreenShot;

public class ListenersTest extends BaseTest implements ITestListener{
	
	public void onTestStart (ITestResult result) {
		
		System.out.println(result.getName()+ "Test has Started");
		
	}
	
	public void onTestFailure(ITestResult result) {
		try {
			ScreenShot.takesscreenshot(driver, result.getName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		}
	}

