package common;

import org.openqa.selenium.WebDriver;

public class BasePage {

	protected static WebDriver driver;
	
	BasePage(){
		DriverFactory factory= new DriverFactory();
		driver=factory.getDriver("chrome");
		
	}
	
	public void openUrl(String url) {
		driver.get(url);
	}
	
	
}
