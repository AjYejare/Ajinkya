package Utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Report {
	
	public static ExtentReports createReport() {
		 
		ExtentSparkReporter htmlReport = new ExtentSparkReporter("extentReport.html");
		
		ExtentReports reports = new ExtentReports();
		reports.attachReporter(htmlReport);
		reports.setSystemInfo("Regression","Zerodha");
		reports.setSystemInfo("Browser","Chrome");
		return reports;
	}

}
