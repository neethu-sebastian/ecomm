package wordpress;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import browser.BrowserActions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HomePage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().browserVersion("131").setup();
WebDriver driver = new ChromeDriver();
BrowserActions commons = new BrowserActions(driver);
commons.openApp();
WebElement loginButton = driver.findElement(By.xpath("//a[contains(text(), 'Log in')]"));
commons.clickOnElement(loginButton);
commons.closeAllWindows();
	}

}
