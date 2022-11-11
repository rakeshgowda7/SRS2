package Generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Baseclass {
	WebDriver driver;

//	@BeforeMethod
	public void OpenApp() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\asrak\\\\Desktop\\\\Drivers\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");

	}

//	@AfterMethod
	public void CloseApp() {
		driver.quit();
	}

	@BeforeClass
	public void test1() {
		System.out.println("Before class");

	}

	@AfterClass
	public void test2() {
		System.out.println("After class");

	}

	@BeforeTest
	public void test3() {
		System.out.println("Before test");

	}

	@AfterTest
	public void test4() {
		System.out.println("After Test");

	}

	@BeforeMethod
	public void test5() {
		System.out.println("Before Method");

	}

	@AfterMethod
	public void test6() {
		System.out.println("After Method");

	}

	@Test
	public void test() {
		System.out.println("This is sample program");

	}

	@Test
	public void test7() {
		System.out.println("This is sample program 2");

	}

	@Test
	public void test8() {
		System.out.println("This is sample program 3");

	}

}
