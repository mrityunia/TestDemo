package common;

import org.testng.Assert;
import org.testng.annotations.Test;


public class HomeTest  extends BaseTest{
	
@Test
// to verify the page is loading properly
public void ValidateHomePage() {
	// validate title 
	String titleOfHomePage="The Internet";
	Assert.assertEquals(new HomePage().getTtile(), titleOfHomePage);
			
}
	
}
