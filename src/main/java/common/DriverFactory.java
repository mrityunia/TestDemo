package common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverFactory {
	
	
public WebDriver getDriver(String browsername) {
	WebDriver driver;
	
	if("chrome".equalsIgnoreCase(browsername)) {
		
		System.setProperty("webdriver.chrome.driver","chromedriver");
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--headless");
		driver=new ChromeDriver(chromeOptions);
	}
	else {
		
		driver=new ChromeDriver();
	}
	return driver;
}

}
