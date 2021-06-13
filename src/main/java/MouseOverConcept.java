import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOverConcept {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://spicejet.com");
		driver.manage().window().maximize();
		WebElement AddOn = driver.findElement(By.xpath("//a[contains(text(),'Add-Ons')]"));
		WebElement SpiceMax = driver.findElement(By.xpath("//a[contains(text(),'SpiceMAX')]"));
		Actions action = new Actions(driver);
		action.clickAndHold(AddOn).moveToElement(SpiceMax).click();
		driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
		driver.quit();
	}

}
