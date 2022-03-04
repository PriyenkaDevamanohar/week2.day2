package SeleniumBasics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		driver.findElement(By.xpath("//input[@class='inputtext _58mg _5dba _2ph-']")).sendKeys("Priyenka");
		driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[2]")).sendKeys("Deva");
		driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[3]")).sendKeys("9787985432");
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("barbie");
		WebElement date = driver.findElement(By.id("day"));
		Select sel = new Select(date);
		sel.selectByValue("10");
		WebElement month = driver.findElement(By.name("birthday_month"));
		Select s = new Select(month);
		s.selectByIndex(2);
		WebElement yea = driver.findElement(By.id("year"));
		Select se = new Select(yea);
		se.selectByVisibleText("2000");
		driver.findElement(By.xpath("//label[@class='_58mt']")).click();

		
		// TODO Auto-generated method stub
 
	}

}
