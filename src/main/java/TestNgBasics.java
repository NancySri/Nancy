import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgBasics {
	
	@BeforeSuite
	public void setup() {
		System.out.println(" SETUP PROPERTY FOR CHROME BROWSER");
	}
	@BeforeTest
	public void logintoapp() {
		System.out.println(" Login to application");
	}
	@BeforeClass
	public void launchbrowser() {
		System.out.println(" Launch Chrome Browser");
	}
	
	@BeforeMethod
	public void login(){
		System.out.println("Login to app ");
	}
	
	@Test(priority=1,groups="Title")
	public void googletitletest(){
		System.out.println(" Test Google title ");
	}
	
	@Test(priority=2, groups="Login")
	public void enterusername(){
		System.out.println(" Enter Username: ");
	}
	
	@Test(priority=3, groups="Title")
	public void enterpassword(){
		System.out.println(" Enter Password: ");
	}
	
	@Test(priority=4, groups="Title")
	public void entervalue(){
		System.out.println(" Enter Value: ");
	}
	
	@Test(priority=5, groups="Login")
	public void test(){
		System.out.println(" Enter Test: ");
	}
	
	
	@AfterMethod
	public void logout(){
		System.out.println("Logout Application: ");
	}
		
	@AfterClass
	public void closeBrowser(){
		System.out.println(" Close Browser ");
	}
	@AfterTest
	public void deleteAllCookies(){
		System.out.println(" Delete All Cookies");
	}
	
	@AfterSuite
	public void generatetestreport(){
		System.out.println(" Generate Test Report  ");
	}
	
	

}
