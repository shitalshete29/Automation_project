package validate;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class validate_AboutUs {
	
	@Test
	public void validateAboutPage()
	{
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.puneripattern.com/about-us/");
		driver.close();
	}

}
