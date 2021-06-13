package SeleniumTestProject.SeleniumTestProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewCodingChallenge {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.worldometers.info/world-population/");
		WebElement population_count= driver.findElement(By.xpath("//span[@class='rts-counter']"));
		System.out.println("Current World Population is: "+population_count.getText());
		WebElement birth_count= driver.findElement(By.xpath("//span[@rel='births_today']"));
		System.out.println("Current World Population Birth Count is: "+ birth_count.getText());
		WebElement death_count = driver.findElement(By.xpath("//span[@rel='births_today']"));
		System.out.println("Current World Population Birth Count is: "+ death_count.getText());
		driver.close();

	}
}
