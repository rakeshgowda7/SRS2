package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AlertPage1 {
	@FindBy(xpath = "//button[@onclick='jsAlert()']")
	private WebElement JsAlert;
	@FindBy(xpath = "//p[@id='result']")
	private WebElement result;

	public AlertPage1(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// utilization
	public void alertClick() {
		JsAlert.click();
	}

	public void alertGetText() {
		result.getText();
	}
}
