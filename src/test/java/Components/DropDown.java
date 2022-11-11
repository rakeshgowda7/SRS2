package Components;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\asrak\\\\Desktop\\\\Drivers\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://the-internet.herokuapp.com/dropdown");
		WebElement ele = driver.findElement(By.xpath("//select[@id='dropdown']"));
		Select s1 = new Select(ele);
		List<WebElement> str = s1.getOptions();
		int count = str.size();
		System.out.println(count);
		s1.selectByIndex(2);
		Thread.sleep(2000);
//		s1.deselectByIndex(1);
//		Thread.sleep(2000);

		Boolean dropdown = s1.isMultiple();
		if (dropdown) {
//			s1.deselectAll();
			System.out.println("This is Multi-select dropdown");
		} else {
			System.out.println("This is Single select dropdown");
		}
		s1.selectByVisibleText("Option 1");
		Actions act = new Actions(driver);
		
		
		Robot r= new Robot();
		r.keyPress(KeyEvent.VK_R);
		r.keyRelease(KeyEvent.VK_R);
		
		

	}

}
