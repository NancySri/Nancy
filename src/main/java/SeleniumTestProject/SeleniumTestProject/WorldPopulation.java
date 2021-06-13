package SeleniumTestProject.SeleniumTestProject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorldPopulation {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String today_data="//div[contains(text(),'Today')]/parent::div//span[@class='rts-counter']";
         String thisyear_data="//div[contains(text(),'This year')]/parent::div//span[@class='rts-counter']";
     	 System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\drivers\\chromedriver.exe");
         WebDriver driver= new ChromeDriver();
         driver.manage().window().maximize();
         driver.get("https://www.worldometers.info/world-population/");
         WebElement population_data=driver.findElement(By.xpath("//div[@class='maincounter-number']"));
         String popdata=population_data.getText();
         System.out.println("Population data is "+popdata);
         getdata(today_data, driver);
         System.out.println("*******");
         getdata(thisyear_data, driver);
         driver.close();
	}
	
	
	
	public static void getdata(String locator,WebDriver driver) {	
	    int count=1;
		while(count<20) {
		 List <WebElement> poplist=driver.findElements(By.xpath(locator));
		 for(WebElement e:poplist) {
        	 System.out.println("Data is "+e.getText());
        	 count++;
         }
		}
		
	}

}
