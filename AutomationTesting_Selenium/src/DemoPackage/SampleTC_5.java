package DemoPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class SampleTC_5 {

	public static void main(String[] args) throws InterruptedException {
		
        System.setProperty("webdriver.chrome.driver", "D:\\Testing Softwares\\chromedriver_win32\\chromedriver.exe");
        
        WebDriver driver = new ChromeDriver();
        
        driver.get("https://www.facebook.com/r.php");
        driver.manage().window().maximize();
        String title = driver.getTitle();
        
        System.out.println("Title of the Web page is:" + " " + title);
        
        //driver.wait();
        
        driver.findElement(By.id("u_0_m_+P")).sendKeys("ABC");
        //driver.findElement(By.xpath("//input[@id='u_0_m_+P']")).sendKeys("ABC");
        driver.findElement(By.xpath("//input[@id='u_0_o_L+']")).sendKeys("Mr");
        driver.findElement(By.xpath("//input[@id='u_0_r_Nb']")).sendKeys("999999999");
        
        
	}

}

