package SeleniumBasics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Buttonfields {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		 ChromeDriver driver=new ChromeDriver();
		 driver.get("http://leafground.com/pages/Button.html");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.findElement(By.xpath("//button[@id='home']")).click();
		 driver.findElement(By.xpath("(//a[@class='wp-categories-link maxheight'])[2]")).click();
		 System.out.println("The position is" + driver.findElement(By.id("position")).getLocation());
		System.out.println("The background color is:" + driver.findElement(By.id("color")).getCssValue("background-color"));
		System.out.println("The height is" + driver.findElement(By.id("size")).getSize().getHeight());
		System.out.println("The Width is" + driver.findElement(By.id("size")).getSize().getWidth());

		

	}

}
