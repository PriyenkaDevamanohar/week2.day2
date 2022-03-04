package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Editlead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		 ChromeDriver driver=new ChromeDriver();
		 driver.get("http://leaftaps.com/opentaps/control/main");
		 driver.manage().window().maximize();
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
		 WebElement createlead = driver.findElement(By.linkText("Create Lead"));
		 createlead.click();
		 WebElement companyname = driver.findElement(By.className("inputBox"));
		 companyname.sendKeys("TCS");
		 WebElement firstname = driver.findElement(By.id("createLeadForm_firstName"));
		 firstname.sendKeys("Priyenka");
		 WebElement lastname = driver.findElement(By.id("createLeadForm_lastName"));
		 lastname.sendKeys("Devamanohar");
		 driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Testing");
		
		WebElement desc= driver.findElement(By.id("createLeadForm_description"));
		desc.sendKeys("First automation exercise");
		 driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("preeya.deva@gmail.com");
	     WebElement pro =  driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));         
		 Select province = new Select(pro);
		 province.selectByVisibleText("New York");
		 WebElement submit = driver.findElement(By.className("smallSubmit"));
		 submit.click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateLeadForm_description")).clear();
		
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("It is an important note");
		driver.findElement(By.className("smallSubmit")).click();
		System.out.println(driver.getTitle());
		
		 
	}

}
