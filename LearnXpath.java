package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		 ChromeDriver driver=new ChromeDriver();
		 driver.get("http://leaftaps.com/opentaps/control/main");
		 driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
		 driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		 driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		 driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
		 driver.findElement(By.xpath("//a[text()='Leads']" )).click();
		 driver.findElement(By.xpath("//a[text()='Create Lead']" )).click();
		 driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("TCS");

		 driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Pri");
		 driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Deva");
		 driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();


		 


		 

		 

				 
	}

}
