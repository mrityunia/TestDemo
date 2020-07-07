package common;

import org.testng.annotations.BeforeTest;

public class BaseTest extends BasePage {

	private String url="http://the-internet.herokuapp.com/";
	
	
@BeforeTest()
public void initilize() {
	super.openUrl(url);	
	
}
	
}
