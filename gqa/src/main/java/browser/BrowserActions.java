package browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import helpers.ConfigPropertyHelper;

public class BrowserActions {
WebDriver driver;
public static String AppURL = (ConfigPropertyHelper.getConfiguration("webURL")).replace("\"", "");
public BrowserActions(WebDriver driver) {
	this.driver = driver;
}
public void openApp() {
	driver.get(AppURL);
}
public void closeCurrentWindow() {
	driver.close();
}
public void closeAllWindows() {
	driver.quit();
}
public void clickOnElement(WebElement element) {
	element.click();
}
}
