package SeleniumBasics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testui {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		 ChromeDriver driver=new ChromeDriver();
		 driver.get("https://acme-test.uipath.com/login");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// TODO Auto-generated method stub
		 driver.findElement(By.id("email")).sendKeys("kumar.testleaf@gmail.com");
		 driver.findElement(By.id("password")).sendKeys("leaf@12");
		 driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		 System.out.println(driver.getTitle());
		 driver.findElement(By.linkText("Log Out")).click();
		 driver.close();
		 
	}

}
