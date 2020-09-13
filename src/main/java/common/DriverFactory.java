package common;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class DriverFactory {
	
	
public WebDriver getDriver(String browsername) {
	//WebDriver driver;
	RemoteWebDriver driver=null;
	
	if("chrome".equalsIgnoreCase(browsername)) {
		
		//System.setProperty("webdriver.chrome.driver","chromedriver");
		//ChromeOptions chromeOptions = new ChromeOptions();
		//chromeOptions.addArguments("--headless");
		
		//URL url;
//		try {
//			url = new URL("http://localhost:4444/wd/hub");
//			DesiredCapabilities capbility = DesiredCapabilities.chrome();
//			driver= new RemoteWebDriver(url,capbility);
//			
//			//driver=new ChromeDriver();
//			
//		} catch (MalformedURLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		driver=new ChromeDriver();
		
	}
	else {
		
		driver=new ChromeDriver();
	}
	return driver;
}

}
