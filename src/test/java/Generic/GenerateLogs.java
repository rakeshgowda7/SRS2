package Generic;

//import org.apache.logging.log4j.core.Logger;
//import org.apache.log4j.Appender;
//import org.apache.log4j.BasicConfigurator;
//import org.apache.log4j.FileAppender;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.log4testng.Logger;


public class GenerateLogs {

	public static void main(String[] args) {
		WebDriver driver;
		Logger log =Logger.getLogger(GenerateLogs.class);
//		Logger log = Logger.getLogger(GenerateLogs.class); // Config the log4j
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\asrak\\Desktop\\Drivers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		log.info("Launching the browser successfully");
		driver.get("https://www.flipkart.com/");
		log.info("Enter the app url");
		System.out.println(driver.getTitle());
		log.info("Get the app title successfully");
		driver.quit();
		log.info("closing the browser successfully");
	}

}
