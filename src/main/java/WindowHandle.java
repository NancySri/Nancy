import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com");
		driver.navigate().to("http://demo.guru99.com/popup.php");
		driver.manage().window().maximize();
		WebElement ClickHere = driver.findElement(By.xpath("//a[contains(text(),'Click Here')]"));
		ClickHere.click();
		Set<String> winhandle= driver.getWindowHandles();
		Iterator <String> it=winhandle.iterator();
		String parentwindowid=it.next();
		System.out.println("Parent Window Id: "+parentwindowid);		
		String childwindowid=it.next();
		System.out.println("Child Window Id: "+childwindowid);
		driver.switchTo().window(childwindowid);
		Thread.sleep(1000);
		System.out.println("Child Window Title: "+ driver.getTitle());   
		driver.close();
		driver.switchTo().window(parentwindowid);
		Thread.sleep(1000);
		System.out.println("Parent Window Title: "+ driver.getTitle());
		driver.close();
	}

}
