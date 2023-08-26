package log4jdemo;



import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoggingDemo {

	public static void main(String[] args) {
		BasicConfigurator.configure();
		PropertyConfigurator.configure("src/log4jdemo/log4j.properties");
		
		System.setProperty("webdriver.chrome.driver", "src/driver_1/chromedriver.exe"); 
		WebDriver driver = new ChromeDriver();		
		
		Logger log=Logger.getLogger(LoggingDemo.class);
		
		driver.get("https://www.google.com/");
		log.debug("opening website");
		driver.manage().window().maximize();
		log.debug("maximizing website");
		log.info("maximizing website1");
		

	}

}
