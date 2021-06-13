import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumConcept {
	public static void main(String [] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") +"\\drivers\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("http://amazon.com");
		driver.manage().window().maximize();
		WebElement searchbox= driver.findElement(By.id("twotabsearchtextbox"));
		searchbox.sendKeys("Books");
		System.out.println(searchbox.getAttribute("value"));
		WebElement search_button=driver.findElement(By.id("nav-search-submit-button"));
		search_button.click();
		Thread.sleep(2000);
		takesnapShot(driver, "D://Test.png");
		driver.close();
	

}
	
	public static void takesnapShot(WebDriver driver,String Filepath) throws IOException {
		TakesScreenshot scrshot= ((TakesScreenshot)driver);
		
		File srcfile= scrshot.getScreenshotAs(OutputType.FILE);
		File destFile= new File(Filepath);// to move screenshot to destination
		// copy image
	    FileUtils.copyFile(srcfile, destFile);
		
	}
}