package SeleniumBasics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		 ChromeDriver driver=new ChromeDriver();
		 driver.get("http://leaftaps.com/opentaps/control/main");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 WebElement elementuser = driver.findElement(By.id("username"));
		 elementuser.sendKeys("Demosalesmanager");
		 WebElement elementpwd = driver.findElement(By.id("password"));
		 elementpwd.sendKeys("crmsfa");
		 WebElement loginbutton = driver.findElement(By.className("decorativeSubmit"));
		 loginbutton.click();
		 WebElement link = driver.findElement(By.linkText("CRM/SFA"));
		 link.click();
		 WebElement leadtab = driver.findElement(By.linkText("Leads"));
		 leadtab.click();
		 driver.findElement(By.linkText("Find Leads")).click();
		 driver.findElement(By.linkText("Phone")).click();
		// driver.findElement(By.xpath("(//span[@class='x-tab-strip-text'])[2]")).click();
		// driver.findElement(By.xpath("//input[@class='x-form-text x-form-field']")).sendKeys("9");
		 driver.findElement(By.name("phoneNumber")).sendKeys("97");
		// driver.findElement(By.xpath("//input[@class='x-form-text x-form-field'][1]")).sendKeys("813");
		 //driver.findElement(By.xpath("//input[@class='x-form-text x-form-field'][1]")).sendKeys("3369355");
		 Thread.sleep(2000);
		 WebElement button = driver.findElement(By.xpath("(//button[@class='x-btn-text'])[7]"));
		 button.click();
		 Thread.sleep(2000);
		 
		 WebElement del=driver.findElement(By.xpath("(//a[@class='linktext'])[4]"));
		 String x=del.getText();
		 System.out.println(x);
		 del.click();
		 driver.findElement(By.className("subMenuButtonDangerous")).click();
		 //Thread.sleep(2000);
		 driver.findElement(By.linkText("Find Leads")).click();
		// driver.findElement(By.xpath("//a[@class='selected']")).click();
		 driver.findElement(By.name("id")).sendKeys(x);
		 //driver.findElement(By.xpath("(//input[@class='x-form-text x-form-field'])[24]")).sendKeys(x);
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("(//button[@class='x-btn-text'])[7]")).click();
		 Thread.sleep(2000);
		//WebElement res=driver.findElement(By.xpath("//div[@class='x-paging-info']"));
		

		
		if(driver.getPageSource().contains("No records to display"))
		{
			System.out.println("Deleted");
		}
		else {
			System.out.println("Not Deleted");
		}
		 
		 driver.close();
		 

		 

		 
		 
		 
	}

}
