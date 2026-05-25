package lanchbrowseres;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LaunchEdgeBrowser {
	WebDriver driver;

	@Test
	public void edge() {
		driver.get("https://www.google.com");
	}

	@BeforeTest
	public void beforeTest() {
		driver = new EdgeDriver();
		driver.manage().window().maximize();
	}

}
