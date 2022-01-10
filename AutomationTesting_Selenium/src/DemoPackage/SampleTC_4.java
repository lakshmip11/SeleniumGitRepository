package DemoPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleTC_4 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Testing Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		
		System.out.println("Web page title is" + " " + title);

		driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
		
		driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("rajendra.saps@gmail.com");
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("Anish@1234");
		driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
		
		String username = driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']")).getText();
		System.out.println("Account details" + "-" + username);
		
		driver.findElement(By.xpath("//a[contains(text(),\"Today's Deals\")]")).click();
		driver.findElement(By.xpath("//span[contains(text(),\"Today's Deals\")]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Sign up')]")).click();
				
		
		//driver.close();
		//driver.quit();
	}

}
