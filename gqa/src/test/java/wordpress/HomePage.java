package wordpress;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HomePage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().browserVersion("131").setup();
WebDriver driver = new ChromeDriver();

	}

}
