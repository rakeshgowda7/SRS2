package Components;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class PopUps {

	@Test
	public void test1() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\asrak\\\\Desktop\\\\Drivers\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
		wait.until(ExpectedConditions.alertIsPresent());
//	WebElement ele = driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
//		Point l1 = ele.getLocation();
//		l1.getX();
		Alert a = driver.switchTo().alert();
		a.accept();
		String text = driver.findElement(By.xpath("//p[@id='result']")).getText();
//		Assert.assertEquals(text, "You successfully clicked an alert1");

		SoftAssert sa = new SoftAssert();
		sa.assertEquals(12, 13);
		System.out.println(driver.getWindowHandle());
		driver.quit();
		sa.assertAll();

	}

	@Test
	public void test2() {
		System.out.println("2nd test");
	}

}
