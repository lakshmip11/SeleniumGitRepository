package DemoPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleTC_2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Testing Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://ezeees.testrail.com/");
		driver.manage().window().maximize();
		
		String title = driver.getTitle();
		System.out.println("The page title is : " + title);
		
		driver.findElement(By.id("name")).sendKeys("nagalakshmi@risecorp.com");
		driver.findElement(By.id("password")).sendKeys("Rise@123");
		driver.findElement(By.id("button_primary")).click();
		
		
		
		driver.quit();
		System.out.println("Login successful");

	}

}
