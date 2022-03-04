package SeleniumBasics;

import java.time.Duration;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Links {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		 ChromeDriver driver=new ChromeDriver();
		 driver.get("http://leafground.com/pages/Link.html");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.findElement(By.linkText("Go to Home Page")).click();
		 driver.findElement(By.xpath("(//img[@class='wp-categories-icon svg-image'])[3]")).click();
		 System.out.println(driver.findElement(By.linkText("Find where am supposed to go without clicking me?")).getAttribute("href"));
		System.out.println("Verify i am broken " + driver.findElement((By.xpath("(//div[@class='large-6 small-12 columns']/a)[3]"))).getAttribute("href"));
		int j=0;
		List<WebElement> LinkNameElements=driver.findElements(By.xpath("//div[@class='large-6 small-12 columns']/a"));
		
		for(int i=0;i< LinkNameElements.size();i++)
		{
			System.out.println(LinkNameElements.get(i).getAttribute("href"));
		
		j =i;
		
	}
System.out.println("Total links " + j);
driver.navigate().to(driver.findElement((By.xpath("(//div[@class='large-6 small-12 columns']/a)[3]"))).getAttribute("href"));
}}
