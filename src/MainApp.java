import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class MainApp {
	public static void main(String[] args) throws InterruptedException {
		String exePath = "C:\\Users\\Downloads\\chromedriver_win32_2_25\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		DesiredCapabilities capabilities=DesiredCapabilities.chrome();
		WebDriver driver = new ChromeDriver(capabilities);
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		driver.get("https://www.google.com");
		Thread.sleep(2000);
		driver.quit();
	}
}
