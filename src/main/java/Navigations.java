import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigations {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com");
		driver.navigate().to("https://amazon.com");
		driver.navigate().back();
		driver.navigate().forward();
		Thread.sleep(1000);
		driver.navigate().refresh();
		driver.manage().window().maximize();
		driver.quit();
	}

}
