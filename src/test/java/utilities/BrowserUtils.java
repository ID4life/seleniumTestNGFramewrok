package utilities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrowserUtils {
	
	Alert alert;
	WebDriverWait letswait;
	

	public void switchToAlert() {
		alert = Driver.getDriver().switchTo().alert();	
	}
	public String alertGetText() {
		
		return alert.getText();
	}
	public void alertAccept() {
		
				alert.accept();
	}
	public void alertDismiss() {
		alert.dismiss();
	}
	public void sendKeysOnAlert(String name) {
		alert.sendKeys(name);
	}
	public void waitUntilAlertIsPresent() {
		letswait = new WebDriverWait(Driver.getDriver(),10);
		letswait.until(ExpectedConditions.alertIsPresent());
	}
}
