package common;

import org.openqa.selenium.WebDriver;

public class HomePage  extends BasePage{
	
	public HomePage(WebDriver driver){
		
		super(driver);
	}
	
	
	public String getTtile()  {
		
		try {
			System.out.println("Title of the page is "+driver.getCurrentUrl());
			return driver.getTitle();
			
		}
		catch(Exception ex) {
			return null;
		}
		
		
	}
}
