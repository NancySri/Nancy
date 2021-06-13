import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {

	public static void main(String[] args) {
		//System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir") +"\\drivers\\geckodriver.exe");
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		String title=driver.getTitle();
		System.out.println(title);
		if(title.contains("Google")) {
			System.out.println("Title is correct");
		}
		else {
			System.out.println("Title is incorrect");
		}		
		System.out.println(driver.getCurrentUrl());
		//System.out.println(driver.getPageSource());
		WebElement signin= driver.findElement(By.xpath("//input[@name='proceed']"));
		signin.click();
		Alert alert=driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();		
		driver.close();

	}

}
