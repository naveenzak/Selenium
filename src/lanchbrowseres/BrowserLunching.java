package lanchbrowseres;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class BrowserLunching {

	public static void main(String[] args) throws InterruptedException {
		//WebDriver driver = new ChromeDriver();
		//WebDriver driver = new EdgeDriver();
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redmine.org/");
		Thread.sleep(2000);
		driver.navigate().to("https://www.techlearn.in/");
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(1000);
		driver.quit();
		
		
		
		
		
		
		

	}
	
	
		
}






