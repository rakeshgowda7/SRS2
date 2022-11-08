package Generic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadProp {

	public static void main(String[] args) throws IOException {
		WebDriver driver;
		Properties p = new Properties();
		// Specify the path of the property file
		FileInputStream fis = new FileInputStream("C:\\Users\\asrak\\Desktop\\eclipse\\SRS2\\config.properties");
		p.load(fis); // load the file data
		System.out.println(p.getProperty("browser"));// To get the value from property file
		String browsername = p.getProperty("browser");
		if (browsername.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\asrak\\Desktop\\Drivers\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get(p.getProperty("url"));
			driver.findElement(By.xpath(p.getProperty("mailID"))).sendKeys(p.getProperty("username"));
			driver.findElement(By.xpath(p.getProperty("pwd"))).sendKeys(p.getProperty("pwd"));
			driver.findElement(By.xpath(p.getProperty("loginBtn"))).click();
		} else {
			System.out.println("Launching the Firefox");
		}

	}

}
