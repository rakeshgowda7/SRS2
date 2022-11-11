package Test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Generic.Baseclass;
import POM.AlertPage1;

public class AlertPage extends AlertPage1 {
	WebDriver driver;
	@Test
	public void Open_App() {
		Open_App();
	}
AlertPage1 ap = new AlertPage1(driver);

}

