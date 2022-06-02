package week5day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Snadeal {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		ChromeOptions option= new ChromeOptions();
		//option.addArguments("--disable-notifications-");
		option.setHeadless(true);
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		
		WebElement Mens=driver.findElement(By.xpath("//span[@class='catText']"));
		Actions act=new Actions(driver);
		act.moveToElement(Mens).perform();
		driver.findElement(By.xpath("//span[@class='linkTest']")).click();
		
		String title = driver.getTitle();
		System.out.println(title);
		String title1="Sports Shoes For Men - Upto 70% OFF on Top Shoe Brands";
		if (title==title1) {
			System.out.println("correct title");
		}
		else {
			System.out.println("incorrect title");
		}
	}

}
