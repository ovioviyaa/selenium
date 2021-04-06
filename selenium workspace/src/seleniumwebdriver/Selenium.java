package seleniumwebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {

public static void main(String[] args)  {
		System.setProperty("webdriver.chrome.driver","D:\\chrome version\\chromedriver.exe");
         WebDriver driver = new ChromeDriver();
         driver.get("https://opensource-demo.orangehrmlive.com/");
         driver.manage().window().maximize();
         String beforetitle=driver.getTitle();
         System.out.println(beforetitle);
         driver.findElement(By.id("txtUsername")).sendKeys("Admin");
         driver.findElement(By.id("txtPassword")).sendKeys("admin123");
         driver.findElement(By.id("btnLogin")).click();
         String aftertitle = driver.getTitle();
         System.out.println(aftertitle);
       if(beforetitle.equals(aftertitle))
         {
             System.out.println("Title is same");
             driver.findElement(By.id("welcome")).click();
             
            driver.findElement(By.xpath("//*[@id='welcome-menu']/ul/li[2]/a")).click();
           
             driver.close();
         }
		else
		{
			System.out.println("Title is not same");
			driver.close();
		}
	}

}
