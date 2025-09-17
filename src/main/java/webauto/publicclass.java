package webauto;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class publicclass {
	
	@Test
	public void validatePublicclass() {
		
	WebDriver driver = new FirefoxDriver();
	
	driver.manage().window().maximize();
	driver.get("https://www.srnawalespapad.co.in/contact-sr-nawales-papad/");
	driver.close();
	}
	

}
