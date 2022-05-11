package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.SendKeysAction;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().fullscreen();
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
		driver.findElement(By.xpath("//input[@id=\"createLeadForm_companyName\"]")).sendKeys("ADP");
		driver.findElement(By.xpath("//input[@id=\"createLeadForm_firstName\"]")).sendKeys("Madhusudan");
		driver.findElement(By.xpath("//input[@id=\"createLeadForm_lastNameLocal\"]")).sendKeys("Natarajan");
		driver.findElement(By.xpath("//input[@class=\"smallSubmit\"]")).click();
		
	}

}
