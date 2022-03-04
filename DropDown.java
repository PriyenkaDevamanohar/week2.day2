package SeleniumBasics;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		 ChromeDriver driver=new ChromeDriver();
		 driver.get("http://leafground.com/pages/Dropdown.html");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 WebElement drop1 = driver.findElement(By.id("dropdown1"));
		 Select s = new Select(drop1);
		 s.selectByIndex(2);
		 
		 WebElement drop2 = driver.findElement(By.name("dropdown2"));
		 Select s1 =new Select(drop2);
		 s1.selectByVisibleText("Selenium");
		 
		 WebElement drop3 = driver.findElement(By.id("dropdown3"));
		 Select s2 = new Select(drop3);
		 s2.selectByValue("2");
		 
		 WebElement drop = driver.findElement(By.className("dropdown"));
		 Select dropall = new Select(drop);
		 List<WebElement> listall = dropall.getOptions();
		 int dropcount =listall.size();
		 System.out.println(dropcount);
		 
		 driver.findElement(By.xpath("(//div[@class='example'])[5]")).sendKeys("Selenium");
		 driver.findElement(By.xpath("(//div[@class='example']/select)[6]]")).sendKeys("Selenium");
		 
		 
		 
		 
	}
}
