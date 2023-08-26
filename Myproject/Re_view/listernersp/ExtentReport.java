package listernersp;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReport {

	public static void main(String[] args) {
	
			ExtentSparkReporter reporter=new ExtentSparkReporter("./report/selenium.html");
			reporter.config().setDocumentTitle("sample report");
			reporter.config().setTheme(Theme.STANDARD);
			ExtentReports report=new ExtentReports();
			report.attachReporter(reporter);
			report.setSystemInfo("platform","windows");
			report.setSystemInfo("author","Lidiya");
			ExtentTest Logger = report.createTest("Sample Test");
			Logger.log(Status.FAIL,"This is failed");
			Logger.log(Status.INFO,"this is informations");
			Logger.log(Status.PASS,"This is passed");
			Logger.addScreenCaptureFromPath("C:\\Users\\Lidiya\\eclipse-workspace\\SeleniumCombinedframework\\errorshots\\api 2023-08-04T12-25-37.359.png");
			ExtentTest Logger1 = report.createTest("Demo Test");
			Logger1.log(Status.FAIL,"This is failed demo");
			Logger1.log(Status.INFO,"This is informations demo");
			Logger1.log(Status.PASS,"This is passed demo");
			System.out.println("done");
			report.flush();
		}

	}


