package ABC;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnG {

		static WebDriver driver;
	
		@Test
		public void learnJS() throws InterruptedException{
	
		//System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		//driver.get("https://www.dell.com/en-us");
		driver.get("https://www.makemytrip.com/");
}
}
