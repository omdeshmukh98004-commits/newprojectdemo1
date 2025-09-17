package webauto;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class privateclass {
	
	
	@Test
	public void validatePrivateclass() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.srnawalespapad.co.in/contact-sr-nawales-papad/");
		driver.close();
	}
	

}
