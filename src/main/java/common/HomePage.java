package common;

public class HomePage  extends BasePage{
	
	
	public String getTtile()  {
		
		try {
			Thread.sleep(5000);
			System.out.println("Title of the page is "+driver.getTitle());
			return driver.getTitle();
			
		}
		catch(Exception ex) {
			return null;
		}
		
		
	}
}
