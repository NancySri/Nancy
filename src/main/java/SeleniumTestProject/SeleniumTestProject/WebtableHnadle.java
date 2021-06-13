package SeleniumTestProject.SeleniumTestProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebtableHnadle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		// *[@id="customers"]/tbody/tr[2]/td[1]
		String before_xpath = "//*[@id=\"customers\"]/tbody/tr[";
		String after_xpath = "]/td[1]";
		for (int i = 2; i <= 7; i++) {
			String xpath = before_xpath + i + after_xpath;
			WebElement rows = driver.findElement(By.xpath(xpath));
			String rowvalue = rows.getText();
			System.out.println("Company Name is: "+rowvalue);
			//if(rowvalue.equals("Ernst Handel")) {
			String middle_xpath="]/td[";
			String after_xpathnew="]";
			for(int j=2;j<=3;j++) {
			String newxpath=before_xpath + i +middle_xpath+j+after_xpathnew;
			WebElement column = driver.findElement(By.xpath(newxpath));
			String colvalue = column.getText();
			System.out.println(colvalue);
				/*WebElement contact= driver.findElement(By.xpath("//*[@id=\"customers\"]/tbody/tr[4]/td[2]"));
				System.out.println("Company named "+rowvalue+" has Contact value: "+contact.getText());
				WebElement country=driver.findElement(By.xpath("//*[@id=\"customers\"]/tbody/tr[4]/td[3]"));
				System.out.println("Company named "+rowvalue+" has Country value: "+country.getText());
				break;*/
			}
		}
		driver.close();
		}
		
		
	}


