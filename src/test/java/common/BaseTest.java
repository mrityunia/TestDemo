package common;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest  {
	
	protected  WebDriver driver;

	private String url="http://the-internet.herokuapp.com/";
	
	
@BeforeTest()
public void initilize() {
	driver= new DriverFactory().getDriver("chrome");
	new BasePage(driver).openUrl(url);
	
}
@AfterTest()
public void cleanp() {
	
	driver.close();
	driver.quit();
}
	
}
