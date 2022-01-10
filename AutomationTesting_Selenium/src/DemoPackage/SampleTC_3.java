package DemoPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleTC_3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Testing Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://ezeees.testrail.com/");
		driver.manage().window().maximize();
		
		String expectedTitle = "Login - TestRail";
		String actualTitle = driver.getTitle();
		System.out.println("The page title is : " + actualTitle);
		
		
		if (actualTitle.contentEquals(expectedTitle)) {
			
		System.out.println("Title matched");
		
		driver.findElement(By.id("name")).sendKeys("nagalakshmi@risecorp.com");
		driver.findElement(By.id("password")).sendKeys("Rise@123");
		driver.findElement(By.id("button_primary")).click();
		
		System.out.println("Login Successful");
		
		}
		
		else {
	    System.out.println("Title doesn't matched");
		}
		driver.quit();
		

	}

}
