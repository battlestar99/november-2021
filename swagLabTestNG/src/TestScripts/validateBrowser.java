package TestScripts;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class validateBrowser {
	
	
	
	
	@Parameters({"browser"})
	@Test
	
	public void browserTest(String browser) {
		
		if(browser=="mozila") {
			
			// write code to open mozila firefox
			
		}
		
      if(browser=="chrome") {
			
			// write code to open chrome brwoser 
			
		}
		
      if(browser=="IE") {
			
			// write code to open internet explorer brwoswer 
			
		}
		
		
		
		
	}

}
