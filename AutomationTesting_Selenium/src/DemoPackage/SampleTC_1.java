package DemoPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleTC_1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Testing Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.get("https://google.com");
		driver.navigate().to("https://google.com");
		//driver.get("https://ezeees.testrail.com/");
		driver.quit();
		System.out.println("Web page loaded successfully");
		
	}

}
