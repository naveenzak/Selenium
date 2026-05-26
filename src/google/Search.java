package google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Search {
	WebDriver driver;
  @Test
  public void search() {
	  driver.get("https://www.google.com");
	  driver.findElement(By.name("q")).sendKeys("Hari");
  }
  @BeforeTest
  public void beforeTest() {
	  driver = new FirefoxDriver();
	  driver.manage().window().maximize();
  }

 @AfterTest
  public void afterTest() {
	 driver.quit();
  }

}
