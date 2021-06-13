package SeleniumTestProject.SeleniumTestProject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\drivers\\chromedriver.exe");
		// driver = new ChromeDriver();
		// System.setProperty("webdriver.chrome.driver","./src/main/resources/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/web-table-element.php");
		// driver.get("https://demoqa.com/books");
		// String webtable="//div[@class='ReactTable -striped -highlight']";
		// List<WebElement>
		// noofimages=driver.findElements(By.xpath("//div[@class='rt-table']//following::div[@class='rt-td']/img"));
		// System.out.println(noofimages.size());
		// List<WebElement>
		// author=driver.findElements(By.xpath("//div[@class='rt-table']//following::div[@class='rt-tbody']//div[@class='rt-td'][3]"));
		// for(int i=0;i<author.size();i++){
		// String authorname=author.get(i).getText();
		// System.out.println("Author Name is" +authorname);
		// }

		// How to get dynamic web table total no of rows and columns
		List<WebElement> col = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/thead/tr/th"));
		System.out.println("Total no of columns:" + " " + col.size());
		List<WebElement> row = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr/td[1]"));
		System.out.println("Total no of rows:" + " " + row.size());

		// How to get data from a particular row , cell data.
		WebElement row_particular = driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[6]"));
		System.out.println("Cell value is " + row_particular.getText());
		WebElement celldata = driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[6]/td[4]"));
		String cellvalue = celldata.getText();
		System.out.println(" 4th Cell data value is " + cellvalue);
        //Dynamic webtable handling
		
		
		driver.close();
	}
}
