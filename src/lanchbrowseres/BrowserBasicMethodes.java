package lanchbrowseres;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserBasicMethodes {
	public static void main(String[] args) throws InterruptedException {
   WebDriver driver = new ChromeDriver();
   driver.manage().window().maximize();
  // driver.manage().window().minimize();
   Thread.sleep(3000);
  // driver.close();
   driver.quit();
		
		
	}

}
