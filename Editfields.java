package SeleniumBasics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Editfields {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		 ChromeDriver driver=new ChromeDriver();
		 driver.get("http://leafground.com/pages/Edit.html");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.findElement(By.id("email")).sendKeys("Priyenka");
		 driver.findElement(By.xpath("//input[@value='Append ']")).sendKeys("Today",Keys.TAB);
		 System.out.println(driver.findElement(By.name("username")).getAttribute("value"));
		 driver.findElement(By.xpath("//input[@value='Clear me!!']")).clear();
		 System.out.println(driver.findElement(By.xpath("//input[@disabled='true']")).isEnabled());
		
		 
		 
		
		 
	}

}
